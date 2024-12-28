package com;

import java.awt.GraphicsEnvironment;

public interface MyImage {
    private String filename;

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