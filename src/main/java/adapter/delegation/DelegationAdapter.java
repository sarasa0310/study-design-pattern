package adapter.delegation;

import adapter.Banner;

// 위임을 사용한 어뎁터
public class DelegationAdapter extends Print {

    private Banner banner;

    public DelegationAdapter(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }

}
