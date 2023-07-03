package cm.code.class_train;
/*
    匿名類別(Anonymous class)
    格式:
    new 類別名稱();
    如果要使用
    new 類別名稱().XXX;

    ***只能使用一次***


 */
public class Anonymous {
    private String name;

    public Anonymous() {
    }

    public Anonymous(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("顯示的名字:"+this.name);
    }

}
