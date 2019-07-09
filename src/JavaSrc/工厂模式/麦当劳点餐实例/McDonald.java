package JavaSrc.工厂模式.麦当劳点餐实例;

/**
 * @Auther: lingkai
 * @Date: 2019/7/9 14:46
 * @Description: 测试建造者模式
 */
public class McDonald {
    public static void main(String[] args) {
        //建造者模式使用
        Order order = new Order.OrderBuilder()
                .addBurger(new DoubleCheeseBurger())
                .addBeverage(new Coke())
                .addShack(new ChocolateShack())
                .build();
        System.out.println(order.makeOrder());

        Order order1 = new Order.OrderBuilder()
                .addBeverage(new Coke())
                .build();
        System.out.println(order1.makeOrder());

        //工厂模式测试
        Order order2 = OrderFactory.createBigMacCombo();
        System.out.println(order2.makeOrder());

    }
}
