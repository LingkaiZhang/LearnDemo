package JavaSrc.建造者模式.Builder模式详解;

/**
 * @Auther: lingkai
 * @Date: 2019/7/24 13:36
 * @Description:
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void buildProduct() {
        this.builder.buildPartOne();
        this.builder.buildPartTwo();
    }

    public Product getProduct(){
        return this.builder.getProduct();
    }
}
