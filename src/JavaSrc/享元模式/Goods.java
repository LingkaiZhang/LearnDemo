package JavaSrc.享元模式;

/**
 * @Auther: lingkai
 * @Date: 2019/7/26 15:42
 * @Description:   具体享元角色
 */
public class Goods implements IGoods {
    private String name;
    private String version;

    public Goods(String name) {
        this.name = name;
    }

    @Override
    public void showGoodsPrice(String version) {
        if (version.equals("32G")) {
            System.out.println("价格为5199元");
        } else if (version.equals("128G")) {
            System.out.println("价格为5999元");
        }
    }
}
