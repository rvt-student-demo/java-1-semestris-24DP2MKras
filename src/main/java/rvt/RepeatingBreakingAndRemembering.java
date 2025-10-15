package rvt;
    import java.util.Scanner;

public class RepeatingBreakingAndRemembering {
    public static void main(String[] args) {
        double sum = 0;
        int numbers = 0;
        double average = 0;
        System.out.println("Give numbers: ");
        Scanner reader = new Scanner(System.in);
        
        while (true) {
            int number = reader.nextInt();

            if (number == -1) {
                break;
            }
            numbers = numbers + 1;
            
        sum = sum + number;
        average = sum/numbers;
        }
        System.out.println("Thx! Bye! ");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average:" + average);
    }   
    
}
