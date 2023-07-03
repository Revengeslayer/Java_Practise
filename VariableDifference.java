package cm.code;
/*
    Method的參數為局部變數

    1 定義的位置不一樣[重要]
    局部變數:在Method內
    全域變數:直接寫在程式內
    2 作用範圍不一樣[重要]
    局部變數:只能在Method內，超出範圍就出錯
    全域變數:全部都可以用
    3 初始值不同[重要]
    局部變數:沒有初始值，要賦值才可使用
    全域變數:沒有賦值則使用初始值
    4 內存位置不一樣
    局部變數:位於Stack中
    全域變數:位於Heap中
    5生命週期
    局部變數:隨method進stack，隨著method出stack而消失
    全域變數:隨著對象創建而誕生，隨著對象消失而刪除
*/
public class VariableDifference {
    int age;//全域變數
    public void MethodA() {
        String name="789";//局部變數
        System.out.println(name);
        System.out.println(age);
    }

    public void MethodB(int pra){
        int num;
        //System.out.println(num); num要賦值才能使用
        System.out.println(pra);
        //Method的定義參數為局部變數 當method被使用時 pra也會被賦值
    }
}
