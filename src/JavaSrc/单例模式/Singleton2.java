package JavaSrc.单例模式;

/**
 * @Auther: lingkai
 * @Date: 2019/7/25 16:17
 * @Description: 懒汉模式（线程不安全） 懒汉模式声明了一个静态对象，在用户第一次调用时初始化。
 * 这虽然节约了资源，
 * 但第一次加载时需 要实例化，反应稍慢一些，而且在多线程时不能正常工作。
 */
public class Singleton2 {
    private static Singleton2 instance;

    public Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
