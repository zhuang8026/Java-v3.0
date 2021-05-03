package imooc_class;

/* 簡單try-catch */
public class Imooc_1_03_try_catch練習1 {
    public int test() {
        int divider = 10;
        int result = 100;
        try {
            while (divider > -1) {
                divider --;
                result = result + 100/divider;
            }
            return result;
        }catch ( Exception e ) {
            e.printStackTrace(); // 打印錯誤訊息 拋出 "ArithmeticException" 說明是算數異常
            System.out.println("Exception 循環拋出異常了！！！");
            return -1;
        } finally {
            System.out.println("finally");
        }
    }

    public static void main(String[] args) {
        Imooc_1_03_try_catch練習1 i01 = new Imooc_1_03_try_catch練習1();
        int i = i01.test();
        System.out.println("test方法，執行完畢：" + i);
    }
}
