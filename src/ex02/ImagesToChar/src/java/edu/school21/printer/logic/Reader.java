package edu.school21.printer.logic;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Reader {

    final public String path;

    public Reader(String path) {
        this.path = path;
    }

    public BufferedImage read() throws IOException {
        File file = new File(path);
        return ImageIO.read(file);
    }
}
