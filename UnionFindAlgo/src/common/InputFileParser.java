package common;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by nars on 2/25/15.
 */
public class InputFileParser {
    private Scanner fileScanner = null;

    public InputFileParser(String inputFilePath) {
        File inputFile = new File(inputFilePath);
        try {
            fileScanner = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            System.out.println("Cannot find file in path:\t" + inputFilePath);
        }
    }
    public String readNextLine()
    {
        return this.fileScanner.nextLine();
    }
    public Boolean hasNext()
    {
        return this.fileScanner.hasNextLine();
    }
}
