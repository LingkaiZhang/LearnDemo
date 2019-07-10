package JavaSrc.代理模式.小明打官司;

import java.lang.reflect.Proxy;

/**
 * @Auther: lingkai
 * @Date: 2019/7/10 15:59
 * @Description: 动态代理测试类
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        //构造一个小明
        ILawSuit xiaoming = new xiaoming();
        //构造一个动态代理
        DynamicProxy dynamicProxy = new DynamicProxy(xiaoming);
        //获取被代理类小明的ClassLoader
        ClassLoader loader = xiaoming.getClass().getClassLoader();
        //动态构造一个代理者律师
        ILawSuit lawyer = (ILawSuit) Proxy.newProxyInstance(loader, new Class[]{ILawSuit.class},dynamicProxy);
        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();
    }
}
