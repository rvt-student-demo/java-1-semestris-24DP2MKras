package rvt;
    import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Give a number: ");
        int number = reader.nextInt();
        if (number % 2 == 0) {
            System.out.println("Number " + number + " is even.");
        } else if (number % 2 != 0) {
            System.out.println("Number " + number + " is odd.");
        }

    reader.close();  
    }
    
}