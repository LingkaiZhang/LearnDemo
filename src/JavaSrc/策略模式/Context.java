package JavaSrc.策略模式;

/**
 * @Auther: lingkai
 * @Date: 2019/7/26 16:34
 * @Description:  上下文角色
 */
public class Context {
    private FightingStrategy fightingStrategy;

    public Context(FightingStrategy fightingStrategy) {
        this.fightingStrategy = fightingStrategy;
    }

    public void fighting(){
        fightingStrategy.fighting();
    }
}
