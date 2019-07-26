package JavaSrc.策略模式;

/**
 * @Auther: lingkai
 * @Date: 2019/7/26 16:32
 * @Description:
 */
public class CommonRivalStrategy implements FightingStrategy {
    @Override
    public void fighting() {
        System.out.println("遇到普通对手，张无忌使用圣火令神功");
    }
}
