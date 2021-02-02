package JavaSrc.装饰模式.汽车示例;

public class Client {
    public static void main(String[] args) {
        BenzCar benzCar = new BenzCar();
        BmwCar bmwCar = new BmwCar();
        TeslaCar teslaCar = new TeslaCar();
        //创建自动驾驶的奔驰汽车
        AutoCarDecorator autoBenzCar = new AutoCarDecorator(benzCar);
        //创建飞行的、自动驾驶的宝马汽车
        FlyCarDecorator flyAutoBmwCar = new FlyCarDecorator(new AutoCarDecorator(bmwCar));

        benzCar.run();
        bmwCar.run();
        teslaCar.run();

        autoBenzCar.run();

        flyAutoBmwCar.run();

    }
}
