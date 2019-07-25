package JavaSrc.单例模式;

import java.io.ObjectStreamException;

/**
 * @Auther: lingkai
 * @Date: 2019/7/25 17:00
 * @Description: 枚举单例
 * 默认枚举实例的创建是线程安全的，并且在任何情况下都是单例。
 *
 * 在上面讲的几种单例模式实现中， 有一种情况下其会重新创建对象，那就是反序列化：
 * 将一个单例实例对象写到磁盘再读回来，从而获得了 一个实例。反序列化操作提供了readResolve方法，
 * 这个方法可以让开发人员控制对象的反序列化。在上述 几个方法示例中，如果要杜绝单例对象被反序列化时重新生成
 * 对象，就必须加入如下方法:
 */
public enum Singleton6 {
    INSTANCCE;

    public void doSomeThing() {
    }

    private Object readResolve() throws ObjectStreamException{
        return INSTANCCE;
    }
}
