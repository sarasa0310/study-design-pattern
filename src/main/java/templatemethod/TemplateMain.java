package templatemethod;

public class TemplateMain {
    public static void main(String[] args) {
//        AbstractDisplay d1 = new CharDisplay('e');
//        AbstractDisplay d2 = new StringDisplay("hello");
//
//        d1.display();
//        d2.display();

        AbstractDisplayInterface d3 = new CharDisplay('c');
        AbstractDisplayInterface d4 = new StringDisplay("bye");

        d3.display();
        d4.display();
    }
}
