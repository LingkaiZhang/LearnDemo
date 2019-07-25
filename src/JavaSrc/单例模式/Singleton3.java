package JavaSrc.单例模式;

/**
 * @Auther: lingkai
 * @Date: 2019/7/25 16:45
 * @Description: 懒汉模式（线程安全） 这种写法能够在多线程中很好地工作，
 * 但是每次调用getInstance方法时都需要进行同步。这会造成不必 要的同步开销，
 * 而且大部分时候我们是用不到同步的。所以，不建议用这种模式。
 */
public class Singleton3 {
    private static Singleton3 instancce;

    public Singleton3() {
    }

    public static synchronized Singleton3 getInstance() {
        if (instancce == null) {
            instancce = new Singleton3();
        }
        return instancce;
    }
}
