package imooc_class.Imooc_4_03_demo.src.collection;
import sun.tools.jconsole.JConsole;

import java.util.*;

/* 備選課程類 */
public class ListTest {

    /* 用於存放備選課程的List */
    public List<Cource> courcesToSelect = new ArrayList<>(); // 注意: List 只是一個接口，所以下面無法直接 實例化，必須要用 實現類
//    public List<List<Cource>> courcesToSelect; // 二維陣列

    /* 添加構造方法 */
//    public ListTest(){
//        this.courcesToSelect = new ArrayList<>(); // 實現類（容器）
//    }

    /* 添加備選課程 (新增/add & addAll) */
    public void ListAdd(){
        /* 新增arrayList內容 方法一: add() */
        // 創建課程對象，並通過調用add()來添加備選課程
        Cource cr1 = new Cource();
        cr1.setId("1");
        cr1.setName("計算機概論");
        courcesToSelect.add(cr1);
        System.out.println("已經添加課程");
        Cource temp = courcesToSelect.get(0);
        System.out.println("添加了課程: 編號為" + temp.getId() + " && " + temp.getName());

/* ---------------------------------------------------- */

        /* 新增arrayList內容 方法二: add(1, element) */
        Cource cr2 = new Cource();
        cr2.setId("2");
        cr2.setName("前端不會java");
        courcesToSelect.add(0, cr2);
        Cource temp2 = courcesToSelect.get(0);
        System.out.println("添加了課程: 編號為" + temp2.getId() + " && " + temp2.getName());

//        以下會拋出數組下標越界的異常
//        Cource cr3 = new Cource();
//        cr3.setId("3");
//        cr3.setName("後端不會react");
//        courcesToSelect.add(2, cr3)

/* ---------------------------------------------------- */

        /* 新增arrayList內容 方法三: addAll(Arrays.asList()) */
        Cource cr4 = new Cource();
        cr4.setId("4");
        cr4.setName("java 4444");
        Cource cr5 = new Cource();
        cr5.setId("5");
        cr5.setName("java 5555");
        Cource[] cource = {cr4, cr5};
        courcesToSelect.addAll(Arrays.asList(cource));

        Cource temp3 = courcesToSelect.get(2);
        Cource temp4 = courcesToSelect.get(3);
//        System.out.println(courcesToSelect.toString());
//        System.out.println(temp3);
//        System.out.println(temp4);

/* ---------------------------------------------------- */

        /* 新增arrayList內容 方法三: addAll(asList(1, Arrays.asList())) */
        Cource cr6 = new Cource();
        cr6.setId("6");
        cr6.setName("java 6666");
        Cource cr7 = new Cource();
        cr7.setId("7");
        cr7.setName("java 7777");
        Cource[] cource2 = {cr6, cr7};
        courcesToSelect.addAll(2, Arrays.asList(cource2));
        Cource temp5 = courcesToSelect.get(2);
        Cource temp6 = courcesToSelect.get(3);
        System.out.println("添加兩門課程：" + temp5 + " and " + temp6);

    }

    /* 通過for迴圈遍歷List (查詢/for) */
    public void ListGet() {
        System.out.println("通過for迴圈遍歷List");
        int size = courcesToSelect.size();
        for (int i = 0; i< size; i++){
            Cource cr = courcesToSelect.get(i);
            System.out.println("課程"+cr.getId()+":"+cr.getName());
        }
        for(Cource c : courcesToSelect){
            System.out.println(c);
        }
    }

    /* 通過迭代器來遍歷List */
    /* Iterator(迭代器) 也是一個接口 (查詢/Iterator) */
    public void ListIterator(){
        System.out.println("通過迭代器來遍歷List");
        Iterator<Cource> it = courcesToSelect.iterator();
        while (it.hasNext()){ // 判斷是否還有下一個元素
            Cource cr = it.next();
            System.out.println("課程："+ cr.getId() + ":" + cr.getName());
        }

//        for(Iterator<Cource> its = courcesToSelect.iterator();its.hasNext();its.next()){
//
//        }
//
//        for(Cource c : courcesToSelect){
//
//        }
//
//        courcesToSelect.forEach(c -> {
//
//        });

    }

    /* 通過for each遍歷List (查詢/for) */
    public void ListForEach(){
        System.out.println("通過for each遍歷List");
        for(Cource cr: courcesToSelect){
            System.out.println("課程："+ cr.getId() + ":" + cr.getName());
        }
    }

    /* 修改List中的元素 (修改/set) */
    public void ListModify(){
        Cource cr7 = new Cource();
        cr7.setId("7");
        cr7.setName("ListModify");
        courcesToSelect.set(1, cr7);
        System.out.println("修改課程：" + cr7.getId() + ":" + cr7.getName());
    }

    /* 刪除List中的元素 (刪除/remove/removeAll) */
    public void ListReMove(){
        // 刪除方法一，直接傳入整個 object
        Cource cr8 = courcesToSelect.get(4);
        System.out.println("準備刪除課程：" + cr8.getId() + ":" + cr8.getName());
        courcesToSelect.remove(cr8);
        System.out.println("成功刪除,index:4");
        // 刪除方法二，傳入index
        Cource cr9 = courcesToSelect.get(1);
        System.out.println("準備刪除課程：" + cr9.getId() + ":" + cr9.getName());
        courcesToSelect.remove(1);
        System.out.println("成功刪除,index:1");

        // 刪除方法三，刪除多個removeAll()
        // Cource[] cr10 = {courcesToSelect.get(2), courcesToSelect.get(3)};
        List<Cource> cr10 = new ArrayList<Cource>();
        cr10.add(courcesToSelect.get(2));
        cr10.add(courcesToSelect.get(3));

        courcesToSelect.removeAll(Arrays.asList(cr10));
        System.out.println("成功刪除,index:2,3");

        ListForEach();
    }

    public static void main(String[] args) {
        ListTest Lt = new ListTest();
        Lt.ListAdd();
        System.out.println("--------------ListGet");
        Lt.ListGet();
        System.out.println("--------------ListIterator");
        Lt.ListIterator();
        System.out.println("--------------ListForEach");
        Lt.ListForEach();
        System.out.println("--------------ListModify");
        Lt.ListModify();
        System.out.println(Lt.courcesToSelect.toString());
        System.out.println("--------------ListReMove");
        Lt.ListReMove();
        System.out.println("--------------");

//        for(Cource c : Lt.courcesToSelect){
//            System.out.println(c.getId() + ":"  + c.getName());
//        }


        System.out.println(Lt.courcesToSelect.toString());
        /* ---- array 練習 ---- */
//        String[] i = new String[10];
//        String[] ii = {"1", "2", "3"};
//        i[1] = "1111";
//        List<String> box1 = new ArrayList<>();
//        List<String> box2 = new LinkedList<>();
//        box1.add("1");
//        box1.add("2");
//        box1.add("3");
//        box1.add(0, "aa");
//        box1.add(0, "bb");
//        box1.addAll(Arrays.asList("1", "2"));
//
//        System.out.println(box1);
//        for (String list1 : ii) {
//            System.out.println(list1);
//        }

    }

}

