package imooc_class;

import java.util.*;

public class Main {
    private int ssss = 0;
    public int getSsss() {
        return ssss;
    }
    public void setSsss(int ssss) {
        this.ssss = ssss;
    }

    int a = 0;
    int b = 1;
    int c = a + b;

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
        System.out.println(">>:" + (35 >> 2)); // 8
        String s1 = "0.5";
        String s2 = "12";
        double xxxx = Double.parseDouble(s1);
        int yyyy = Integer.parseInt(s2);
        System.out.println(xxxx + yyyy);

        Integer[] data1 = {1,2,3,4};
        int[] data2 = {1,2,3,4};
        Integer[] intData = new Integer[]{ 1,2,3,4 };
        intData[1] = 999;
//        System.out.println("intData:" + );
//        Arrays.stream(intData).map(sss -> sss.name);
        Arrays.stream(intData).forEach(data3 -> System.out.println(data3));

        Set<Integer> setData = new HashSet<Integer>();

        List<Integer> listData1 = Arrays.asList(1,2,3);
        System.out.println(listData1);

        List<Integer> listData2 = new ArrayList<Integer>(new HashSet<>());

        List<Integer> listData3 = new ArrayList<Integer>(setData);

        System.out.println(Integer.valueOf("111111"));
        System.out.println(Integer.parseInt("222222222"));

        double wsx = 2.345657;
        int qaz = (int) wsx;
        System.out.println(qaz);

        String[] qee = new String[5];
        qee[0] = "qqqqq";
        qee[1] = "sssss";
        qee[2] = "ttttt";
        qee[3] = "ggggg";

        for (String qees : qee) {
            System.out.println(qees.equals("ggggg"));
        }
    }

}

// game server
class Member {
    // OLTP - db
    volatile Integer money = 0;

    public void add(int num) {
        synchronized(money){
            this.money += num;
        }
    }

    public void minus(int num) {
        synchronized(money){
            this.money -= num;
        }
    }

}

