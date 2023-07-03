package cm.code.Iterface.Defult;

public class InterfaceDefaultMethod implements MyInterfaceDefault {
    @Override
    public void method(){
        System.out.println("Override下的抽象函式");
    }

    @Override
    public void method2() {
        System.out.println("Override下的default函式");
    }


}
