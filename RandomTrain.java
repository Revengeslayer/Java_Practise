package cm.code;

import java.util.Random;
import java.util.Scanner;

/*
    1 存取路徑
    2 生成Random類別
    3 使用
      int num=類別名稱.nextInt();//隨機生成int範圍內的整數(有保含正負)
      int num=類別名稱.nextInt(x);//隨機生成[0,x)範圍內的整數 //0~x-1
*/
public class RandomTrain {
    public static void commonRandom(){
        Random r=new Random();
        int num = r.nextInt();
        System.out.println("沒有範圍的Random:"+ num);
    }
    public static void boundRandom(){
        Random r=new Random();
        int num = r.nextInt(10);
        System.out.println("有範圍的Random:"+ num);
    }
    public static void game(){
        Random r =new Random();
        int num =r.nextInt(100)+1; //[1,101) 1~100
        System.out.println("遊戲開始 請猜出遊戲數字(1~100)");
        while (true){
            System.out.println("請輸入一個數字: ");
            Scanner sc =new Scanner(System.in);
            int answer =sc.nextInt();

            if(answer>num){
                System.out.println("比答案大");
            }else if(answer<num){
                System.out.println("比答案小");
            }else{
                System.out.println("猜中答案");
                break;
            }
        }
    }

    public static void main(String[] args) {
        commonRandom();
        boundRandom();
        game();
    }
}
