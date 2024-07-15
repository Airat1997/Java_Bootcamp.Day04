package edu.school21.printer.logic;

import com.diogonunes.jcdp.color.ColoredPrinter;
import com.diogonunes.jcdp.color.api.Ansi;
import com.diogonunes.jcdp.color.api.Ansi.Attribute;
import com.diogonunes.jcdp.color.api.Ansi.FColor;
import java.awt.Color;
import java.awt.image.BufferedImage;

public class Printer {

    final BufferedImage image;

    public Printer(BufferedImage image) {
        this.image = image;
    }

    public void printer(String white, String black) {
        ColoredPrinter coloredPrinter = new ColoredPrinter();
        for (int i = 0; i < image.getHeight(); i++) {
            for (int j = 0; j < image.getWidth(); j++) {
                int color = image.getRGB(j, i);
                if (color == Color.WHITE.getRGB()) {
                    coloredPrinter.print(" ", Attribute.NONE, FColor.NONE,
                            Ansi.BColor.valueOf(white));
                } else {
                    coloredPrinter.print(" ", Attribute.NONE, FColor.NONE,
                            Ansi.BColor.valueOf(black));
                }
            }
            System.out.println();
        }
    }
}
