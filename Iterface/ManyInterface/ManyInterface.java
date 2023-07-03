package cm.code.Iterface.ManyInterface;

import cm.code.Iterface.Const.MyInterfaceConst;
import cm.code.Iterface.Defult.MyInterfaceDefault;

//只有一個父類
public class ManyInterface /*extends Object*/ implements MyInterfaceConst, MyInterfaceDefault {
    @Override
    public void method(){
        System.out.println("多個interface  抽象函式(借用default)");
        MyInterfaceDefault.method4();
    }

    @Override
    public void common() {
        System.out.println("這裡 兩個 interface都有common函式 因此要override");
    }
}
