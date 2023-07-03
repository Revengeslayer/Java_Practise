package cm.code;

public class If_Else_Switch {
    public static void main(String[] args) {
        System.out.println("if_else case");
        int a=61;
        if (a>60) {
            System.out.println("pass");
        }
        else if (a==100){
            System.out.println("perfect");
        }
        else {
            System.out.println("fail");
        }
        System.out.println("switch case");
        /*
            case後的條件不能重複

            switch可以接收的型態是
            基本數據類型:int char short byte
            引用數據類型:String euum

            switch case中可以順序顛倒 直到遇到break才會結束
        */
        int b=2;
        switch (b){
            case 1:
                System.out.println("case1");
                break;
            case 2:
                System.out.println("case2");
                break;
            case 3:
                System.out.println("case3");
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}
