package cm.code.Object_riented.Polymorphism;

public class son extends father{
    int num =10;
    int Money =1;
    @Override
    public void method() {
        System.out.println("這是子函式 orverride父函式");
    }

    @Override
    public void showMoney() {
        System.out.println("子的: "+this.Money);
    }

    public void sonMethod() {
        System.out.println("子的特有函式");
    }
}
