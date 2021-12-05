package main;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class NewWindow extends JFrame {
    JLabel label;
    Random random = new Random();

    NewWindow() {
        label = new JLabel("My");
        label.setBounds(100, 100, 200, 50);
        label.setFont(new Font("Calibri", Font.ITALIC, 50));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(new Dimension(360, 360));
        this.setLocation(random.nextInt(800), random.nextInt(500));
        this.setMinimumSize(new Dimension(300, 300));
        this.setTitle("My");
        this.setVisible(true);
        this.add(label);
    }
}
