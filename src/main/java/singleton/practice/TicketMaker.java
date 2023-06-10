package singleton.practice;

public class TicketMaker {

    private static final TicketMaker ticketMaker = new TicketMaker();
    private int ticket = 100;

    private TicketMaker() {
    }

    public static TicketMaker getInstance() {
        return ticketMaker;
    }

    public synchronized int getNextTicketNumber() {
        return ticket++;
    }

}
