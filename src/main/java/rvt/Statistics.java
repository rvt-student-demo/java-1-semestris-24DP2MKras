package rvt;
import java.util.*;

public class Statistics {
    private int sum;
    private int count;
    private double avg;
    ArrayList<Integer> stats = new ArrayList<>();

    public Statistics() {
        
    }

    public void addNumber(int number) {
        stats.add(number);
        sum = sum + number;
        avg = sum * 1.0 / stats.size();
    }

    public int getCount() {
        return stats.size();
    }

    public int sum() {
        return sum;
    }
    public double average() {
        return avg;
    }
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        Statistics evennumbers = new Statistics();
        Statistics oddnumbers = new Statistics();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int number = scanner.nextInt();
        while(number != 1) {
            statistics.addNumber(number);
            number = scanner.nextInt();
            if(number % 2 == 0) {
                evennumbers.addNumber(number);
            }
            if(number % 2 == 1) {
                oddnumbers.addNumber(number);
            }
            if(number == -1) {
                System.out.println("Sum: " + statistics.sum());
                System.out.println("Sum of even numbers: " + evennumbers.sum());
                System.out.println("Sum of odd numbers: " + oddnumbers.sum());
                break;
            }
        }

        
    }
}
