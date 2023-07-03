package cm.code.Object_riented.Extends1;
//定義一個父類別
public class Shower {
    int num =50;
    int year=100000;

    public Shower() {
        System.out.println("創建Shower類");
    }

    public Shower(int year) {
        this.year = year;
    }

    public void show(){
        System.out.println("表演起來");
    }

    public void talk(){
        System.out.println("Shower謝謝大家");
        System.out.println();
    }
}
