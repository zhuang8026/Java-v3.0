package imooc_class.Imooc_6_00_集合內容是否存在.Imooc_6_05_Collections;

import java.util.*;

/**
 * 1. 通過Collections.sort() 對 integer 泛型的 List 進行排序 （List<integer>）
 * 2. 對String泛型的List進行排序
 * 3. 對其他類型泛型的List進行排序
 */
public class CollectionsTest {

    /**
     * 1. 通過 Collections.sort()，對Integer 泛型的List 進行排序
     *    創建一個 Integer 泛型的List,插入10個 100 內不重複的隨機數
     */
    public void testSort01(){
        /* 泛型不能使用 基本類，必須是包裝類 */
        List<Integer> integerList = new ArrayList<Integer>();
        Random random = new Random();
        Integer k;
        for(int i  = 0; i < 10;  i++){
            do {
                k  = random.nextInt(100);
            }while (integerList.contains(k));
            integerList.add(k);
            System.out.println("成功添加整數：" + k);
        }
        System.out.println("-------------- 排序前 ------------");
        for (Integer integer: integerList) {
            System.out.println("元素：" + integer);

        }
        Collections.sort(integerList);
        System.out.println("-------------- 排序後 ------------");
        for (Integer integer: integerList) {
            System.out.println("元素：" + integer);

        }
    }

    /**
     * 2. 對 String 泛型的List 進行排序
     *    創建 String 泛型的List,添加三個亂序的String元素，
     *    使用sort, 在檢查是否有排列正確
     */
    public void testSort02(){
        List<String> stringList = new ArrayList<String>();
        stringList.add("google");
        stringList.add("baidu");
        stringList.add("facebook");
        System.out.println("-------------- 排序前 ------------");
        for(String string: stringList){
            System.out.println("元素：" + string);
        }
        Collections.sort(stringList); // 排序循序：數字：0-9 大寫字母：A-Z 小寫字母：a-z
        System.out.println("-------------- 排序前 ------------");
        for(String string: stringList){
            System.out.println("元素：" + string);
        }
    }


    public static void main(String[] args) {
        CollectionsTest ct = new CollectionsTest();
        ct.testSort01();
//        ct.testSort02();
    }
}
