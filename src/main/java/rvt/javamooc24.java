package rvt;
public class javamooc24 {
    public static void main(String[] args){
       PrintTriangle(5);
       ChristmasTree(10);
    }
    public static void PrintTriangle(int number) {
        for(int i = 1; i <= number; i++) {
            PrintSpaces(number - i);
            PrintStars(i);
            System.out.println();
        }
    System.out.println();
    }

    public static void PrintSpaces(int number) {
        for(int i = 0; i < number; i++) {
        System.out.print(" ");
        }
    }


    public static void PrintStars(int number) {
        for(int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }
    
    

    public static void ChristmasTree(int number) {
        for(int i = 1; i <= number; i++) {
            Spaces(number - i);
            Stars(i * 2 - 1);
            System.out.println();
        }
            Root(number - 2);
        }
    

    public static void Spaces(int number) {
        for(int i = 0; i < number; i++) {
        System.out.print(" ");
        }
    }


    public static void Stars(int number) {
        for(int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }

    public static void Root(int number) {
    for(int x = 0; x < 2; x++){
        for(int y = 0; y < number; y++) {
            System.out.print(" ");
        }
        System.out.println("***");
    }
    
    }
}
    
    
    
    
    


