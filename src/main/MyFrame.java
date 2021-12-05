package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;

    MyFrame() {
        button = new JButton();
        button.setBounds(150, 150, 200, 50);
        button.setText("You see a fish");
        button.setFont(new Font("Calibri", Font.BOLD, 25));
        button.setForeground(Color.BLACK);
        button.setFocusable(false);
        button.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(new Dimension(500, 500));
        this.setMinimumSize(new Dimension(300, 400));
        this.setLocationRelativeTo(null);
        this.setTitle("This is a bird");
        this.setVisible(true);
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            NewWindow myWindow = new NewWindow();
        }
    }
}
