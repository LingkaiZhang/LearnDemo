package JavaSrc.代理模式.小明打官司;

/**
 * @Auther: lingkai
 * @Date: 2019/7/10 14:19
 * @Description: 代理接口
 */
public interface ILawSuit {

    //提交申请
    void submit();
    //进行举证
    void burden();
    //开始辩护
    void defend();
    //诉讼完成
    void finish();
}
