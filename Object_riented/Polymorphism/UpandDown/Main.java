package cm.code.Object_riented.Polymorphism.UpandDown;
/*
向上轉型是安全的 但是向上轉型成父類 就無法使用子類的內容 因此要使用向下還原

判斷父類引用對象是哪個子類
格式:
對像 instanceof 類名稱

會得到一個boolean值結果
 */
public class Main {
    public static void instanceof_test(Ipad test_class){

        if (test_class instanceof Apple){
            System.out.println("這是APPLE");
            Apple Apple_user = (Apple) test_class;
            Apple_user.appStore();
        }

        if (test_class instanceof Android){
            System.out.println("這是Android");
            Android Android_user=(Android) test_class;
            Android_user.googlePlay();
        }
    }

    public static void test(){
        //向上轉型
        Ipad user1 = new Apple();
        user1.capacity();
        //user1.appStore; 編譯看左邊 user1是父類 所以無法用子類 函式

        //向下還原
        Apple user1_Apple = (Apple) user1;
        user1_Apple.appStore();

        //也是向下還原 但是 user1的子類是 Apple 你向下轉成 Android 導致錯誤 ClassCastException
        //Android use1_Android =(Android) user1;
        //use1_Android.capacity();

        //向上轉型
        Ipad user2 =new Android();
        user2.capacity();

        //向下還原
        Android user2_Android = (Android) user2;
        user2_Android.googlePlay();

        instanceof_test(user1);
        instanceof_test(user2);

    }

    public static void main(String[] args) {
        test();
    }
}
