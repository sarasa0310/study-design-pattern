package adapter;

import adapter.delegation.DelegationAdapter;
import adapter.inheritance.Print;
import adapter.inheritance.InheritanceAdapter;

public class AdapterMain {
    public static void main(String[] args) {
        Print pI = new InheritanceAdapter("hello");
        pI.printWeak();
        pI.printStrong();

        DelegationAdapter pD =
                new DelegationAdapter("hello");
        pD.printWeak();
        pD.printStrong();
    }
}
