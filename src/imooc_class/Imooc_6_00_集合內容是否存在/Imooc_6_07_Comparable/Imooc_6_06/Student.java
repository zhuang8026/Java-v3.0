package imooc_class.Imooc_6_00_集合內容是否存在.Imooc_6_07_Comparable.Imooc_6_06;

import imooc_class.Imooc_4_11_HashSet.Cource;

import java.util.HashSet;
import java.util.Set;

/* 學生類 */
// xxx implements Comparable<T> -> T = Type
public class Student implements Comparable<Student>{
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

    /* 自動生成:Code/Generate/equals and hashCode */
    @Override
    public int hashCode() { // 讓物件有唯一的 哈希值，即可比較物件之間的hashCode是否一樣
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0: name.hashCode());
        return result;
    }

    /* 自動生成:Code/Generate/equals and hashCode */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (this == null)
            return false;
        if (!(obj instanceof Student)) return false;
        Student student = (Student) obj;

        if(this.name == null){ // 判斷當前名字是否為空
            if(student.getName() == null)
                return true;
            else
                return false;
        } else {
            if(this.name.equals(student.getName()))
                return true;
            else
                return false;
        }
    }

    public String toString (){
        return this.id + ":" + this.name;
    }

    /** 6-08 Comparable */
    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }
}
