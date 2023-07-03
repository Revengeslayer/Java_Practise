package cm.code.Object_riented.Extends3;

public class Son extends Father{
    int num=20;
    public Son() {
        //super(70);
        this(10); //兩者只能擇一
        System.out.println("子無參建構");
    }
    public Son(int n) {
        System.out.println("子有參建構");
    }
    @Override
    public void method(){
        int num=30;
        System.out.println("子函式");
        System.out.println("局部num: "+num);
        System.out.println("this.num: "+this.num);
        System.out.println("super.num: "+super.num);
        System.out.print("this.method2: ");
        this.method2();
    }

    public void method2(){
        System.out.println("子函式2");
    }
}
