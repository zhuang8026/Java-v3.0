package imooc_class.Imooc_4_11_HashSet;

import java.util.*;

/* 學生類 */
public class Student {
    private String id;
    private String name;
    private Set<Cource> courses = new HashSet<Cource>(); // 無順序, 資料不可重複，由 HashMap 實作, 陣列及bucket

    public Set<String> set = new LinkedHashSet<String>(); // 有順序, 資料不可重複，由 LinkedHashMap 實作鏈接
    public List<String> list1 = new LinkedList<String>(); // 有順序, 資料可重複（鏈接）
    public List<String> list2 = new ArrayList<String>(); // 有順序, 資料可重複（陣列）

//    public Student(String id, String name){
//        this.id = id;
//        this.name = name;
//        this.cources = new HashSet(); // class 實例
//    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Cource> getCources() {
        return courses;
    }

    public void addCourses(Cource course) {
        this.courses.add(course);
    }

    public static void main(String[] args) {
        int i = 100;
    }
}
