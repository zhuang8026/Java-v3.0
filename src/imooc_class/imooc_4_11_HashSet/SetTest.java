package imooc_class.imooc_4_11_HashSet;

import java.util.*;

public class SetTest {

    public List<Cource> courcesToSelect = new ArrayList<Cource>();

    public void ListAdd(){
        Cource cr1 = new Cource();
        Cource cr2 = new Cource();
        Cource cr3 = new Cource();
        cr1.setId("1");
        cr1.setName("計算機概論 -1");
        cr2.setId("2");
        cr2.setName("計算機概論 -2");
        cr3.setId("3");
        cr3.setName("計算機概論 -3");

        Cource[] cource = {cr1, cr2, cr3};
        courcesToSelect.addAll(Arrays.asList(cource));
    }

    public void ListForEach(){
        for(Cource crs: courcesToSelect){
            System.out.println("課程：" + crs);
        }
    }

    public void TestForEachForSet(Student student){
        // for(Cource cr: (Set<Cource>) student.getCources()){
        for(Cource cr: student.getCources()){
            System.out.println("選擇" + cr.getId() + ":" + cr.getName());
        }
    };

    public static void main(String[] args) {
        SetTest st = new SetTest();
        st.ListAdd();
        st.ListForEach();

        // create student
        Student student = new Student();
        student.setId("1");
        student.setName("小明");
        System.out.println("歡迎" + student.getName() + "選課");

        // create Scanner
        Scanner scanner = new Scanner(System.in);

        for (int i =0; i < 3; i ++) {
            System.out.println("請輸入課程ID");
            String conrseId = scanner.next();
            for(Cource cre : st.courcesToSelect){
                if(cre.getId().equals(conrseId)){
                    student.addCourses(cre);
                }
            }
        }

        st.TestForEachForSet(student);
    }
}
