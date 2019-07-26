package JavaSrc.享元模式;

/**
 * @Auther: lingkai
 * @Date: 2019/7/26 15:54
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Goods goods = GoodsFactory.getGoods("iphone7");
        goods.showGoodsPrice("32G");

        Goods goods1 = GoodsFactory.getGoods("iphone7");
        goods1.showGoodsPrice("32G");

        Goods goods2 = GoodsFactory.getGoods("iphone7");
        goods2.showGoodsPrice("128G");
    }
}
