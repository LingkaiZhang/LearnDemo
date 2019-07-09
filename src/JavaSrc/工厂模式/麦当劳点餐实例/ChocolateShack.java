package JavaSrc.工厂模式.麦当劳点餐实例;

/**
 * @Auther: lingkai
 * @Date: 2019/7/9 13:06
 * @Description:
 */
public class ChocolateShack implements ISnacks {
    @Override
    public String makeSnack() {
        return "巧克力奶昔";
    }
}
