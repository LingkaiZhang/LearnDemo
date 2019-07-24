package JavaSrc.建造者模式.Builder模式详解;

/**
 * @Auther: lingkai
 * @Date: 2019/7/24 13:34
 * @Description:
 */
public class ConcreteBuilderA implements Builder {

    private Product product;

    @Override
    public void buildPartOne() {

    }

    @Override
    public void buildPartTwo() {

    }

    @Override
    public Product getProduct() {
        return product;
    }
}
