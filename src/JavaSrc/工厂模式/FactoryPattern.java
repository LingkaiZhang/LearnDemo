package JavaSrc.工厂模式;

public class FactoryPattern {
    public static void main(String[] args) {
        ICustomer goldCustomer = CustomerFactory.createGoldCustomer();
        System.out.println(goldCustomer.describe());

        ICustomer silverCustomer = CustomerFactory.createSilverCustomer();
        System.out.println(silverCustomer.describe());
    }
}
