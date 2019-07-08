package JavaSrc.单例模式;

//懒汉式
public class SingIn2 {
    private static SingIn2 instance = null;
    private static synchronized SingIn2 getInstance() {
        if (instance == null) {
            instance = new SingIn2();
        }
        return instance;
    }
}
