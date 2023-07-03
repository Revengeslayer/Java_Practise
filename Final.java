package cm.code;
/*
final關鍵字代表最終 不可改變的

1 修飾一個類: 當前這個類不能有任何子類 其中所有的成員函式都不能override 但是可以對付父類的函式override
  格式:
  public final class 類名稱{
    //
  }

2 修飾一個函式: 不能被override 其中abstract 和 final 是不能共存的
  格式:
  修飾符 final 返回類型 函式名稱(參數列表){
    //
  }

3 修飾局部變數: 這個變數一旦賦值就不能再被更改
              基本類型: 不可以對變數中的數值改變
              引用類型: 不可以對變數中的位址改變

4 修飾成員變數: 這個變數不能被更改
              1 成員變數具有默認值 但用了final後 就要直接賦值
              2 final的成員變數 要 a 直接賦值 或者 b 建構函式進行賦值 擇一
              3 必須保證類當中所有override的建構函式最終都會對final的成員變數進行賦值 否則直接賦值

 */
public class Final {
}
