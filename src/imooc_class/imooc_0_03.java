package imooc_class;

import java.util.HashSet;
import java.util.Set;

public class imooc_0_03 {
    public static void main(String[] args) {
        String[] demo1 = {"a", "b", "c"};
        String demo2 = "123456";
        Set<String> demo3 = new HashSet();
        demo3.add("example");

        System.out.println(demo1.length);   //3 - array
        System.out.println(demo2.length()); //6 - Strinig[]
        System.out.println(demo3.size());   //1 - Collection
    }
}
