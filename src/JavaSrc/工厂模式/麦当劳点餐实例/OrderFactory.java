package JavaSrc.工厂模式.麦当劳点餐实例;

/**
 * @Auther: lingkai
 * @Date: 2019/7/9 14:52
 * @Description: 订单工厂类
 */
public class OrderFactory {

    //创建一份巨无霸套餐(巨无霸+可乐+苹果派)
    public static Order createBigMacCombo(){
        return new Order.OrderBuilder()
                .addBurger( new BigMac())
                .addBeverage( new Coke())
                .addShack( new ApplePie())
                .build();
    }
    //创建一份吉士汉堡套餐(吉士汉堡+牛奶+奶昔)
    public static Order createCheeseBurgerCombo(){
        return new Order.OrderBuilder()
                .addBurger( new CheeseBurger())
                .addBeverage( new Mike())
                .addShack( new MilkShack())
                .build();
    }
    //创建一份双层吉士汉堡套餐(双层吉士汉堡+橙汁+巧克力奶昔)
    public static Order createDoubleBurgerCombo(){
        return new Order.OrderBuilder()
                .addBurger( new DoubleCheeseBurger())
                .addBeverage( new OrangeJuice())
                .addShack( new ChocolateShack())
                .build();
    }
}
