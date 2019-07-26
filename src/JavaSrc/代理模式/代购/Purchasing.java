package JavaSrc.代理模式.代购;

/**
 * @Auther: lingkai
 * @Date: 2019/7/26 10:20
 * @Description:
 */
public class Purchasing implements IShop {
    private IShop iShop;
    public Purchasing(IShop iShop){
        this.iShop = iShop;
    }

    @Override
    public void buy() {
        iShop.buy();
    }
}
