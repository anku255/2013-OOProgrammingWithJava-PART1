package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Title");
        frame.setPreferredSize(new Dimension(600, 400));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        
        JTextField textAreatop = new JTextField("");
        JButton copyButton = new JButton("Copy!");
        JLabel textLabelBottom = new JLabel();
        
        ActionEventListener copier = new ActionEventListener(textAreatop, textLabelBottom);
        copyButton.addActionListener(copier);
                
                
        container.add(textAreatop);
        container.add(copyButton);
        container.add(textLabelBottom);
    }
}
