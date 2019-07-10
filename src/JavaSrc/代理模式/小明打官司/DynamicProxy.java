package JavaSrc.代理模式.小明打官司;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Auther: lingkai
 * @Date: 2019/7/10 15:53
 * @Description: 动态代理类
 */
public class DynamicProxy implements InvocationHandler {
    //被代理的类引用
    private Object obj;

    public DynamicProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //调用被代理类对象的方法
        Object result = method.invoke(obj, args);
        return result;
    }
}
