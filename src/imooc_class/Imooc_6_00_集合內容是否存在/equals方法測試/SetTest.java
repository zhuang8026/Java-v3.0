package imooc_class.Imooc_6_00_集合內容是否存在.equals方法測試;

import java.util.*;

public class SetTest {

    public List<Cource> courcesToSelect = new ArrayList<Cource>();

//    public void ListAdd(){
//        Cource2 cr1 = new Cource2();
//        Cource2 cr2 = new Cource2();
//        Cource2 cr3 = new Cource2();
//        cr1.setId("1");
//        cr1.setName("計算機概論 -1");
//        cr2.setId("2");
//        cr2.setName("計算機概論 -2");
//        cr3.setId("3");
//        cr3.setName("計算機概論 -3");
//
//        Cource2[] cource = {cr1, cr2, cr3};
//        courcesToSelect.addAll(Arrays.asList(cource));
//    }

    /**
     * 測試 List 的 contains 方法
     * */
    public void TestListContains(){
        // 創建一個課程對象，與course對象一樣
        Cource cource = new Cource(); // Cource cource = null;
        // 檢查是否包含 cource 對象
        System.out.println(courcesToSelect);
        System.out.println(cource);

        System.out.println( courcesToSelect.contains(null) ); // false
        System.out.println(cource.equals(courcesToSelect)); // 如果對象為 null
    }


    public static void main(String[] args) {

        SetTest st = new SetTest();
        
        // st.ListAdd();
        st.TestListContains();

    }
}
