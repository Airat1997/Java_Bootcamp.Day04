package edu.school21.printer.app;

import edu.school21.printer.logic.Printer;
import edu.school21.printer.logic.Reader;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Reader reader = new Reader("resources/it.bmp");
        BufferedImage image = reader.read();
        Printer printer = new Printer(image);
        printer.printer();
    }
}
