package com;

import java.awt.GraphicsEnvironment;

public class MyImage {
    private String filename;

    // Default constructor
    public MyImage() {
        this.filename = "default_image.jpg";  // Default filename
    }

    // Constructor with filename
    public MyImage(String filename) {
        this.filename = filename;
    }

    public void display() {
        if (GraphicsEnvironment.isHeadless()) {
            System.out.println("Displaying image without GUI: " + filename);
        } else {
            System.out.println("Displaying image with GUI: " + filename);
        }
    }
}