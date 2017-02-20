
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Anku
 */
public class MenuPanel extends JPanel {

    private JTextField input;
    private JTextField output;
    private CalculatorLogic logic;

    public MenuPanel(JTextField input, JTextField output) {
        super(new GridLayout(1, 3));
        this.input = input;
        this.output = output;
        this.logic = new CalculatorLogic();
        createComponents();

    }

    private void createComponents() {
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        final JButton zed = new JButton("Z");
        zed.setEnabled(false);

        plus.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int n1 = Integer.parseInt(input.getText());
                    int n2 = Integer.parseInt(output.getText());
                    output.setText(Integer.toString(logic.add(n1, n2)));

                    if (output.getText().equals("0")) {
                        zed.setEnabled(false);
                    } else {
                        zed.setEnabled(true);
                    }
                } catch (NumberFormatException ex) {
                }

                input.setText("");
            }
        });

        minus.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int n2 = Integer.parseInt(input.getText());
                    int n1 = Integer.parseInt(output.getText());
                    output.setText(Integer.toString(logic.substract(n1, n2)));

                    if (output.getText().equals("0")) {
                        zed.setEnabled(false);
                    } else {
                        zed.setEnabled(true);
                    }
                } catch (NumberFormatException ex) {
                }
                input.setText("");
            }
        });

        zed.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                output.setText("0");
                input.setText("");
                zed.setEnabled(false);
            }
        });

        this.add(plus);
        this.add(minus);
        this.add(zed);
    }

}
