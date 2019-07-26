package JavaSrc.观察者模式.微信公众号实例;

/**
 * @Auther: lingkai
 * @Date: 2019/7/26 17:47
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();

        WeixinUser zhangsan = new WeixinUser("zhangsan");
        WeixinUser lisi = new WeixinUser("lisi");
        WeixinUser wangwu = new WeixinUser("wangwu");

        subscriptionSubject.attach(zhangsan);
        subscriptionSubject.attach(lisi);
        subscriptionSubject.attach(wangwu);

        subscriptionSubject.notify("刘望舒的专栏更新了");
    }
}
