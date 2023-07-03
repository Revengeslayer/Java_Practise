package cm.code.InnerClass;

public class Car { //外部類
    int num=10;


    public Car() {
    }

    public Car(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void turnOn(){
        new engine().on();
        System.out.println("汽車發動");
    }

    public void innerClassMethod(){
        int final_num=5;
        int un_final_num;


        class seat{
            public void numbersOfSeat(){
                System.out.println("4張椅子");
            }

            public void final_num(){
                System.out.println(final_num); //因為final_num不會被更改所以正確
                //un_final_num=8; //如果在這裡賦值 因為final_num()生命週期會比 class seat短
                                  //un_final_num會被更改資料 因此錯誤
                //System.out.println(un_final_num);
            }
        }

        seat user =new seat();
        user.numbersOfSeat();
    }

    public class engine{    //內部類(成員內部類)

        int num=100;

        public engine() {
        }

        public engine(int num) {
            this.num = num;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public void on(){
            System.out.println("引擎運作");
        }

        public void showNum(){
            int num= 100000;
            System.out.println(num+" 內部類的 成員函式內的變數");
            System.out.println(this.num+" 內部類的 成員變數");
            System.out.println(Car.this.num+" 外部類的 成員變數");
        }
    }
}
