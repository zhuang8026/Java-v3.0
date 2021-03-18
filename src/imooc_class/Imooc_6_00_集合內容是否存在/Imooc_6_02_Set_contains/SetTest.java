package imooc_class.Imooc_6_00_集合內容是否存在.Imooc_6_02_Set_contains;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {

    public List<Cource> courcesToSelect = new ArrayList<Cource>(); // 創建 ArrayList 序列
    private Scanner scanner = new Scanner(System.in);

    public Student student = new Student(); // 創建 student 類

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

    /* 創建學生對象並選課 */
    public void createStudentAndSelectCours() {
        student.setId("1");
        student.setName("小明");
        System.out.println("歡迎" + student.getName() + "選課");

        // create Scanner
        Scanner scanner = new Scanner(System.in);

        for (int i =0; i < 3; i ++) {
            System.out.println("請輸入課程ID：");
            String conrseId = scanner.next();
            for(Cource cre : courcesToSelect){
                if(cre.getId().equals(conrseId)){
                    student.addCourses(cre); // 測試
                }
            }
        }
    }

    /* 測試Set的contains方法 */
    public void testSetContains() {
        // 提示輸入課程名稱
        System.out.println("請輸入學生已選的課程名稱：");
        String name = scanner.next();
        // 創建一個新的課程對象，ID和名稱，與course對象完全一樣
        Cource cource2 = new Cource();
        cource2.setName(name);
        System.out.println("新創建課程：" + cource2.getName());
        System.out.println("備選課程中是否包含課程：" + cource2.getName() + "," + student.getCources().contains(cource2));

    }

    public static void main(String[] args) {

        SetTest st = new SetTest();
        
        st.ListAdd();
        st.ListForEach(); // 先查看 那些課程 可以選擇 ？

        st.createStudentAndSelectCours();
        st.testSetContains();

    }
}
