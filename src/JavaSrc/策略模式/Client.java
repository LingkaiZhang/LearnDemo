package JavaSrc.策略模式;

/**
 * @Auther: lingkai
 * @Date: 2019/7/26 16:36
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context(new WeekRivalStrategy());
        context.fighting();

        context = new Context(new CommonRivalStrategy());
        context.fighting();

        context = new Context(new StrongRivalStrategy());
        context.fighting();
    }
}
