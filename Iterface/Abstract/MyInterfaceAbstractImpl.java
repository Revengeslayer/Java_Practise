package cm.code.Iterface.Abstract;

import cm.code.Iterface.Abstract.MyInterfaceAbstract;

public class MyInterfaceAbstractImpl implements MyInterfaceAbstract {

    @Override
    public void method() {
        System.out.println("有兩個修飾 abstract 和 public");
    }

    @Override
    public void method2() {
        System.out.println("去掉abstract");
    }

    @Override
    public void method3() {
        System.out.println("去掉public");
    }

    @Override
    public void method4() {
        System.out.println("都去掉");

    }
}
