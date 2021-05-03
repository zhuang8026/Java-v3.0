package imooc_class;

public class Test001_super {

    public static void prt(String prtData) {
        System.out.println("test001 -> s:" + prtData);
    }

    /* 由於 super 沒有參數傳入，所以呼叫 test001() */
    public Test001_super() {
        prt("test001 -> 父類·無引數構造方法： "+"A Person.");
    }//構造方法(1)

    /* 由於 super 傳入相對應參數 name, 所以啟動 test001(String name) */
    public Test001_super(String names) {
        prt("test001 -> 父類·含一個引數的構造方法： "+"A person's name is " + names);
    }//構造方法(2)
}

 class Chinese extends Test001_super {
     Chinese() {
         super(); // 呼叫父類構造方法（1）
         prt("Chinese: 子類·呼叫父類”無引數構造方法“： " + "A chinese coder.");
     }

     Chinese(String nameData) {
         super(nameData);// 呼叫父類具有相同形參的構造方法（2）
         prt("Chinese: 子類·呼叫父類”含一個引數的構造方法“： " + "his name is " + nameData);
     }

     Chinese(String nameData, int age) {
         this(nameData);// 呼叫具有相同形參的構造方法（3）
         prt("Chinese: 子類：呼叫子類具有相同形參的構造方法：his age is " + age);
     }

     public static void main(String[] args) {
         Chinese cn = new Chinese();
         cn = new Chinese("codersai");
         cn = new Chinese("codersai", 18);
     }
 }