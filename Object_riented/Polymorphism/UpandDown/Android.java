package cm.code.Object_riented.Polymorphism.UpandDown;

public class Android extends Ipad{

    @Override
    public void capacity() {
        System.out.println("7700");
        System.out.println("可換電池");
    }
    public void googlePlay(){
        System.out.println("Android APP 下載(Android 特有函式)");
    }
}
