package JavaSrc.观察者模式.微信公众号实例;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: lingkai
 * @Date: 2019/7/26 17:42
 * @Description:    具体观察者
 */
public class SubscriptionSubject implements Subject {
    //存储订阅公众号的微信用户
    private List<Observer> weixinUserList = new ArrayList<Observer>();

    @Override
    public void attach(Observer observer) {
        weixinUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weixinUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        weixinUserList.forEach(observer -> observer.update(message));
    }
}
