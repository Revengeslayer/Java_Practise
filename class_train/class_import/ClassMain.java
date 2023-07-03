package cm.code.class_train.class_import;

public class ClassMain {
    public static void main(String[] args) {
        Student stu =new Student();
        stu.setAge(28);
        stu.setName("洪某某");

        System.out.println("姓名: "+stu.getName()+" 年齡: "+stu.getAge());
        System.out.println("======================================");
        Student stu2 = new Student("張某某",28);
        System.out.println("姓名: "+stu2.getName()+" 年齡: "+stu2.getAge());
    }
}
