package JavaSrc.工厂方法模式;

import JavaSrc.简单工厂模式.Computer;

/**
 * @Auther: lingkai
 * @Date: 2019/7/25 17:51
 * @Description:
 */
public class GDComputerFactory extends ComputerFactory {
    @Override
    public <T extends Computer> T createComputer(Class<T> clz) {
        Computer computer = null;
        String className = clz.getName();
        //通过反射来生产不同厂家的计算机
        try {
            computer = (Computer) Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return (T) computer;
    }
}
