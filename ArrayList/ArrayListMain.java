package cm.code.ArrayList;

import java.util.ArrayList;

/*
    ArrayList<E> 變數名稱 = new ArrayList<E>(); E:代表這個List存的型態 右側的E可以省略
    public boolean add(E e); 將資料存入集合內 返回值為是否加入成功 //某些集合的add會加入失敗
    public E get(int index); 顯示集合內第index-1的資料          //返回值為 第index-1的資料
    public E remove(int index); 提取(刪除)集合內第index-1的資料  //返回值為 第index-1的資料
    public int size();       顯示集合內的長度                   //返回值為 集合個數
 */
public class ArrayListMain {

    public static ArrayList<ArrayListClass> AL_class_return(ArrayList<ArrayListClass> list){
        ArrayList<ArrayListClass> return_list =new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAge()%2==0){
                return_list.add(list.get(i));
            }
        }
        return return_list;
    }
    //如果age為偶數 則回傳

    public static void AL_class_test(){
        ArrayList<ArrayListClass> ALC_String=new ArrayList<>();
        System.out.println("ALC_String 初始值的樣子: "+ALC_String);
        ArrayListClass one =new ArrayListClass();
        ArrayListClass two =new ArrayListClass("林XX",20);
        ArrayListClass three =new ArrayListClass("王XX",21);
        ALC_String.add(one);    //將類別的位址存進去
        ALC_String.add(two);
        ALC_String.add(three);
        System.out.println("新增3個後: "+ALC_String);

        System.out.println("迴傳list練習:");
        //將list丟入函式 選出年齡為偶數的元素 放入新的list迴傳後輸出
        ArrayList<ArrayListClass> catch_return=AL_class_return(ALC_String);
        for (int i = 0; i < catch_return.size(); i++) {
            System.out.println("第"+(i+1)+"個元素:"+" 姓名: "+catch_return.get(i).getName()+" 年齡: "+catch_return.get(i).getAge());
        }

    }//ArrayList結合類別

    public static void AL_test(){
        ArrayList<String> AL_String =new ArrayList<>();
        System.out.println("AL_String 初始值的樣子: "+AL_String);
        AL_String.add("張XX");
        AL_String.add("李XX");
        AL_String.add("洪XX");
        System.out.println("新增3個後: "+AL_String);
        System.out.println("AL_String長度: "+AL_String.size());
        System.out.println("顯示你要的元素: "+AL_String.get(1));
        System.out.println("目前元素: "+AL_String);
        System.out.println("刪除的元素: "+AL_String.remove(1));
        System.out.println("AL_String長度: "+AL_String.size());
        System.out.println("刪除後的AL_String: "+AL_String);

    }//測試環境

    public static void main(String[] args) {
        AL_test();
        AL_class_test();
    }
}
