package JavaSrc.装饰模式.汽车示例;

public class AutoCarDecorator extends CarDecorator{
    public AutoCarDecorator(Car decorator) {
        super(decorator);
    }

    @Override
    public void run() {
        decorator.run();
        autoRun();
    }

    private void autoRun() {
        System.out.println("开启自动驾驶");
    }
}
