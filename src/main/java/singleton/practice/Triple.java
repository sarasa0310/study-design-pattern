package singleton.practice;

public class Triple {

    private static Triple ALPHA = new Triple();
    private static Triple BETA = new Triple();
    private static Triple GAMMA = new Triple();

    private Triple() {
    }

    public static Triple getInstance(String name) {
        switch (name) {
            case "ALPHA":
                return ALPHA;
            case "BETA":
                return BETA;
            case "GAMMA":
                return GAMMA;
        }
        return null;
    }

}
