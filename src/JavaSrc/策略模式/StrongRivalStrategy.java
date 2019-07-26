package JavaSrc.策略模式;

/**
 * @Auther: lingkai
 * @Date: 2019/7/26 16:33
 * @Description:
 */
public class StrongRivalStrategy implements FightingStrategy {
    @Override
    public void fighting() {
        System.out.println("遇到强大对手，张无忌使用乾坤大挪移");
    }
}
