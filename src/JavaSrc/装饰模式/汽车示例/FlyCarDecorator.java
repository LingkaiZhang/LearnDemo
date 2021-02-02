package JavaSrc.装饰模式.汽车示例;

public class FlyCarDecorator extends CarDecorator {
    public FlyCarDecorator(Car decorator) {
        super(decorator);
    }

    @Override
    public void run() {
        decorator.run();
        fly();
    }

    private void fly() {
        System.out.println("开启飞行汽车模式");
    }
}
