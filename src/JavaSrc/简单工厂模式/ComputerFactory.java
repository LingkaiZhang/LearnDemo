package JavaSrc.简单工厂模式;

/**
 * @Auther: lingkai
 * @Date: 2019/7/25 17:29
 * @Description:  工厂类
 */
public class ComputerFactory {
    public static Computer createComputer(String type) {
        Computer mComputer = null;
        switch (type) {
            case "lenovo":
                mComputer = new LenovoComputer();
                break;
            case "hp":
                mComputer = new HpComputer();
                break;
            case "asus":
                mComputer = new AsusComputer();
                break;

        }
        return mComputer;
    }
}
