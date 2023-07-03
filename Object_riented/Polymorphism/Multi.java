package cm.code.Object_riented.Polymorphism;
/*
多態: 父類引用子類對象【主體是父類】
    格式:
        父類名稱 對象名稱 =new 子類名稱();
        接口名稱 對象名稱 =new 實現類名稱();
    總結: 多態可以讓對象產生同時產生兩種類別 父和子

    成員變數 (編譯看左邊 執行看左邊)
    1 直接通過對象名稱使用成員變數(看等號左邊是誰優先使用 沒有則向上)
    2 間接通過成員函式使用(看該函式屬於誰 優先使用誰 沒有則向上)

    成員函式 (編譯看左邊 執行看右邊)
    1 看new的是誰則是誰 沒有則向上找


 */

public class Multi {
    public static void test(){
        son test =new son(); //正常創造子類對象
        test.method();
        test.methodFa();    //子類繼承父類函式
        test.sonMethod();
        System.out.println("=============================");
        //父類引用 指向右側子類對象
        father test1 =new son();    //多態的寫法 test1 還是一個[子類別的對象]當主體
        test1.method();
        test1.methodFa();
        //test1.sonMethod(); //本體為父類所以不能使用子類函式
        //直接通過對象名稱使用成員變數(看等號左邊是誰優先使用 沒有則向上)
        System.out.println(test1.num);

        //間接通過成員函式使用(看該函式屬於誰 優先使用誰 沒有則向上)
        test1.showFaMoney();
        test1.showMoney();//因為函式被override所以優先使用 子的 因為 test1為子實現對象

    }
    public static void main(String[] args) {
        test();
    }
}
