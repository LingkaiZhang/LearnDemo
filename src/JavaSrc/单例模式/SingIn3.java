package JavaSrc.单例模式;

//双重锁定（常用）
public class SingIn3 {
    private static volatile SingIn3 instance = null;
    private SingIn3 (){

    }
    private static SingIn3 getInstance() {
        if (instance == null) {
            synchronized (SingIn3.class) {
                if (instance == null) {
                    instance = new SingIn3();
                }
            }
        }
        return instance;
    }
}
