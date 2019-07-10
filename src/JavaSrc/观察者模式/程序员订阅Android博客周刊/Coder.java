package JavaSrc.观察者模式.程序员订阅Android博客周刊;

import java.util.Observable;
import java.util.Observer;

/**
 * @Auther: lingkai
 * @Date: 2019/7/10 16:31
 * @Description: 开发技术前线网站是一个汇集各种技术文章的网站，它支持邮箱订阅，一旦有用户订阅了它，
 * 每当网站出新内容时，会自动将新内容推送到用户邮箱。
 * 因为java核心库里已经有了Observer抽象观察者接口和Observable抽象被观察者类，
 * 所以我们直接实现和继承它们即可扩展我们自己的业务。
 */
public class Coder implements Observer {

    //名字
    private String name;

    public Coder(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {

        if (arg instanceof Page) {
            System.out.println(name + "  得到了文章：" + arg.toString());
        }
    }

    @Override
    public String toString() {
        return "Coder{" +
                "name='" + name + '\'' +
                '}';
    }
}
