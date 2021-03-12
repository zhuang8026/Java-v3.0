package imooc_class.Imooc_4_03_demo.src.collection;
import sun.tools.jconsole.JConsole;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* 備選課程類 */
public class ListTest {

    /* 用於存放備選課程的List */
    public List courcesToSelect; // 注意: List 只是一個接口，所以下面無法直接 實例化，必須要用 實現類

    public ListTest(){
        this.courcesToSelect = new ArrayList(); // 實現類
    }

    /* 添加備選課程 */
    public void ListAdd(){
        // 創建課程對象，並通過調用add()來添加備選課程
        Cource cr1 = new Cource();
        cr1.setId("1");
        cr1.setName("計算機概論");
        courcesToSelect.add(cr1);
        System.out.println("已經添加課程");
        Cource temp = (Cource) courcesToSelect.get(0);
        System.out.println("添加了課程: 編號為" + temp.getId() + " && " + temp.getName());

        Cource cr2 = new Cource();
        cr2.setId("2");
        cr2.setName("前端不會java");
        courcesToSelect.add(0, cr2);
        Cource temp2 = (Cource) courcesToSelect.get(0);
        System.out.println("添加了課程: 編號為" + temp2.getId() + " && " + temp2.getName());

    }

    public static void main(String[] args) {
        ListTest Lt = new ListTest();
        Lt.ListAdd();

        /* ---- array 練習 ---- */
        String[] i = new String[10];
        String[] ii = {"1", "2", "3"};
        i[1] = "1111";
        List<String> box1 = new ArrayList<>();
        List<String> box2 = new LinkedList<>();
        box1.add("1");
        box1.add("2");
        box1.add("3");
        box1.add(0, "aa");
        box1.add(0, "bb");
        box1.addAll(Arrays.asList("1", "2"));

        System.out.println(box1);
//        for (String list1 : ii) {
//            System.out.println(list1);
//        }


    }

}

