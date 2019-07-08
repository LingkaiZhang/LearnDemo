package JavaSrc.单例模式;

//饿汉式
public class SingIn {

    private static final SingIn instance = new SingIn();
    private SingIn() {}

    public static SingIn getInstance() {
        return instance;
    }
}

