package imooc_class.Imooc_6_00_集合內容是否存在.Imooc_6_03_List.indexOf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {

    public List<Cource> courcesToSelect = new ArrayList<Cource>();

    private Scanner scanner = new Scanner(System.in);
    public Student student = new Student();

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

    /* 測試 ArrayList 序列中的 indexOf(object) 尋找指定物件的位置 */
    /* 找到返回位置 0 開始， 未找到 返回 -1 */
    public void TestListContains(){
        // 輸入課程名稱(查找)
        System.out.println("輸入課程名稱(查找)：");
        String name = scanner.next();
        Cource cource2 = new Cource();
        cource2.setName(name);

        // 檢查是否包含 cource 對象
        if(courcesToSelect.contains(cource2)){
            System.out.println("課程：《" + cource2.getName() + "》的索引位置為：" + courcesToSelect.indexOf(cource2)); // indexOf() or lastIndexOf()
        }
    }

    public static void main(String[] args) {
        SetTest st = new SetTest();
        st.ListAdd();
        st.ListForEach();
        st.TestListContains();
    }
}
