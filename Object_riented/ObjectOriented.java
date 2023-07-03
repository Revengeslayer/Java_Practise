package cm.code.Object_riented;
/*
    Object-oriented: 1包裝 2繼承 3多態

    包裝(細節隱藏):
    1 Method
    2 private的使用 如果在該範圍內就可以使用 超出範圍則不可以變動
      如果想要變更private 可以使用 Setter+Getter
      Setter因為是函式所以可以在裡面增加設定

      Setter:函式變數必須和成員的變數型態相同 沒有返回值
      Getter:不能有函式變數                返回值必須和成員的變數相同型態
*/

public class ObjectOriented {
    public static void main(String[] args) {
        Person peo =new Person();
        peo.name="洪某";
        peo.setAge(-28);
        peo.show();
        System.out.println("==============");
        System.out.println("年齡提取 "+peo.getAge());
        System.out.println("==============");

    }
}
