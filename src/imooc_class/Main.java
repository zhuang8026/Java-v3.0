package imooc_class;

import java.util.*;

public class Main {

    public void test (){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++ ){
            list.add(i);
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
	    // write your code here

        // double 轉 int (轉整數)
        Double i = Math.random() * 10;
        System.out.println(i);
        System.out.println(i.intValue());

        int s = (new Double(i)).intValue();
        System.out.println(s);

        // 測試 - ArrayList中添加參數
        Main mn = new Main();
        mn.test();

        String a = "hello2";
        String b = "hello";
        String c = b + 2;

        System.out.println(c);
        System.out.println((a.equals(c)));
        System.out.println((a == c));

//        int q = 182;
//        int ww,rr;
//        System.out.println(q/100);
//        System.out.println(q%10);
        System.out.println(">>:" + (35 >> 2));
        String s1 = "0.5";
        String s2 = "12";
        double xxxx = Double.parseDouble(s1);
        int yyyy = Integer.parseInt(s2);
        System.out.println(xxxx + yyyy);

        Integer[] data1 = {1,2,3,4};
        int[] data2 = {1,2,3,4};
        Integer[] intData = new Integer[]{ 1,2,3,4};
        Arrays.stream(intData).forEach(data3 -> System.out.println(data3));

//        Set<Integer> setData = new HashSet<Integer>();

//        List<Integer> listData1 = new ArrayList<Integer>(intData);

//        List<Integer> listData2 = new ArrayList<Integer>(new HashSet<>());

//        List<Integer> listData3 = new ArrayList<Integer>(setData);

    }

}
