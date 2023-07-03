package cm.code.Object_riented;

public class Person {
    String name;
    private int age;

    public void show(){
        System.out.println("我叫 "+name+" , 年齡: "+age);
    }

    public void setAge(int num) {
        if(num>0 && num<120) {
            this.age = num;
        }
        else{
            System.out.println("年齡不合理");
            this.age = 0;
        }

    }

    public int getAge(){
        return age;
    }
}
