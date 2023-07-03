package cm.code.Object_riented.Extends1;
//繼承父類
public class Clown extends Shower{

    public Clown() {
        //super(); //可以不寫
        super(20);
        System.out.println("創建Clown類");
    }
    @Override
    public void talk(){
        System.out.println("Clown謝謝大家");
        System.out.println();
    }
}
