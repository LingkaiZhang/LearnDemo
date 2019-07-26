package JavaSrc.观察者模式.微信公众号实例;

/**
 * @Auther: lingkai
 * @Date: 2019/7/26 17:38
 * @Description:
 */
public interface Subject {
    //曾加订阅者
    public void attach(Observer observer);

    //删除订阅者
    public void detach(Observer observer);

    //通知订阅者更新消息
    public void notify(String message);

}

