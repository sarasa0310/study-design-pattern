package prototype.example;

public class ConcreteProduct implements prototype.framework.Product {

    @Override
    public void use(String s) {

    }

    @Override
    public prototype.framework.Product createCopy() {
        prototype.framework.Product p = null;

        try {
            p = (prototype.framework.Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return p;
    }

}
