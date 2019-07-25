package JavaSrc.单例模式;

/**
 * @Auther: lingkai
 * @Date: 2019/7/25 16:48
 * @Description: 双重检查模式（DCL）
 * 这种写法在getSingleton方法中对Singleton进行了两次判空：
 * 第一次是为了不必要的同步，第二次是在 Singleton等于null的情况下才创建实例。
 * 在这里使用volatile会或多或少地影响性能，但考虑到程序的正确 性，牺牲这点性能还是值得的。
 * DCL的优点是资源利用率高。第一次执行getInstance时单例对象才被实例 化，效率高。
 * 其缺点是第一次加载时反应稍慢一些，在高并发环境下也有一定的缺陷。
 * DCL虽然在一定程 度上解决了资源的消耗和多余的同步、线程安全等问题，
 * 但其还是在某些情况会出现失效的问题，也就是 DCL失效。这里建议用静态内部类单例模式来替代DCL。
 */
public class Singleton4 {
    private volatile static Singleton4 instance;

    public Singleton4() {
    }

    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
