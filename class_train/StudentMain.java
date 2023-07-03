package cm.code.class_train;
/*
    1 類別不能夠單獨使用 需要一個主函式
    2 如果類別檔案不再同一個package 需要
      import xx.xx.xx.類別檔案
    3 使用方法
      類別名稱 變數名稱 =new 類別名稱();
      Student stu    =new Student();
      使用類別中的參數
      stu.name="789";
      使用類別中的Method
      stu.eat();
 */
public class StudentMain {
    public static void main(String[] args) {
        Student stu =new Student();
        stu.name="洪某某";
        stu.age=28;
        System.out.println(stu.name);
        System.out.println(stu.age);
        stu.eat();
        stu.sleep();
        stu.study();
    }
}
