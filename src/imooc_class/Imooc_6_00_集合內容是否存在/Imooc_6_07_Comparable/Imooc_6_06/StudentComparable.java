package imooc_class.Imooc_6_00_集合內容是否存在.Imooc_6_07_Comparable.Imooc_6_06;

/**
 * 1. 通過Collections.sort() 對 integer 泛型的 List 進行排序 （List<integer>）
 * 2. 對String泛型的List進行排序
 * 3. 對其他類型泛型的List進行排序
 */

// 為什麼 沒辦法 找到 student 的 id ?
public class StudentComparable implements Comparable<Student>{
    Student stu = new Student();
    @Override
    public int compareTo(Student o) {
       return stu.getId().compareTo(o.getId()); // stream()
      //  return 0;
    }
}
