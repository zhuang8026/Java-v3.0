package imooc_class.Imooc_6_00_集合內容是否存在.Imooc_6_07_Comparable.Imooc_6_06;

import java.util.Comparator;

/**
 * 1. 通過Collections.sort() 對 integer 泛型的 List 進行排序 （List<integer>）
 * 2. 對String泛型的List進行排序
 * 3. 對其他類型泛型的List進行排序
 */
public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
