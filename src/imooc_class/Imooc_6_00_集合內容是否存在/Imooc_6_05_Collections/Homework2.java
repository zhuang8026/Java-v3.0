package imooc_class.Imooc_6_00_集合內容是否存在.Imooc_6_05_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Homework2 {
    /**
     * 创建String泛型的List,放入10条随机的字符串
     * 每条字符串的长度为10以内的随机整数
     * 每条字符串的字符都是随机生成的字符，可以重复
     * 每条随机生成的字符串不可以重复
     */
    public void test01(){
        List<String> stringList = new ArrayList<String>();
        Random random = new Random();
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

        for (int i = 0; i < 10; i ++) {
            int len = random.nextInt(10)+1; // 長度 0～9+1
            int index;
            StringBuilder strb = new StringBuilder();
            do{
                for (int s = 0; s < len; s ++){
                    index = random.nextInt(str.length()); // 隨機一個 char key
                    strb.append(str.charAt(index));
                }
            }while (stringList.contains(str)); // 如果內容相同就跳出迴圈

            stringList.add(strb.toString());
        }

        System.out.println("-------------- 排序前 ------------");
        for (String str1 : stringList) {
            System.out.println(str1);
        }
        Collections.sort(stringList);
        System.out.println("-------------- 排序前 ------------");
        for (String str1 : stringList) {
            System.out.println(str1);
        }
    }

    public static void main(String[] args) {
        Homework2 h2 = new Homework2();
        h2.test01();
    }

}
