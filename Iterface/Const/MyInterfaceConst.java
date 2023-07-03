package cm.code.Iterface.Const;
/*
interface也可以定義"成員變數"但是必須使用 public static final 3個關鍵字來修飾這其實是interface的常數
格式:
public static final 數據類型 常數名稱 = 數值;
注意:
一旦使用final 不可以改變
interface的常數 可以省略 public static final 不寫實際也是存在
interface的常數 一定要賦值
interface的常數 使用大寫名稱 並使用下畫線
 */
public interface MyInterfaceConst {
    public static final int NUM_C =10;
    public abstract void method();
    public default void common(){
        System.out.println("MyInterfaceConst 下的 Default common");
    }
}
