package cm.code.Object_riented.Polymorphism;

public class father {
    int num =40;
    int Money =100;
    public void method(){
        System.out.println("這是父函式");
    }
    public void methodFa(){
        System.out.println("這是父特有函式");
    }

    public void showFaMoney(){
        System.out.println("父的: "+this.Money);
    }

    public void showMoney(){
        System.out.println("父的: "+this.Money);
    }
}
