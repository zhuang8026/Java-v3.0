package imooc_class;

/* 書類 */
public class Imooc_2_02 {
    public static void main(String[] args) {
        String s1 = "imooc";
        String s2 = "imooc";
        String s3 = "I love" + s1;
        //定义字符串s3，保存“I love”和s1拼接后的内容


        // 比较字符串s1和s2
        // imooc为常量字符串，多次出现时会被编译器优化，只创建一个对象
        System.out.println("s1和s2内存地址相同吗？" + (s1 == s2));
        System.out.println("s1和s2內容相同吗？" + (s1.equals(s2)));

        //比较字符串s1和s3
        System.out.println("s1和s3内存地址相同吗？" + (s1 == s3));

        String s4 = "I love " + s1;
        //比较字符串s4和s3
        // s1是变量，s4在运行时才知道具体值，所以s3和s4是不同的对象
        System.out.println("s3和s4内存地址相同吗？" + (s4 == s3));
    }
}
