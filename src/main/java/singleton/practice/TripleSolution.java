package singleton.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TripleSolution {

    private static Map<String, TripleSolution> map = new HashMap<>();
    static {
        String[] triples = {"ALPHA", "BETA", "GAMMA"};
        Arrays.stream(triples)
                .forEach(s -> map.put(s, new TripleSolution(s)));
    }

    private String name;

    public TripleSolution(String name) {
        this.name = name;
    }

    public static TripleSolution getInstance(String name) {
        return map.get(name);
    }

    @Override
    public String toString() {
        return "TripleSolution{" +
                "name='" + name + '\'' +
                '}';
    }
}
