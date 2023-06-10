package singleton;

import singleton.practice.TicketMaker;
import singleton.practice.Triple;

public class SingletonMain {
    public static void main(String[] args) {
        System.out.println("Start");

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if (obj1 == obj2) {
            System.out.println("같은 인스턴스입니다.");
        } else {
            System.out.println("다른 인스턴스입니다.");
        }

        System.out.println("End");

        TicketMaker t1 = TicketMaker.getInstance();
        System.out.println(t1.getNextTicketNumber());
        System.out.println(t1.getNextTicketNumber());
        System.out.println(t1.getNextTicketNumber());
        System.out.println(t1.getNextTicketNumber());
        System.out.println(t1.getNextTicketNumber());
        System.out.println();

        TicketMaker t2 = TicketMaker.getInstance();
        System.out.println(t2.getNextTicketNumber());

        Triple alpha = Triple.getInstance("ALPHA");
        Triple alpha2 = Triple.getInstance("ALPHA");
        Triple beta = Triple.getInstance("BETA");
        Triple gamma = Triple.getInstance("GAMMA");

        System.out.println(alpha == alpha2);

        System.out.println(alpha == beta);
        System.out.println(beta == gamma);
        System.out.println(gamma == alpha);
    }
}
