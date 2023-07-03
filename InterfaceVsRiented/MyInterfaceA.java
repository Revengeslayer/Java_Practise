package cm.code.InterfaceVsRiented;

public interface MyInterfaceA {
    public abstract void methodA();
    public abstract void methodCommon();
    public default void defaultMethod(){

    }
}
