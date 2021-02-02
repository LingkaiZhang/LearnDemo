package JavaSrc.装饰模式.汽车示例;

public class CarDecorator implements Car {

    protected Car decorator;

    public CarDecorator(Car decorator) {
        this.decorator = decorator;
    }

    @Override
    public void run() {
        decorator.run();
    }
}
