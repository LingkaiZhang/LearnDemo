package JavaSrc.代理模式.小明打官司;

/**
 * @Auther: lingkai
 * @Date: 2019/7/10 14:58
 * @Description: 代理律师
 */
public class Lawyer implements ILawSuit {
    //  持有一个具体被代理者的引用
    private ILawSuit mLawSuit;

    public Lawyer(ILawSuit iLawSuit) {
        this.mLawSuit = iLawSuit;
    }

    @Override
    public void submit() {
        mLawSuit.submit();
    }

    @Override
    public void burden() {
        mLawSuit.burden();
    }

    @Override
    public void defend() {
        mLawSuit.defend();
    }

    @Override
    public void finish() {
        mLawSuit.finish();
    }
}
