package imooc_class.Imooc_6_00_集合內容是否存在.Imooc_6_02_Set_contains;

import java.util.*;

/* 學生類 */
public class Student {
    private String id;
    private String name;
    private Set<Cource> courses = new HashSet<Cource>(); // 無順序, 資料不可重複，由 HashMap 實作, 陣列及bucket

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

}
