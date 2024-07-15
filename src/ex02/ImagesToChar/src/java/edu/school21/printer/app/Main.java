package edu.school21.printer.app;

import edu.school21.printer.logic.Args;
import edu.school21.printer.logic.Printer;
import edu.school21.printer.logic.Reader;
import java.awt.image.BufferedImage;
import java.io.IOException;
import com.beust.jcommander.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Reader reader = new Reader("resources/it.bmp");
        BufferedImage image = reader.read();
        Printer printer = new Printer(image);
        Args args1 = new Args();
        JCommander.newBuilder().addObject(args1).build().parse(args);
        printer.printer(args1.getWhite(), args1.getBlack());
    }

}

