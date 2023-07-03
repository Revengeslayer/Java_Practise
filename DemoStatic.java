package cm.code;
/*
    static 會產生共享的狀態 屬於類別 不屬於對象
    如果放在類別中 修飾參數 會直接將資料放入裡面 並且每個對象都能夠使用
    如果放在類別中 修飾函式 可以直接 類別名稱.函式即可使用 如果在該類底下使用 不需要 類名稱.
        Class room= new Class();
        Class.show();//即可使用 並且建議這麼寫
        room.show(); //也對但是不推薦使用

    static 只能訪問 static 不可以訪問 nonstatic
    ［記憶體中 [先]有靜態資料 [後]有非靜態資料］
    所以 先物不知後物

    static 不能使用 this

    靜態代碼塊的格式

    public class 類名稱{
        參數
        static{
            //靜態代碼塊內容
        }
        函式
    }
    當首次使用 就只使用一次  第二次以後不再使用
 */
public class DemoStatic {
}
