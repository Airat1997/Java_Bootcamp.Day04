package edu.school21.printer.logic;

import java.awt.image.BufferedImage;

public class Printer {

    final BufferedImage image;

    public Printer(BufferedImage image) {
        this.image = image;
    }

    public void printer() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < image.getHeight(); i++) {
            for (int j = 0; j < image.getWidth(); j++) {
                int color = image.getRGB(j, i);
                if (color == -16777216) {
                    sb.append('0');
                } else {
                    sb.append('.');
                }
            }
            sb.append('\n');
        }
        System.out.print(sb.toString());
    }
}
