package imooc_class.Imooc_6_00_集合內容是否存在.Imooc_6_01_List_contains;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListTest {

    public List<Cource> courcesToSelect = new ArrayList<Cource>();
    private Scanner scanner = new Scanner(System.in);

    public void ListAdd(){
        Cource cr1 = new Cource();
        Cource cr2 = new Cource();
        Cource cr3 = new Cource();
        cr1.setId("1");
        cr1.setName("計算機概論-1");
        cr2.setId("2");
        cr2.setName("計算機概論-2");
        cr3.setId("3");
        cr3.setName("計算機概論-3");

        Cource[] cource = {cr1, cr2, cr3};
        courcesToSelect.addAll(Arrays.asList(cource));
    }

    public void ListForEach(){
        for(Cource crs: courcesToSelect){
            System.out.println("課程：" + crs);
        }
    }

    /**
     * 測試 List 的 contains 方法
     * */
    public void TestListContains(){
        // 取得備選課程的第0個元素
        Cource cource = courcesToSelect.get(0);
        // 檢查是否包含 cource 對象
        System.out.println("取得課程get(0)：" + cource.getName());
        System.out.println("備選課程是否包含：" + cource.getName() + "-" + courcesToSelect.contains(cource)); // true

        // 輸入課程名稱(查找)
        System.out.println("輸入課程名稱(查找)：");
        String name = scanner.next();
        Cource cource2 = new Cource();
        cource2.setName(name);

        // 創建一個課程對象，與course對象一樣
//        Cource cr4 = new Cource();
//        cr4.setId(cource.getId());
//        cr4.setName(cource.getName());
//        Cource cource2 = cr4;

        // containsAll (array)
//        List<Cource> ls = new ArrayList<Cource>();
//        ls.add(courcesToSelect.get(1));
//        ls.add(courcesToSelect.get(2));

        // 檢查是否包含 cource 對象
        System.out.println("取得課程get(0)：" + cource2.getName());
        System.out.println("contains/備選課程是否包含：" + cource2.getName() + "-" + courcesToSelect.contains(cource2)); // false
//        System.out.println("containsAll/備選課程是否包含：《" + ls.get(0).getName() + "》《" + ls.get(1).getName()+ "》-" + courcesToSelect.containsAll(ls)); // false
    }

    public static void main(String[] args) {
        ListTest st = new ListTest();
        
        st.ListAdd();
        st.TestListContains();
    //  st.ListForEach();
    }
}
