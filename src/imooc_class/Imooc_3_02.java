package imooc_class;

public class Imooc_3_02 {
    public static void main(String[] args) {

        // 定义double类型变量
        double a = 91.5;

        // 手动装箱
        Double b = new Double(a); // 基本 轉 包裝

        // 自动装箱
        Double c = a; // 基本 轉 包裝

        System.out.println("装箱后的结果为：" + b + "和" + c);

        // 定义一个Double包装类对象，值为8
        Double d = new Double(87.0);

        // 手动拆箱
        double e =  d.doubleValue(); // 包裝 轉 基本

        // 自动拆箱
        double f = d; // 包裝 轉 基本

        System.out.println("拆箱后的结果为：" + e + "和" + f);
    }
}
