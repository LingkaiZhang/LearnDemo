package JavaSrc.工厂模式;

public class CustomerFactory {
    //创建一个金牌用户
    public static ICustomer createGoldCustomer(){
        return new GoldCustomer();
    }
    //创建一个银牌用户
    public static ICustomer createSilverCustomer(){
        return new SilverCustomer();
    }
}
