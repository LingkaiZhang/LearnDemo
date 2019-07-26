package JavaSrc.装饰模式;

/**
 * @Auther: lingkai
 * @Date: 2019/7/26 13:59
 * @Description:  抽象装饰者
 */
public class Master extends Swordsman {
    private Swordsman mSwordsman;

    public Master(Swordsman mSwordsman) {
        this.mSwordsman = mSwordsman;
    }

    @Override
    public void attackMagic() {
        mSwordsman.attackMagic();
    }
}
