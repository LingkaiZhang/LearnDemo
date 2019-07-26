package JavaSrc.代理模式.代购;

import java.lang.reflect.Proxy;

/**
 * @Auther: lingkai
 * @Date: 2019/7/26 10:22
 * @Description:
 */
public class Client {
    public static void main(String[] args) {

        //静态代理
        IShop liuWangShu = new LiuWangShu();
        IShop purchasing = new Purchasing(liuWangShu);
        purchasing.buy();

        //动态代理
        IShop wangShu = new LiuWangShu();
        DynamicPurchasng dynamicPurchasng = new DynamicPurchasng(wangShu);
        ClassLoader classLoader = wangShu.getClass().getClassLoader();
        IShop purchasing2 = (IShop) Proxy.newProxyInstance(classLoader, new Class[]{IShop.class}, dynamicPurchasng);
        purchasing2.buy();
    }
}
