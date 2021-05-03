package imooc_class;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Imooc_1_07s_homework_throws_Exception {

    public static int inputCheck(){
        Scanner scan = new Scanner(System.in);
        try{
            int input = scan.nextInt();
            return input; //若上一行代码未报错则返回输入值
        }catch(Exception e) {
            scan.next(); //读取输入内容防止影响下次循环
            return 3;
        } finally {
            System.out.println("finally");
        }
    }

    public static void main(String[] args) throws Exception {
        Imooc_1_07s_book[] books = {
                new Imooc_1_07s_book("论语",1),
                new Imooc_1_07s_book("高数",2),
                new Imooc_1_07s_book("电路",3),
                new Imooc_1_07s_book("大英",4)
        };

        System.out.println("--------图书系统--------");

        while (true) {
            System.out.println("输入命令：1-按名称查书(string); 2-按序号查书(int)");
            Scanner scan = new Scanner(System.in);

            int userNum = inputCheck();

            boolean exit = false;
            switch (userNum) {
                case 1:
                    System.out.print("Input book name:");
                    String searchName = scan.next();
                    for(Imooc_1_07s_book bookData : books){
                        boolean i = searchName.equals(bookData.name);
                        if(i) {
                            System.out.println("已找到《" + bookData.name + "》,編號：" + bookData.id);
                            exit = true;
                        }
                    }
                    if(!exit){
                        System.out.println("sorry, no fund");
                    }
                    break;
                case 2:
                    System.out.print("Input book int:");
                    int searchInt = scan.nextInt();
                    for(Imooc_1_07s_book bookData : books){
                        if(searchInt == bookData.id) {
                            System.out.println("已找到《" + bookData.name + "》,編號：" + bookData.id);
                        //  exit = true;
                        }
                    }
                    if(!exit){
                        System.out.println("sorry, no fund");
                    }
                    break;
                default:
                //  throw new RuntimeException("你眼瞎啊，輸入數字1或2，請重新輸入!");
                    System.out.println("你眼瞎啊，輸入數字1或2，請重新輸入!");
                    break;
            }
            if(exit){
                break;
            }
        }

    }

}
