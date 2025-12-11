package rvt;

public class javamooc52 {
    public static void main(String[] args) {
        counter x = new counter(5);
        System.out.println("Initial value: " + x.value());

        x.increase();
        System.out.println("After increase(): " + x.value());

        x.decrease();
        System.out.println("After decrease(): " + x.value());

        x.increase(10);
        System.out.println("After increase(10): " + x.value());

        x.decrease(4);
        System.out.println("After decrease(4): " + x.value());
    }
    
    public static class counter{
        private int number;
        public counter(int startValue){
            this.number = startValue;
        }
        public counter(){
            this.number = 0;
        }

        public int value(){
            return this.number;
        }
        public void increase(){
            this.number ++;
        }
        public void decrease(){
            this.number --;
        }
        public void increase(int increaseBy){
            if(increaseBy < 0){
                increaseBy = 0;
            }
            this.number += increaseBy;
        }
        public void decrease(int decreaseBy){
            if(decreaseBy < 0){
                decreaseBy = 0;
            }
            this.number -= decreaseBy;
        }


    }
}
