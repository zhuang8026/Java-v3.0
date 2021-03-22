package imooc_class.Imooc_6_00_集合內容是否存在.Imooc_6_05_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Homework {
    /**
     * 创建String泛型的List,放入10条随机的字符串
     * 每条字符串的长度为10以内的随机整数
     * 每条字符串的字符都是随机生成的字符，可以重复
     * 每条随机生成的字符串不可以重复
     */
    public void test01(){
        // 定义字符串条数
        int count = 10;
        // 定义最大字符串的长度
        int maxLength = 10;
        // 準備字串
        StringBuilder stringBuilder = new StringBuilder("ABCDEFGHIJGLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890");
        // 被选出来的字符串
        StringBuilder stringSet = new StringBuilder();
        // 新建 字符串List集合
        List<String> stringList = new ArrayList<>();
        do {
            // 随机字符串的长度(10以内)
            int rdLong = new Random().nextInt(maxLength); // 0~10

            for (int i =0; i < rdLong; i ++){
                // 長度為 62, 隨機獲取一個數字，稱為索引
                int index = new Random().nextInt(stringBuilder.length());
                stringSet.append(stringBuilder.charAt(index)); // charAt：隨機取得索引對應的內容
            }

            // 如果包含字符串,重新生成随机字符串，相同字串不可重複
//            if(stringList.contains(stringSet.toString())) continue;

            // 把随机生成的字符串添加到strList中
            stringList.add(stringSet.toString());

            // 清空 stringSet, 下一次循環才不會累加字串
            stringSet.delete(0,stringSet.length()-1);

        } while (stringList.size() != count); // 到10就跳出循環


        System.out.println("-------------- 排序前 ------------");
        for (String string: stringList) {
            System.out.println(string);
        }
        Collections.sort(stringList); // 排序
        System.out.println("-------------- 排序前 ------------");
        for (String string: stringList) {
            System.out.println(string);
        }
    }

    public void test02(){
        StringBuilder stringBuilder = new StringBuilder("ABCDEFGHIJGLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890");
        Random random = new Random();
        System.out.println(stringBuilder.length());
        System.out.println(random.nextInt(stringBuilder.length()));
    }
    public static void main(String[] args) {
        Homework hm = new Homework();
         hm.test01();
        // hm.test02();
        System.out.println((char) 65); // ASCII
    }
}
