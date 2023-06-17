package bridge.impl;

public class CharDisplayImpl extends DisplayImpl {

    private char head;
    private char body;
    private char tail;

    public CharDisplayImpl(char head, char body, char tail) {
        this.head = head;
        this.body = body;
        this.tail = tail;
    }

    @Override
    public void rawOpen() {
        System.out.print(head);
    }

    @Override
    public void rawPrint() {
        System.out.print(body);
    }

    @Override
    public void rawClose() {
        System.out.println(tail);
    }

}
