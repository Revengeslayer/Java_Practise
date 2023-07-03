package cm.code;
//java 多為類型態 所以都必須要使用import 除非程式處於java.long
import java.util.Scanner; //標準寫法
/*
1. 搜尋路徑(import)
2. 創建
    類名稱 變數名稱=new 類名稱()
3. 使用
    對象名.成員方法

    鍵盤輸入數字(int) int num = 對象名稱.nextInt();
    鍵盤輸入字串(String) String str = 對象名稱.next();
 */

public class In_Out {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //把滑鼠放在Scanner 按Alt+Enter 會自動幫你import

        int num = sc.nextInt();
        System.out.println("輸入的數字為: "+num);

        String str = sc.next();
        System.out.println("輸入的字串為: "+str);
    }
}
