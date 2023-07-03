package cm.code.Object_riented.Extends1;
/*
在繼承關係中 子類別就是一個父類別 子類別也可以當作父類別來看
EX: 父類是員工 子類是講師 那子類也是員工
父類無法使用子類 子類可以使用父類

父類格式:
public class 父類名稱{
    //內容
}

子類格式:
public class 子類名稱 extends 父類名稱{
    //內容...
}

在父子類的繼承關係中 如果成員變數重名 則創建子類對象時 有兩種
[先看屬於哪個類別 沒有則往上找 不會往下找]
直接 透過子類對象訪問成員變數
    等號左邊是誰哪個類別就用那個類別 沒有就上找
間接 通過成員函式訪問成員函式
    看函式屬於哪個類別沒有就向上找

如果要遇到3個地方都有 num 則必須根據以下格式
局部變數:       直接使用
該類成員變數:    this.成員變數
父類成員變數:    super.成員變數

override
繼承當中 函式名稱一樣 參數列表[也一樣]
overload
        函式名稱一樣 參數列表[不一樣]
函式的override 如果是子類別 則使用子類別
override 注意事項:
1 父類別 子類別 函式名稱 函式的參數列表都要一樣
@Override 寫在函式前面 用來檢測是不是有效的 這個註解不寫 也會產生 override
2 子類別函式的返回值必須<=父類的返回值範圍 [重要]
前提: java.lang.Object類是所有類的最高父類別,java.lang.String就是Object的子類
3 子類函式的權限修飾必須>=父類的權限修飾   [重要]
    public>protected>(default)>private
    (default)不是關鍵字default 而是甚麼都不寫留空

繼承中 父類別 子類別的建構方法
1. 子類別的建構方法當中有一個隱含的"super()"(無參建構) 所以會先創父類別 才創子類別
2. 可以通過super來建構來調用父類的重載構造 (意思是 如有有參建構式 則必須寫一super(參數))
3. super的父類建構調用 必須是子類建構函式的第一個語句 不夠一個子類建構調用多次super建構

子類必須調用父類的建構方法 不寫則贈送隱含的super() 寫了則用你規定的 super() 只能有一個 並且是 第一語句
 */

public class Extends {
    public static void test(){
        Shower sh =new Shower();
        System.out.println("sh自己使用該類的函式: ");
        System.out.println("sh自己使用類別定義的num: "+sh.num);
        sh.show();
        System.out.println("sh使用自己該類的函式: ");
        System.out.println("建構的year:" +sh.year);
        sh.talk();

        Lion li =new Lion();
        System.out.println("li繼承父類的函式: ");
        System.out.println("li優先使用自己類別定義的num: "+li.num);
        li.show();
        System.out.println("li沒有該類的函式 使用父類的: ");
        System.out.println("建構的year:" +li.year);
        li.talk();

        Clown cl =new Clown();
        System.out.println("cl繼承父類的函式: ");
        System.out.println("cl沒有自己定義的num 則使用父類別的: "+cl.num);
        cl.show();
        System.out.println("cl使用自己該類的函式: ");
        System.out.println("建構的year:" +cl.year);
        cl.talk();

        li.Ho();
    }
    public static void main(String[] args) {

        test();
    }
}
