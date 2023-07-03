package cm.code;
/*
    String 在於 Java.lang.String中 //可以不需導路徑
    Java中 String都是用("XXX")來實現

    String 特性:
    *1. String 永不改變內容值
     2. 因不可以改變內容值 所以可以共享
     3. String 是由char[]所組成 以byte為單位

    String類別 底下常用的函式

    public boonlean equals(Object obj) 任何變數都只要是類別都可以使用 但類別是String時 會判斷是否相同
    如果是一個為常數 一個為變數要使用 >>>>  常數.equals(變數)
    public boonlean equalsIgnoreCase(Object obj) 忽略大小寫

    public int length() 顯示長度

    public String concat(String str) 將目前得字串+str變成新字串

    public char charAt(int index) 讀取指定位置的char

    public int indexOf(String str) 找該字串 第一次出現的位置 沒有就為-1

    public String substring(int index) 擷取參數位置到字串尾 返回新字串 但是原有的字串不會被更改

    public String substring(int begin, int end) [begin,end) 包含begin~end-1之間的資料
    但是原有的字串不會被更改 除非你是拿原始值

    public char[] toCharArray() 將該字串全變成char

    public byte[] getBytes() 獲得該字串底層的bytearray

    public String replace (CharSequence oldString, CharSequence newString)
    將所有的老字元換成新的字元 並返回結果 但是原有的字串不會被更改 除非你是拿原始值

    public String[] split(String regex) 按照參數 分割若干份 但是原有的字串不會被更改 除非你是拿原始值

    split的參數為一個"正則表達式" 因此要以 \\X 來寫
 */
public class TrainString {

    public static void stringPool(){
        /*
            當直接 " "時 就會把資料丟入StingPool內
            如果使用new時 則不會丟入StingPool內
            基本型態 如果使用 == 會判定該變數的資料
            引用型態 如果使用 == 會判定該變數的位址

         */
        //使用" " 丟入StringPool
        String str1 ="張某";
        String str2 ="張某";
        //使用char 組成String 但是不會丟入StringPool
        char[] ArrayChar={'張','某'};
        String str3 =new String(ArrayChar);

        System.out.println("str1: "+str1);
        System.out.println("str2: "+str2);
        System.out.println("str3: "+str3);
        System.out.println("使用==做判斷");
        System.out.println("str1==str2?: "+(str1==str2));
        System.out.println("str1==str3?: "+(str1==str3));
        System.out.println("str2==str3?: "+(str2==str3));

    }

    public static void commonUseString(){
        String str1 ="123";
        String str2 ="123";

        char[] ArrayChar ={'1','2','3'};
        String str3 = new String(ArrayChar);
        //string.equrals
        System.out.println("str1: "+str1);
        System.out.println("str2: "+str2);
        System.out.println("str3: "+str3);
        System.out.println("使用.equals做判斷");
        System.out.println("str1==str2?: "+(str1.equals(str2)));
        System.out.println("str1==str3?: "+(str1.equals(str3)));
        System.out.println("str2==str3?: "+(str2.equals(str3)));
        System.out.println("\"123\".equrals(str3)?: "+("123".equals(str3)));

        //string.equralsIgnoreCase
        String str4 ="aBc";
        String str5 ="abc";
        System.out.println("str4: "+str4);
        System.out.println("str5: "+str5);
        System.out.println("str4.equalsIgnoreCase(str5) "+(str4.equalsIgnoreCase(str5)));

        //string.length
        System.out.println("str5長度: "+str5.length());

        //str5.concat(str4)
        String str6= str5.concat(str4);
        System.out.println(str6);

        //str6.charAt(2)
        System.out.println("str6 第3個位置的data" + str6.charAt(2));

        //str6.indexOf("ca")
        System.out.println("在str6中第一次出現ca位置 " + str6.indexOf("ca"));

        //str6.substring(2)
        System.out.println("str6 2~尾巴的資料 "+str6.substring(2));

        //str6.substring(3,5)
        System.out.println("str6 3~(5-1)的資料 "+str6.substring(3,5));

        //str6.toCharArray()
        System.out.println("str6.toCharArray()存的位址: "+str6.toCharArray());
        System.out.print("char組顯示: ");
        char []toChar =str6.toCharArray();  //傳回地址值
        for (int i = 0; i < toChar.length; i++) {
            System.out.print(toChar[i]+" ");
        }
        System.out.println();

        //str6.getBytes()
        byte []toByte =str6.getBytes();  //傳回地址值
        System.out.println("str6.getBytes()存的位址: "+str6.getBytes());
        System.out.print("byte組顯示: ");
        for (int i = 0; i < toByte.length; i++) {
            System.out.print(toByte[i]+" ");
        }
        System.out.println();

        //str7.replace("a","c")
        String str7="adfadfgaatttt";
        System.out.println("str7: "+str7);
        System.out.println("將str7中a做更換為c "+str7.replace("a","c"));
        System.out.println("str7: "+str7);

        //
        String str8="123,456,789";
        System.out.println("str8: "+str8);
        String []split =str8.split(",");  //傳回地址值
        System.out.println("str8.split(\",\")存的位址: "+str8.split(","));
        System.out.print("將字串分割 ");
        for (int i = 0; i < split.length; i++) {
            System.out.print(split[i]+" ");
        }
        System.out.println();

        String str9="123.456.789";
        System.out.println("str9: "+str9);
        String []split2 =str9.split(",");  //傳回地址值
        System.out.println("str9.split(\".\")存的位址: "+str9.split("."));
        System.out.print("將字串分割 ");
        for (int i = 0; i < split2.length; i++) {
            System.out.print(split2[i]+" ");
        }//因"正則表達式緣故 要在.之前加上\\
        System.out.println("失敗");
        String []split3 =str9.split("\\.");  //傳回地址值
        System.out.println("str9.split(\"\\\\.\")存的位址: "+str9.split("\\."));
        System.out.print("將字串分割 ");
        for (int i = 0; i < split3.length; i++) {
            System.out.print(split3[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        stringPool();
        commonUseString();
    }
}
