package cm.code.Iterface;

import cm.code.Iterface.Abstract.MyInterfaceAbstractImpl;
import cm.code.Iterface.Const.MyInterfaceConst;
import cm.code.Iterface.Defult.MyInterfaceDefault;
import cm.code.Iterface.Defult.InterfaceDefaultMethod;
import cm.code.Iterface.ManyInterface.ManyInterface;
import cm.code.Iterface.Private.MyInterfacePrivate;
import cm.code.Iterface.Private.MyInterfacePrivateMethod;
import cm.code.Iterface.Static.MyInterfaceStatic;

/*
    interface是多個類的公共規範
    interface是一種引用類型 其抽象函式最為重要

    interface的格式:
    public  interface 名稱{
        //
    }

    生成interface之後 編譯生成字節文件 依然是 .java --> .class

    1. 常數
    2. 抽象函式
    3. 默認函式
    4. static函式
    5. private函式

    interface使用步驟:
    1. interface 不可以直接使用 要一個實現類才能使用 (類似 繼承關係)
        格式:
            public class 實現類名稱 implements interface名稱{
                //
            }
    2. interface的實現 必須 override所有的抽象函式

    3. 創建實現類的對象並使用

    總結: interface(類似父輩)//無法直接使用---implements--> 實現類(父類) -->new對象
    注意: 如果實現類沒有全部override所有抽象函式 那就會變成抽象類 還要在往下生成一些子類
        interface不可以有建構式

        interface下的static函式 可以直接 interface名稱.函式名稱 來使用
        interface下的實現類只能有一個父類 但是可以有多個interface
            格式
            public class 類別名稱 implements 接口名稱A,接口名稱b {
                //
            }
        如果實現類的多個interface存在重複的abstract函式 只需要override一次
        如果實現類沒有override所有的abstract函式 那他就是一個abstract類 要向下開一個實現類
        如果實現類實現多個interface當中存在重複的默認函式 那麼實現類一定要對衝突的默認函式進行override
        一個類如果直接父類的當中父類的函式 和interface的默認函式產生衝突 優先使用父類的函式
 */
public class DemoInterface {
    public static void interface_Test(){
        MyInterfaceAbstractImpl test1 =new MyInterfaceAbstractImpl();
        test1.method();
        test1.method2();
        test1.method3();
        test1.method4();
    }//interface的基本使用
    public static void interface_Default_Test(){
        MyInterfaceDefault test1 =new InterfaceDefaultMethod();
        test1.method();
        test1.method2();
        test1.method3();
    }//interface的drfault使用
    public static void interface_Static_Test(){
        MyInterfaceStatic.method(); //可以直接 interface名稱.函式名稱 來使用

    }//interface如果使用static則可以在static函式下直接 interface名稱.函式名稱 直接使用
    public static void interface_private_Test(){
        MyInterfacePrivate test1 =new MyInterfacePrivateMethod();
        test1.method();
        test1.method2();
        MyInterfacePrivate.method3();
        MyInterfacePrivate.method4();
    }//interface的private使用
    public static void interface_Const_Test(){
        System.out.println("interface下的常數使用: "+ MyInterfaceConst.NUM_C);

    }
    public static void interface_Many_Test(){
        ManyInterface test1 =new ManyInterface();
        test1.method();
        //MyInterfaceDefault.method4(); 跟上面同樣道理
        System.out.print("多個接口找default: ");
        test1.method3();

        test1.common();
    }

    public static void main(String[] args) {
        interface_Test();
        interface_Default_Test();
        interface_Static_Test();
        interface_private_Test();
        interface_Const_Test();
        interface_Many_Test();
    }
}
