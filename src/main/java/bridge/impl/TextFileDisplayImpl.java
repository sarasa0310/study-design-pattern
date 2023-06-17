package bridge.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextFileDisplayImpl extends DisplayImpl {

    private String fileName;

    public TextFileDisplayImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void rawOpen() {
        System.out.println("=-=-=-=-=" + fileName + "=-=-=-=-=");
    }

    @Override
    public void rawPrint() {
        try {
            for (String line : Files.readAllLines(Path.of(fileName))) {
                System.out.print("> ");
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void rawClose() {
        System.out.println("=-=-=-=-=");
    }
}
