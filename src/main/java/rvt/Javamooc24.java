package rvt;

public class Javamooc24 {
    public static void main(String[] args) {
        printStars(4);
        printSpaces(4);
    }
    public static void printSpaces(int number) {
        for( int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }
    public static void printStars(int number) {
        for(int i = 0; i <= number; i++) {
            for (int x = number; x > i; x--) {
            System.out.print(" ");
            }
            for(int y = 0; y < i; y++){
            System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
