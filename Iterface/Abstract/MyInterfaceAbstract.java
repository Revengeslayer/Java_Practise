package cm.code.Iterface.Abstract;
/*
    interface 都可以定義抽象函式

    抽象格式:
    public abstract 返回類型 函式名稱 (參數列表);

    注意事項:
    1. interface的抽象函式 修飾符都必須是兩個固定的關鍵字 public abstract
    2. 這兩個關鍵字 可以選擇性省略
 */
public interface MyInterfaceAbstract {

    public abstract void method();

    public void method2();

    abstract void method3();

    void method4();
}
