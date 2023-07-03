package cm.code.Object_riented.Extends3;

public class Father {
    int num=10;
    public Father() {
        System.out.println("父無參建構");
    }

    public Father(int n) {
        System.out.println("父有參建構");
    }

    public void method(){
        System.out.println("父函式");
    }
}
