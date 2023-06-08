package templatemethod;

public abstract class AbstractDisplay {

    abstract protected void open();
    abstract protected void print();
    abstract protected void close();

    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }

}
