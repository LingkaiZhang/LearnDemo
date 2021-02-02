package JavaSrc.装饰模式.汽车示例;

public class TeslaCar implements Car{
    @Override
    public void run() {
        System.out.println("特斯拉开车了！");
    }
}
