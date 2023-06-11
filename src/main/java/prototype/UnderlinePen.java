package prototype;

import prototype.framework.Product;

public class UnderlinePen implements Product {

    private char ulChar;

    public UnderlinePen(char ulChar) {
        this.ulChar = ulChar;
    }

    public UnderlinePen(UnderlinePen protoType) {
        this.ulChar = protoType.ulChar;
    }

    @Override
    public void use(String s) {
        System.out.println(s);
        int ulLen = s.length();
        for (int i = 0; i < ulLen; i++) {
            System.out.print(ulChar);
        }
        System.out.println();
    }

    @Override
    public Product createCopy() {
        return new UnderlinePen(this);
    }

}
