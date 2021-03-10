package imooc_class;

import java.util.Scanner;

/* 簡單try-catch */
public class Imooc_1_02 {
    public static void main(String[] args) {
        try {
            System.out.println("請輸入你的年齡");
            Scanner input = new Scanner(System.in);
            int age = input.nextInt();
            System.out.println("恭喜你" + age + "歲了");
        } catch (Exception e) { /* Exception => 例外類型 */
            System.out.println("請你輸入整數");
//            System.out.println(e);
        } finally {
            System.out.println("finally");
        }
        System.out.println("結束");
    }
}
