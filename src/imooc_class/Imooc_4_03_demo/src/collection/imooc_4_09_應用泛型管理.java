package imooc_class.Imooc_4_03_demo.src.collection;

import java.util.ArrayList;
import java.util.List;

public class imooc_4_09_應用泛型管理 {

    /**
     * 帶有泛型 -> Course 的List屬性
     */
    public List<Cource> courses = new ArrayList<>();

//    public imooc_4_09_應用泛型管理() {
//        this.courses = new ArrayList<>();
//    }

    public void testAdd(){
        Cource cr1 = new Cource();
        cr1.setId("1");
        cr1.setName("青果好好吃-1");
        courses.add(cr1);
        // courses.add("我就是要欺負泛型"); // error,因為泛型已經規定的Cource為傳入類型

        Cource cr2 = new Cource();
        cr2.setId("2");
        cr2.setName("青果好好吃-2");
        courses.add(cr2);
    }

    public void TestForEach(){
        for(Cource c: courses){
            System.out.println(c.getId() + ":" + c.getName());
        }
    }

    /* 泛型集合可以添加泛型的子類別的對象實例 */
    public void testChild(){
        imooc_4_10_應用泛型管理 imm = new imooc_4_10_應用泛型管理();
        imm.setId("3");
        imm.setName("我是子類別,Course類是我爸");
        courses.add(imm);
    }

    /* 泛型使用基本類型，必須使用包裝類 */
    public void basicType(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        System.out.println("泛型想使用基本類型，必須使用包裝類: " + list.get(0));
    }

    public static void main(String[] args) {
        imooc_4_09_應用泛型管理 i04 = new imooc_4_09_應用泛型管理();
        i04.testAdd();
        i04.TestForEach();
        i04.testChild();
        i04.TestForEach();
        i04.basicType();
    }

}

