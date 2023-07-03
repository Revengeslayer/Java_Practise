package cm.code.Iterface.Defult;
/*
    interface默認的函式
    格式:
        public default 返回類型 函式名稱(參數列表){
            //
        }
    默認函式:主用是新增到interface 這樣就可以讓多個實現類都不用新增
 */
public interface MyInterfaceDefault {

    public abstract void method();

    public default void method2(){
        System.out.println("向上尋找到的Default函式 底下有override");
    }

    public default void method3(){
        System.out.println("向上尋找到的Default函式");
    }

    public static void method4(){
        System.out.println("靜態函式 所以可以 MyInterfaceDefault.method4() 來調用");
    }

    public default void common(){
        System.out.println("MyInterfaceDefault 下的 Default common");
    }
}
