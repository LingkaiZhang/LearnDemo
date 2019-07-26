package JavaSrc.观察者模式.微信公众号实例;

/**
 * @Auther: lingkai
 * @Date: 2019/7/26 17:36
 * @Description:    具体观察者
 */
public class WeixinUser implements Observer {
    private String name;

    public WeixinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}
