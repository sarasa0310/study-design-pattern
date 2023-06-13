package builder;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("취업 일기");

        builder.makeString("취업 성공을 위해서 필요한 것");
        builder.makeItems(new String[]{
                "프로필 업그레이드",
                "꾸준한 지원 및 피드백 수용",
                "끊임없는 개발 공부"
        });

        builder.close();
    }

}
