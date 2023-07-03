package cm.code.Object_riented.Polymorphism.UpandDown;

public class Apple extends Ipad{

    @Override
    public void capacity() {
        System.out.println("8800");
        System.out.println("不可換電池");
    }

    public void appStore(){
        System.out.println("IOS APP 下載(Apple 特有函式)");
    }
}
