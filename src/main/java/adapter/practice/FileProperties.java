package adapter.practice;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO {

    private final String filePath = "C:\\Users\\Administrator\\Desktop\\study-design-pattern\\document\\";

    @Override
    public void readFromFile(String fileName) throws IOException {
        load(new FileReader(filePath + fileName));
    }

    @Override
    public void writeToFile(String fileName) throws IOException {
        store(new FileWriter(filePath + fileName), "written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return getProperty(key, "");
    }

}
