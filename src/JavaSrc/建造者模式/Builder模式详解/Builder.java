package JavaSrc.建造者模式.Builder模式详解;

/**
 * @Auther: lingkai
 * @Date: 2019/7/24 13:31
 * @Description:
 */
public interface Builder {
    public void buildPartOne();

    public void buildPartTwo();


    public Product getProduct();
}
