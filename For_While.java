package cm.code;
/*
    基本4步驟
    1 初始化語句:一開始就執行 (不一定是 設立初始值 可以是參數)
    2 條件判斷:  成立就執行 不成立就就退出
    3 循環體:    內容物
    4 前進語句:  每次結束循環後執行 之後讓 條件判斷 是否成立

    死循環通常使用
    while(true){
        內容
    }
*/
public class For_While {
    public static void main(String[] args) {
        for (int i = 1; i <10 ; i++) {
            System.out.println("for數字"+i);
        }
        int j=0;
        while (j<10)
        {
            System.out.println("while數字"+j);
            j++;
        }
        int k=0;
        do {
            System.out.println("do_while數字"+k);
            k++;
        }while (k<10);
    }
}
