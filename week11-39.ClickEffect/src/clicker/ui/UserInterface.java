package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator calculator;
    
    public UserInterface(Calculator calculator)
    {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        
        GridLayout layout = new GridLayout(2, 0);
        container.setLayout(layout);
        
        JLabel count = new JLabel("0");
        JButton click = new JButton("Click!");
        
        ClickListener listener = new ClickListener(calculator, count);
        click.addActionListener(listener);
        
        container.add(count);
        container.add(click);
        
    }

    public JFrame getFrame() {
        return frame;
    }
}
