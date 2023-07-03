package cm.code.class_train.class_import;
/*
建構子(Contructor) 是專門來創造對象的方法，new也是在使用Contructor
Contructor的格式:

public 類名稱(變數型態 變數名稱){
    方法體
}
注意事項:
1. Contructor的名稱必須和所在的類名稱一樣
2. Contructor不需要返回值和返回型態，void都不寫
3. 如果沒有寫Contructor 編譯器會自動幫你寫一個 default Contructor
default Contructor的格式:

public 類名稱(){}
4. 一旦編寫至少1個Contructor系統不會在預設default Contructor
，必須自己寫一個default Contructor才是合理的
5. Contructor也可以使用重載(overloading) 函式名相同 參數列表不同
 */

/*
標準的類有下列4種規範:
1. 所有的成員變量，都是private
2. 每一個成員變量設置一對Getter Setter
3. 寫一個無參數的Contructor
4. 寫至少一個有參數的Contructor

此為"java bean"

alt+insert 可以快速幫你生成 以上
 */
public class Student {
    private String name;
    private  int age;

    public Student() {
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
