package JavaSrc.工厂模式.麦当劳点餐实例;

/**
 * @Auther: lingkai
 * @Date: 2019/7/9 13:04
 * @Description:
 */
public class MilkShack implements ISnacks {
    @Override
    public String makeSnack() {
        return "奶昔";
    }

}
