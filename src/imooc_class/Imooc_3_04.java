package imooc_class;

public class Imooc_3_04 {
    public static void main(String[] args) {
        double m = 78.5;
        // 将基本类型转换为字符串
        String str1 = Double.toString(m);
        System.out.println("m 转换为String型后与整数20的求和结果为： "+(str1 + 20) );
        // 轉整數
        Double num = Double.valueOf(m);
        int i = num.intValue();
        System.out.println(i);

        // 将字符串转换为基本类型
        String str = "180.20";
        Double a = Double.parseDouble(str);
        System.out.println( "str 转换为double型后与整数20的求和结果为： "+( a+ 20) );
        // 轉整數
        Double s = Double.valueOf(str);
        int ss = s.intValue();
        System.out.println(ss);

    }
}
