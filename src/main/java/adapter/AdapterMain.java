package adapter;

import adapter.delegation.DelegationAdapter;
import adapter.inheritance.Print;
import adapter.inheritance.InheritanceAdapter;
import adapter.practice.FileIO;
import adapter.practice.FileProperties;

import java.io.IOException;

public class AdapterMain {
    public static void main(String[] args) {
        Print pI = new InheritanceAdapter("hello");
        pI.printWeak();
        pI.printStrong();

        System.out.println();

        DelegationAdapter pD =
                new DelegationAdapter("hello");
        pD.printWeak();
        pD.printStrong();

        System.out.println();

        FileIO f = new FileProperties();
        try {
            f.readFromFile("file.txt");
            f.setValue("width", "1024");
            f.setValue("height", "512");
            f.setValue("depth", "32");
            f.writeToFile("newfile.txt");
            System.out.println("newfile.txt is created.");
            System.out.println(f.getValue("depth"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
