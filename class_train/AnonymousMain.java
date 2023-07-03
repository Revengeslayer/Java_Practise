package cm.code.class_train;

import java.util.Scanner;

public class AnonymousMain {
    public static void common_class(){
        Anonymous ano = new Anonymous();
        ano.setName("123456");
        ano.show();
    }

    public static void anonymous_class(){
        new Anonymous().setName("78910");   //匿名的第一個
        new Anonymous().show();             //匿名的第二個 所以才會null
    }

    public static void common_scanner(){
        Scanner sc =new Scanner(System.in);
        System.out.println("輸入一個數字");
        int num=sc.nextInt();
        System.out.println("一般的輸入數字"+num);
    }

    public static void anonymous_scanner(Scanner sc){
        System.out.println("輸入一個數字");
        int num=sc.nextInt();
        System.out.println("匿名的輸入數字"+num);
    }

    public static Scanner anonymous_return(){
        return new Scanner(System.in);
    }

    public static void anonymous_return_scanner(){
        System.out.println("輸入一個數字");
        int num=anonymous_return().nextInt();
        System.out.println("匿名返回的輸入數字"+num);
    }

    public static void main(String[] args) {
        common_class();
        anonymous_class();
        common_scanner();
        anonymous_scanner(new Scanner(System.in));
        anonymous_return_scanner();

    }
}
