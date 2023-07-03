package cm.code.InnerClass;
/*
如果一個事物包含另一個事物 那麼就是一個類包含另一個類
EX 身體和心臟   汽車和引擎

1 成員內部類
2 局部內部類(包含匿名內部類)

一個類的修飾符使用規則
1 外部類 public / (default)
2 成員內部類 public / protect / (default) / private
3 局部內部類 甚麼都不能寫

成員內部類格式
修飾符 class 類名稱{
    修飾符 class 類名稱{
        //
    }
    //
}
內用外 隨意引用   外用內 需要內部對象

如何使用成員內部類
1 間接使用: 在外部類的函式中使用內部類 並且在main中使用外部類函式
2 直接使用:　外部類名稱.內部類名稱 對象名 = new 外部類名稱().new 內部類名稱

如何使用局部內部類
定義: 如果一個內部類被定義在一個函式中 那就稱為局部內部類 只能在此函式中使用 出了就無法使用
格式:
修飾符 class 外部類名稱{
    修飾符 返回類型 外部類函式名稱(參數列表){
        class 局部內部類名稱{
            //
        }
     //
    }
}
局部內部類 如果希望使用所在函式的局部變數 那麼這個局部變數必須是 [有效final]
原因
1 new出來的對象在heap內存當中
2 局部變數是跟著函式走的 在stack內存當中
3 函式運行結束後 立刻出heap局部變數立刻就消失
4 但是new出來的對象會在heap中存在直到整個消失

匿名內部類 如果interface的實現類(或是父類的子類) 只需使用一次
格式:
interface名稱 對象名 = new interface名稱{
    override所有抽象函式
}

對格式"new interface名稱{...}"進行解析
1 new代表創建對象的動作
2 interface名稱就是匿名內部類需要實現哪個interface
3 {...}這才是匿名內部類的內容

注意:
1 匿名內部類 在【創建對象】的時候 只能使用唯一一次
如果希望多次創建對象 而且內容一樣的話 那就必須使用實現類來實行
2 匿名對象   在【使用函式】的時候 只能使用唯一一次
如果希望同一個對象 使用多次函式 那麼就必須給對象起個名
3 匿名內部類是省略【實現類/子類名稱】 但是匿名對象是省略【對象名稱】
 */
public class Main {
    public static void test(){
        Car num1= new Car();    //創造一個外部對象
        num1.turnOn();          //外部對象內的函式 去使用內部類的   <<<  間接使用

        System.out.println("============================================");

        Car.engine Num1 =new Car().new engine();
        Num1.on();              //直接使用內部類的函式

        System.out.println("============================================");

        System.out.println("展示重名如何顯示");
        Num1.showNum();

        System.out.println("============================================");

        System.out.println("展示成員內部類");
        num1.innerClassMethod();

        System.out.println("============================================");

        System.out.println("產生普通的實現類對象");
        InterfaceImpl one =new InterfaceImpl();
        one.method();

        System.out.println("多態的interface 對象");
        Interface two =new InterfaceImpl();
        two.method();

        System.out.println("匿名內部類的使用");
        Interface three = new Interface() {
            @Override
            public void method() {
                System.out.println("interface名稱>對象名 匿名內部類的函式");
            }
        };
        three.method();

        System.out.println("匿名內部類+匿名對象的使用");
        new Interface() {
            @Override
            public void method() {
                System.out.println("interface名稱>對象名 匿名內部類的函式");
            }
        }.method();

    }

    public static void main(String[] args) {
        test();
    }
}
