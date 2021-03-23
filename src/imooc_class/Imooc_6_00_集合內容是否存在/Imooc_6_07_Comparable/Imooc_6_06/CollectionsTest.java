package imooc_class.Imooc_6_00_集合內容是否存在.Imooc_6_07_Comparable.Imooc_6_06;

import java.util.*;
import java.util.stream.Collectors;

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

    /**
     * 3. 對其他類型泛型的List進行排序
     *
     */
    public void testSort03() {
        List<Student> studentList = new ArrayList<Student>();
        Random random = new Random();

        Set<Integer> setData = new HashSet<Integer>();
//        List<Integer> listData = new ArrayList<Integer>();

        int s;
        while(setData.size() < 3) {
            s = random.nextInt(100);
            setData.add(s);
        }
        List<Integer> listData = new ArrayList<>(setData);

        System.out.println("listData-Array:" + listData);
        System.out.println("listData:" + setData.stream().collect(Collectors.toList()).get(0));

        Student st1 = new Student();
//        st1.setId(Integer.toString(random.nextInt(3)));
        st1.setId(listData.get(0).toString());
        st1.setName("william");

        Student st2 = new Student();
//        st2.setId(random.nextInt(3) + "");
        st2.setId(listData.get(1).toString());
        st2.setName("margarita");

        Student[] students = {st1, st2};

        studentList.addAll(Arrays.asList(students));

        System.out.println("-------- 排序前 --------");
        for(Student stData: studentList){
            System.out.println("學生名字："+ stData.getId() +"/"+ stData.getName());
        }

        /**
         * 為什麼抱錯?
         * 因為 studentList 只是一個 Student 泛型的序列
         * Student 類並沒有實現 Comparable 接口
         * 所以需要對 Student 類 來進行實現 Comparable 接口
         * */
        /* Comparable<> */
        Collections.sort(studentList);

        System.out.println("-------- 排序後:Comparable --------");
        for(Student stData: studentList){
            System.out.println("學生名字："+ stData.getId() +"/"+ stData.getName());
        }

        /* Comparator<> */
        /* 方法一 */ Collections.sort(studentList, new StudentComparator());
        /* 方法二 */ Collections.sort(studentList, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            return o1.getName().compareTo(o2.getName());
                        }
                    });

        System.out.println("-------- 排序後:Comparator --------");
        for(Student stData: studentList){
            System.out.println("學生名字："+ stData.getId() +"/"+ stData.getName());
        }
    }

    public static void main(String[] args) {
        CollectionsTest ct = new CollectionsTest();
//        ct.testSort01();
//        ct.testSort02();
        ct.testSort03();
    }
}
