package cm.code.Abstract_Important;
/*
abstract的格式
abstract 函式: 加上abstract關鍵字 去掉{} 直接分號 必須放在abstract類別中
abstract 類別: class前加上abstract關鍵字

abstract注意事項
1 抽象類別不能直接new抽象類對象
2 必須創造一些子類別來繼承abstract的父類
3 子類必須override 抽象父類中的所有abstract函式 並且把 abstract去掉 補上內容
4 有abstract函式必是abstract類別 ，abstract類不一定有abstract函式
 */
public abstract class Abstract {

    public abstract void method();

    public void method2(){
        //
    }
}
