package factorymethod;

import factorymethod.framework.Factory;
import factorymethod.framework.Product;
import factorymethod.idcard.IDCardFactory;

public class FactoryMethodMain {
    public static void main(String[] args) {
        Factory idCardFactory = new IDCardFactory();

        Product id1 = idCardFactory.create("김코딩");
        Product id2 = idCardFactory.create("박해커");
        Product id3 = idCardFactory.create("나문희");

        id1.use();
        id2.use();
        id3.use();
    }
}
