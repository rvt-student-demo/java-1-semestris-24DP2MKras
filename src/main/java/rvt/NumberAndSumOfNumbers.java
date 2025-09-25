package rvt;
    import java.util.Scanner;

public class NumberAndSumOfNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int summa = 0;
        int amount = 0;
        while(true) {
            System.out.println("Give a number: ");
            int number = reader.nextInt();
            if(number == 0) {
                break;
            }
            summa = summa + number;
            amount = amount + 1;

        }
        System.out.println("Number of numbers: " + amount);
        System.out.println("Sum of the numbers: " + summa);
        reader.close();
    }
}
