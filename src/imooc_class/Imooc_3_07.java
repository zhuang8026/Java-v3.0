package imooc_class;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Imooc_3_07 {
//    public static void main(String[] args) {
//        // 创建Calendar对象
//        Calendar c = Calendar.getInstance();
//
//        // 将Calendar对象转换为Date对象
//        Date date = c.getTime();
//        System.out.println(date); /* Fri Mar 12 11:46:27 CST 2021 */
//
//        // 创建SimpleDateFormat对象，指定目标格式
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//
//        // 将日期转换为指定格式的字符串
//        String now = sdf.format(date);
//        System.out.println("当前时间：" + now);
//    }

    public static void main(String[] args) {
        // ------- 方法一 -------
        Calendar cal = Calendar.getInstance(); // 抽象類別 (創建時間物件)
        Date date = cal.getTime(); // 取得現在世界時間
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 設定格式
        String now = sdf.format(date); // 解析格式
        System.out.println(now);

        // ------- 方法二 -------
        LocalDateTime time = LocalDateTime.now(); // 取得現在時間
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); // 設定格式
        System.out.println(time.format(dt)); // 解析

        LocalDate Ltime = LocalDate.now();
        DateTimeFormatter ymd = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(Ltime.format(ymd));

        LocalDate Ltime2 = LocalDate.parse("2021-01-02", ymd);
        System.out.println(Ltime2.getYear());
        System.out.println(Ltime2.getMonth());
        System.out.println(Ltime2.getMonthValue());
    }
}
