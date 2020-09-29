package e_java.chapter4.item19;

import java.time.Instant;

/**
 * FileName: Sub
 * Date: 2020/9/29 15:24
 * Author:cs
 * Description:
 */
public final class Sub extends Super {
    public Sub() {
        this.instant = Instant.now();
    }

    private final Instant instant;

    @Override
    public void overrideMe() {
        System.out.println(instant);
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.overrideMe();
    }
}
