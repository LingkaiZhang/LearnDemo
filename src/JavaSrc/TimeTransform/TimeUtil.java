package JavaSrc.TimeTransform;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeUtil {
    public static void main(String[] args) {


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        String dateStr = sdf.format(Calendar.getInstance().getTime());
        String dateStr1 = sdf1.format(Calendar.getInstance().getTime());
        String dateStr2 = sdf2.format(Calendar.getInstance().getTime());
        String dateStr3 = sdf3.format(Calendar.getInstance().getTime());

        System.out.println(dateStr);
        System.out.println(dateStr1);
        System.out.println(dateStr2);
        System.out.println(dateStr3);


        String str="2020-5-27";
        Date date = null;
        try {
            date = sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH) + 1);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        String dateStr4 = sdf.format(new Date());
        System.out.println(dateStr4);


        System.out.println(Calendar.getInstance().getTime());

        long currentTimeMillis = System.currentTimeMillis();
        String s = String.valueOf(currentTimeMillis);
        System.out.println(sdf1.format(currentTimeMillis));
        System.out.println(sdf1.format(Long.valueOf(s)));

    }
}
