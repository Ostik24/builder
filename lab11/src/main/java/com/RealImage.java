package com;

import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class RealImage implements MyImage {
    private String filename;
    private JFrame frame;

    public RealImage(String filename) {
        this.filename = filename;
        if (GraphicsEnvironment.isHeadless()) {
            loadFromDisk();
        } else {
            setupGUI();
        }
    }

    private void loadFromDisk() {
        System.out.println("Loading image: " + filename);
    }

    private void setupGUI() {
        frame = new JFrame();
        ImageIcon icon = new ImageIcon(filename);
        JLabel label = new JLabel(icon);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
    }

    @Override
    public void display() {
        if (frame != null) {
            frame.setVisible(true);
        } else {
            System.out.println("Displaying image: " + filename);
        }
    }
}