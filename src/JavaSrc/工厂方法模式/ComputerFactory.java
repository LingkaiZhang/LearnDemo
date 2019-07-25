package JavaSrc.工厂方法模式;

import JavaSrc.简单工厂模式.Computer;

/**
 * @Auther: lingkai
 * @Date: 2019/7/25 17:38
 * @Description: 创建抽象工厂
 */
public abstract class ComputerFactory {
    public abstract <T extends Computer> T createComputer(Class<T> clz);
}
