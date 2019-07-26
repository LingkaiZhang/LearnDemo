package JavaSrc.策略模式;

/**
 * @Auther: lingkai
 * @Date: 2019/7/26 16:30
 * @Description:
 */
public class WeekRivalStrategy implements FightingStrategy {
    @Override
    public void fighting() {
        System.out.println("遇到较弱对手，张无忌使用太极剑");
    }
}
