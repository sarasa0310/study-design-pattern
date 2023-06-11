package prototype;

import prototype.example.ConcreteProduct;

public class UnderlinePen extends ConcreteProduct {

    private char ulChar;

    public UnderlinePen(char ulChar) {
        this.ulChar = ulChar;
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

}
