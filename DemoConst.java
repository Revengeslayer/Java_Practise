package cm.code;

public class DemoConst{
    public static void main(String[] args){
        //一 字串效果用""包含
        System.out.println("123");  //字串效果
        System.out.println("");     //空字串
        //二 整數常量
        System.out.println(30);
        System.out.println(-30);
        //三 浮點數
        System.out.println(1.5);
        System.out.println(-1.5);
        //四 字元用''最少要有1個東西
        System.out.println(' ');
        System.out.println('A');
        //System.out.println('AB'); 錯誤
        //System.out.println('');   錯誤
        //五 布林值
        System.out.println(true);
        System.out.println(false);
        //六 空常量 null

        int test_number=10;
        //++變數 立刻馬上+1 然後馬上使用
        System.out.println(++test_number);
        //變數++ 先輸出變數 然後再+1
        System.out.println(test_number++);
        System.out.println(test_number);
        //常數無法使用++  //30++ 

        /* byte short char 
        1 如果右側沒有超過範圍 編譯器(javac)會幫你補上 (byte) (short) (char)
        2 如果右側都是常數 編譯器(javac)會幫你補上 (byte) (short) (char)
        */
    }
}