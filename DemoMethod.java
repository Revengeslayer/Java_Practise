package cm.code;
/*
	method中有分為
	1 有返回值  通常函式會有其返回類型 int char ... 可以a單獨使用 b結合輸出 c賦值 使用
	2 沒有返回值 通常函式會有void 				   可以a單獨使用 不可b結合輸出 c賦值
	3 method內不可以在定義method
*/
public class DemoMethod{
    public static void main(String[] args){
		farmer();
		seller();
		cooker();
		System.out.println(buy1("egg","fish"));
		me();
    }
	public static void farmer(){
		System.out.println("種");
	}
	public static void seller(){
		System.out.println("賣");
	}
	public static void cooker(){
		System.out.println("煮");
	}
	public static String buy1(String a,String b){
		return "我買了"+a+"和"+b;
	}

	public static void me(){
		System.out.println("吃");
	}


}