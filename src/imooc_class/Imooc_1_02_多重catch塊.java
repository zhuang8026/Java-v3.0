package imooc_class;

import java.util.InputMismatchException;
import java.util.Scanner;

/* 簡單try-catch */
public class Imooc_1_02_多重catch塊 {
    public static void main(String[] args) {
        System.out.println("請輸入你的年齡");
        Scanner input = new Scanner(System.in);
        try {
            int age = input.nextInt();
            if(age == 0) {
                throw new ArithmeticException();
            }

            System.out.println("恭喜你" + age + "歲了");

        } catch (InputMismatchException e) { /* InputMismatchException 繼承 Exception */
            System.out.println("請你輸入整數");
        } catch (ArithmeticException e) { /* ArithmeticException => nextInt沒有所以需要throw（數學運算時產生的例外） */
            System.out.println("不能為0");
        }  catch (Exception e) {
            System.out.println("不知名錯誤");
        } finally {
            System.out.println("finally");
        }

        System.out.println("結束");
    }
}
