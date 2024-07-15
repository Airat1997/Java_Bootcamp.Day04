package edu.school21.printer.logic;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import java.util.ArrayList;
import java.util.List;

@Parameters(separators = "=")
public class Args {
    @Parameter(names = {"--white"}, description = "Change white color")
    private String white;

    @Parameter(names = {"--black"}, description = "Change white black")
    private String black;

    public String getWhite() {
        return white;
    }

    public String getBlack() {
        return black;
    }
}
