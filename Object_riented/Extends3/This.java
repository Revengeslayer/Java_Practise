package cm.code.Object_riented.Extends3;
/*
this:
1. 在本類的成員函式中用來訪問本類別中的成員變數
2. 在本類的成員函式中用來訪問本類別中的成員函式
3. 在本類的建構式中用來訪問本類別中的建構式 //必須是建構的第一個語句 唯一一個
                                     //super 和 this 的建構式只能使用其中一個
 */
public class This {
    public static void test(){
        Son one =new Son();
        one.method();
    }
    public static void main(String[] args) {
        test();
    }
}
