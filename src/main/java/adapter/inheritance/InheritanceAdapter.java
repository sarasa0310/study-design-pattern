package adapter.inheritance;

import adapter.Banner;

// 상속을 사용한 어뎁터
public class InheritanceAdapter extends Banner implements Print {

    public InheritanceAdapter(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }

}
