package cm.code.Iterface.Private;
/*
    1. 普通私有 解決多個默認函式擁有共同code
        private 返回類型 函式名稱(參數列表){
            //
        }
    2. 靜態私有 解決多個靜態函式擁有共同code
        private static 返回類型 函式名稱(參數列表){
            //
        }
 */
public interface MyInterfacePrivate {
    public default void method(){
        System.out.println("default使用private");
        common();
//        System.out.println("123");
//        System.out.println("456");
//        System.out.println("789");
    }
    public default void method2(){
        System.out.println("default使用private");
        common();
//        System.out.println("123"); //上下code都相同 所以開一個函式 但又不要給底下使用
//        System.out.println("456"); //所以用 private
//        System.out.println("789");
    }
    private void common(){
        System.out.println("default使用private 的共有函式");
        System.out.println("123");
        System.out.println("456");
        System.out.println("789");
    }

    public static void method3(){
        System.out.println("static使用private");
        common2();

//        System.out.println("AAA");
//        System.out.println("BBB");
//        System.out.println("CCC");
    }
    public static void method4(){
        System.out.println("static使用private");
        common2();
//        System.out.println("AAA");  //static修飾下 使用private
//        System.out.println("BBB");
//        System.out.println("CCC");
    }
    private static void common2(){
        System.out.println("static使用private 的共有函式");
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
