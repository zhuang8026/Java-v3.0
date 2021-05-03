package imooc_class.Imooc_6_00_集合內容是否存在;

import java.util.*;

public class SetTest {

    public List<Cource> courcesToSelect = new ArrayList<Cource>();
    // public Set<String> set = new LinkedHashSet<>();
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

    public void TestForEachForSet(Student student){
        // 打印輸出，學生所選的課程
        System.out.println("一共選擇了" + student.getCources().size() + "門");
        // for(Cource cr: (Set<Cource>) student.getCources()){ .. }
        for(Cource cr: student.getCources()){
            System.out.println("選擇" + cr.getId() + ":" + cr.getName());
        }
    };

    /**
     * 測試 List 的 contains 方法
     * */
    public void TestListContains(){
        // 取得備選課程的第0個元素
//        Cource cource = courcesToSelect.get(0);
        // 檢查是否包含 cource 對象
//        System.out.println("取得課程get(0)：" + cource.getName());
//        System.out.println("備選課程是否包含：" + cource.getName() + "-" + courcesToSelect.contains(cource)); // true

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
        List<Cource> ls = new ArrayList<Cource>();
        ls.add(courcesToSelect.get(1));
        ls.add(courcesToSelect.get(2));

        // 檢查是否包含 cource 對象
//        System.out.println("取得課程get(0)：" + cource2.getName());
        System.out.println("contains/備選課程是否包含：" + cource2.getName() + "-" + courcesToSelect.contains(cource2)); // false
        System.out.println("containsAll/備選課程是否包含：《" + ls.get(0).getName() + "》《" + ls.get(1).getName()+ "》-" + courcesToSelect.containsAll(ls)); // false

        if(courcesToSelect.contains(cource2)){
            System.out.println("課程：《" + cource2.getName() + "》的索引位置為：" + courcesToSelect.indexOf(cource2)); // indexOf() or lastIndexOf()
        }
    }

    /**
     * 創建學生對象並選課
     * */
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

    /**
     * 測試Set的contains方法
     * */
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
        st.TestListContains();
        st.ListForEach();

//        st.createStudentAndSelectCours();
//        st.testSetContains();

        // st.TestForEachForSet(student);
    }
}
