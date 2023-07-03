package cm.code.Object_riented.Extends2;
/*
繼承和override的使用例子
 */
public class Extends2 {
    public static void main(String[] args) {
        Phone old =new Phone();
        System.out.println("舊的");
        old.call();
        old.send();
        old.show();
        System.out.println();

        System.out.println("新的");
        NewPhone New= new NewPhone();
        New.call();
        New.send();
        New.show();
    }
}
