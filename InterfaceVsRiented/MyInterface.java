package cm.code.InterfaceVsRiented;
/*
這個子interface有 4個abstract函式
methodA         來自MyInterfaceA
methodB         來自MyInterfaceB
methodCommon    來自MyInterfaceA和MyInterfaceB
method          來自自己本身
 */
public interface MyInterface extends MyInterfaceA,MyInterfaceB{
    public abstract void method();

    @Override
    default void defaultMethod() {

    }
}
