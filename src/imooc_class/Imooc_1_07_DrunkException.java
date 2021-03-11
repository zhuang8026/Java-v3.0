package imooc_class;

public class Imooc_1_07_DrunkException  extends Exception{
    public Imooc_1_07_DrunkException (){

    }

    public Imooc_1_07_DrunkException (String message) {
        super(message);
        System.out.println("------ Imooc_1_07_DrunkException ------");
    }
}
