package cm.code;
/*
    Overload:"多個函式名稱一樣"，但是"參數列表不一樣"

    參數列表不一樣有
    1 型態相同數量不同
    2 參數型態不同
    3 參數型態順序不同
*/
public class MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(10.0,20.0));
        System.out.println(sum(10,20,30,40));
        System.out.println(sum(10,20,30));
    }
    public static int sum(int a,int b){
        System.out.println("呼叫2個參數的");
        return a+b;
    }

    public static int sum(double a,double b){
        System.out.println("呼叫2個參數的(double)");
        return (int)(a+b);
    }//此為型態的不同

    public static int sum(int a,double b){
        System.out.println("呼叫2個參數的(int double)");
        return (int)(a+b);
    }//此為型態的不同

    public static int sum(double a,int b){
        System.out.println("呼叫2個參數的(double int)");
        return (int)(a+b);
    }//此為型態的不同+順序不同

    public static int sum(int a,int b,int c ){
        System.out.println("呼叫3個參數的");
        return a+b+c;
    }
    public static int sum(int a,int b,int c,int d){
        System.out.println("呼叫4個參數的");
        return a+b+c+d;
    }
}
