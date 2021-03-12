package imooc_class;

public class Imooc_3_08 {
    public static void main(String[] args) {

        // 定义一个整型数组，长度为10
        Integer[] nums = new Integer[10];

        //通过循环给数组赋值
        for (int i = 0; i < nums.length; i++) {
            // 产生10以内的随机数
            // int x = (int)(Math.random() * 10); // 強制轉型
            Double x = Double.valueOf(Math.random() * 10); // 手動轉型

            nums[i] = x.intValue();;// 为元素赋值
        }

        // 使用foreach循环输出数组中的元素
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
