package imooc_class;

/* 父類 */
public class Test002_super {
    public String str01 = "str01";
    public int num01 = 10;
    public void fun1(){
        System.out.println("父類 -> 我是方法fun1");
    }

    public static void fun2(String prtData) {
        System.out.println("父類 -> 我是方法fun2回傳:" + prtData);
    }

}

/* 子類 */
class demo02 extends Test002_super {
    public void fun1(){
        System.out.println("子類 -> 我是方法fun1");
    }

    public void fun2(){
        demo02.super.fun1();
        super.fun2("William");
    }

    public static void main(String[] args) {
        demo02 d02 = new demo02();
        d02.fun1();
        d02.fun2();
    }
}
