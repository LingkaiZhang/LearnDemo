package JavaSrc.模板方法;

/**
 * @Auther: lingkai
 * @Date: 2019/7/26 17:01
 * @Description:
 */
public abstract class AbstractSwordsman {
    //该方法为final ， 防止算法框架被重写
    public final void fighting(){
        //运行内功，抽象方法
        neigong();
        //调整经脉，具体方法
        meridian();
        //如果有武器，则准备雾气
        if (hasWeapons()) {
            weapons();
        }
        //使用招式
        moves();
        //钩子方法
        hook();
        
        
    }

    protected abstract void weapons();

    private void meridian() {
        System.out.println("开启正经与奇经");
    }

    protected abstract void neigong();

    protected abstract void moves();

    protected void hook() {
    }

    protected boolean hasWeapons() {
        return true;
    }
}
