package JavaSrc.代理模式.小明打官司;

/**
 * @Auther: lingkai
 * @Date: 2019/7/10 15:43
 * @Description: 代理模式测试类
 */
public class ProxyTest {
    public static void main(String[] args) {
        ILawSuit xiaoming = new xiaoming();
        Lawyer lawyer = new Lawyer(xiaoming);
        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();
    }
}
