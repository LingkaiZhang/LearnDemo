package JavaSrc.享元模式;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: lingkai
 * @Date: 2019/7/26 15:46
 * @Description: 享元工厂
 */
public class GoodsFactory {
    private static Map<String, Goods> pool = new HashMap<>();

    public static Goods getGoods(String name) {
        if (pool.containsKey(name)) {
            System.out.println("使用缓存，key为：" + name);
            return pool.get(name);
        } else {
            Goods goods = new Goods(name);
            pool.put(name, goods);
            System.out.println("创建商品， key为：" + name);
            return goods;
        }
    }
}
