package cm.code.Object_riented.Extends1;
//繼承父類
public class Lion extends Shower{
    int num =5;

    public Lion() {
        super(15);
        System.out.println("創建Lion類");
    }

    public void Ho(){
        int num=100;
        System.out.println("Ho內num: "+num);
        System.out.println("li成員num: "+this.num);
        System.out.println("父類成員num: "+super.num);
    }
}
