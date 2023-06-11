package prototype;

import prototype.framework.Manager;
import prototype.framework.Product;

public class PrototypeMain {
    public static void main(String[] args) {
        // 준비
        Manager manager = new Manager();

        UnderlinePen uPen = new UnderlinePen('-');
        MessageBox warnBox = new MessageBox('*');
        MessageBox slashBox = new MessageBox('/');

        // 등록
        manager.register("uPen", uPen);
        manager.register("warnBox", warnBox);
        manager.register("slashBox", slashBox);

        // 생성 & 사용
        Product p1 = manager.create("uPen");
        p1.use("hello");

        Product p2 = manager.create("warnBox");
        p2.use("hello");

        Product p3 = manager.create("slashBox");
        p3.use("hello");
    }
}
