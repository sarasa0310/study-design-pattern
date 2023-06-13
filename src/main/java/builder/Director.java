package builder;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("일반적인 인사");
        builder.makeItems(new String[]{
                "hello", "how are you?", "I'm fine, thank you."
        });
        builder.makeString("시간대별 인사");
        builder.makeItems(new String[]{
                "good morning", "good afternoon", "good evening"
        });
        builder.close();
    }

}
