package day02.topic9;

/**
 * @Author: Sylvia-G
 * @Date: 2020/1/5 21:24
 */
public class BMW extends Cars {

    @Override
    protected void driveOn() {
        System.out.println("路上现在跑的是BMW");
    }

    @Override
    protected void PriceCount() {
        System.out.println("这是BMW的价钱： 888888");
    }
}
