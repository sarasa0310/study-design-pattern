package bridge;

import bridge.function.CountDisplay;
import bridge.function.Display;
import bridge.function.RandomCountDisplay;
import bridge.impl.StringDisplayImpl;
import bridge.impl.TextFileDisplayImpl;

public class BridgeMain {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, Korea"));
        Display d2 = new Display(new StringDisplayImpl("Hello, World"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe"));

        RandomCountDisplay d4 = new RandomCountDisplay(new StringDisplayImpl("test random"));

//        d1.display();
//        d2.display();
//        d3.display();
//        d3.multiDisplay(5);

//        d4.display();
//        System.out.println();
//        d4.multiDisplay(5);
//        System.out.println();
//        d4.randomDisplay(10);

        Display d5 = new Display(new TextFileDisplayImpl("test.txt"));
        d5.display();

        CountDisplay d6 = new CountDisplay(new TextFileDisplayImpl("test.txt"));
        d6.multiDisplay(3);
    }
}
