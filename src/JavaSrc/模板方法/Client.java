package JavaSrc.模板方法;

/**
 * @Auther: lingkai
 * @Date: 2019/7/26 17:21
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        ZhangWuJi zhangWuJi = new ZhangWuJi();
        zhangWuJi.fighting();

        ZhanSanFeng zhanSanFeng = new ZhanSanFeng();
        zhanSanFeng.fighting();
    }
}
