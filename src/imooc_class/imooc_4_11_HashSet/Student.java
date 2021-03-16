package imooc_class.imooc_4_11_HashSet;

import java.util.HashSet;
import java.util.Set;

/* 學生類 */
public class Student {
    private String id;
    private String name;
    private Set<Cource> courses = new HashSet<Cource>();

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

}
