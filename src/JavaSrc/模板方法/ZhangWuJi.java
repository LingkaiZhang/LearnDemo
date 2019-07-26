package JavaSrc.模板方法;

/**
 * @Auther: lingkai
 * @Date: 2019/7/26 17:13
 * @Description:
 */
public class ZhangWuJi extends AbstractSwordsman {
    @Override
    protected void weapons() {
        System.out.println("");
    }

    @Override
    protected void neigong() {
        System.out.println("运行九阳神功");
    }

    @Override
    protected void moves() {
        System.out.println("使用乾坤大挪移");
    }

    @Override
    protected boolean hasWeapons(){
        return false;
    }
}
