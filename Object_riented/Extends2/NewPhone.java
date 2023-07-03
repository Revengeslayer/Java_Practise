package cm.code.Object_riented.Extends2;

public class NewPhone extends Phone {
    // 子繼承功能 所以不用再打 call 和 send

    //override 可以做新增功能
    @Override
    public void show(){
        super.show(); //這個會讓你沒有出現在該類別的內容都跑出來
        System.out.println("顯示頭像");
    }
}
