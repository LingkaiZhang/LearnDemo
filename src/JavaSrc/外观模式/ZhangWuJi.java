package JavaSrc.外观模式;

/**
 * @Auther: lingkai
 * @Date: 2019/7/26 15:09
 * @Description:
 */
public class ZhangWuJi {
    private JingMai jingMai;
    private ZhaoShi zhaoShi;
    private NeiGong neiGong;

    public ZhangWuJi() {
        jingMai = new JingMai();
        zhaoShi = new ZhaoShi();
        neiGong = new NeiGong();
    }

    public void QianKun(){
        jingMai.JingMai();
        neiGong.QianKun();
    }

    public void QiShang(){
        jingMai.JingMai();
        neiGong.JiuYang();
        zhaoShi.QiShangQuan();
    }
}
