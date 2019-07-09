package JavaSrc.工厂模式.麦当劳点餐实例;

/**
 * @Auther: lingkai
 * @Date: 2019/7/9 13:09
 * @Description: 建造者模式创建订单类
 */
public class Order {
    private IBurgers mBurger;
    private IBeverages mBeverages;
    private ISnacks mShacks;

    private Order(OrderBuilder orderBuilder) {
        this.mBurger = orderBuilder.mBurger;
        this.mBeverages = orderBuilder.mBeverages;
        this.mShacks = orderBuilder.mShacks;
    }

    public String makeOrder() {
        StringBuilder sb = new StringBuilder();
        if (mBurger != null) {
            sb.append(mBurger.makeBurger()).append(" ");
        }
        if (mBeverages != null) {
            sb.append(mBeverages.makeDrinking()).append(" ");
        }
        if (mShacks != null) {
            sb.append(mShacks.makeSnack());
        }
        return sb.toString();
    }


    public static class OrderBuilder {
        private IBurgers mBurger;
        private IBeverages mBeverages;
        private ISnacks mShacks;

        public OrderBuilder() {

        }

        public OrderBuilder addBurger(IBurgers burgers) {
            this.mBurger = burgers;
            return this;
        }

        public OrderBuilder addBeverage(IBeverages beverages) {
            this.mBeverages = beverages;
            return this;
        }

        public OrderBuilder addShack(ISnacks mShacks) {
            this.mShacks = mShacks;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
