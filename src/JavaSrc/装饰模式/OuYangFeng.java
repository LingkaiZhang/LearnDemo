package JavaSrc.装饰模式;

/**
 * @Auther: lingkai
 * @Date: 2019/7/26 14:01
 * @Description:    装饰者具体实现类
 */
public class OuYangFeng extends Master {
    public OuYangFeng(Swordsman mSwordsman) {
        super(mSwordsman);
    }

    @Override
    public void attackMagic(){
        super.attackMagic();
        teachAttackMagic();
    }

    private void teachAttackMagic() {
        System.out.println("欧阳锋教授打狗棒法");
        System.out.println("杨欧阳锋使用打狗棒法");
    }

}
