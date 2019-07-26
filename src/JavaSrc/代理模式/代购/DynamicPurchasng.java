package JavaSrc.代理模式.代购;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Auther: lingkai
 * @Date: 2019/7/26 10:34
 * @Description: 动态代理类
 */
public class DynamicPurchasng implements InvocationHandler {
    private Object obj;
    public DynamicPurchasng(Object obj){
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(obj, args);
        if (method.getName().equals("buy")){
            System.out.println("LiuWangShu 买买买");
        }
        return result;
    }
}
