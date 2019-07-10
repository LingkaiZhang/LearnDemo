package JavaSrc.代理模式.小明打官司;


/**
 * @Auther: lingkai
 * @Date: 2019/7/10 14:34
 * @Description: 被代理者小明
 */
public class xiaoming implements ILawSuit {
    @Override
    public void submit() {
        //小明申请仲裁
        System.out.println("老板拖欠工资，特此申请仲裁!");
    }

    @Override
    public void burden() {
        System.out.println("这是合同书和过去一年的银行工资流水");
    }

    @Override
    public void defend() {
        System.out.println("证据确凿，不需要再说什么了");
    }

    @Override
    public void finish() {
        System.out.println("诉讼成功！判决老板即日起七天内结算工资！");
    }
}
