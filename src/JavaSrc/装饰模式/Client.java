package JavaSrc.装饰模式;

/**
 * @Auther: lingkai
 * @Date: 2019/7/26 14:07
 * @Description:  客户端调用
 */
public class Client {
    public static void main(String[] args) {
        YangGuo yangGuo = new YangGuo();
        HongQiGong hongQiGong = new HongQiGong(yangGuo);
        hongQiGong.attackMagic();

        OuYangFeng ouYangFeng = new OuYangFeng(yangGuo);
        ouYangFeng.attackMagic();


    }
}
