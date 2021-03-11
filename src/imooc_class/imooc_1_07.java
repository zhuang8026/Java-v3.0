package imooc_class;

public class imooc_1_07 {
    public void test01() throws Imooc_1_07_DrunkException{
        throw new Imooc_1_07_DrunkException("開車不喝酒");
    }

    public void test02() {
        try {
            test01();
        } catch (Imooc_1_07_DrunkException e) {
            // e.printStackTrace();
            // RuntimeException newExc = new RuntimeException("千萬別喝酒");
            RuntimeException newExc = new RuntimeException(e);
            // newExc.initCause(e);
            throw newExc; // 拋出異常
        }
    }

    public static void main(String[] args) {
        imooc_1_07 i07 = new imooc_1_07();
        try {
            i07.test02();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
