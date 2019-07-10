package JavaSrc.观察者模式.程序员订阅Android博客周刊;

import java.util.Date;

/**
 * @Auther: lingkai
 * @Date: 2019/7/10 16:53
 * @Description:
 */
public class Test  {
    public static void main(String[] args) {
        DevTechFrontier devTechFrontier = new DevTechFrontier();

        Coder conder1 = new Coder("conder1");
        Coder conder2 = new Coder("conder2");
        Coder conder3 = new Coder("conder3");
        Coder conder4 = new Coder("conder4");
        Coder conder5 = new Coder("conder5");

        devTechFrontier.addObserver(conder1);
        devTechFrontier.addObserver(conder2);
        devTechFrontier.addObserver(conder3);
        devTechFrontier.addObserver(conder4);
        devTechFrontier.addObserver(conder5);

        devTechFrontier.postNewPage(new Page(new Date().toString(), "wang", "技术内容"));
    }
}
