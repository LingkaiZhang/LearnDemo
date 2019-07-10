package JavaSrc.观察者模式.程序员订阅Android博客周刊;

import java.util.Observable;

/**
 * @Auther: lingkai
 * @Date: 2019/7/10 16:41
 * @Description: 开发技术网站
 */
public class DevTechFrontier extends Observable {

    /**
     * 通知所有观察者
     * @param page 新的文章
     */
    public void postNewPage(Page page){
        //设置状态已改变
        setChanged();
        notifyObservers(page);
    }

}
