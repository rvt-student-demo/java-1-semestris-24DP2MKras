package rvt;
    import java.util.Scanner;
public class Chapter19 {
    public static void main(String[] args) {
        ex7();
    }
    public static void ex1() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter start! ");
        int start = reader.nextInt();
        System.out.println("Enter end! ");
        int end = reader.nextInt();
        System.out.println();
        while(start <= end) {
            System.out.println(start);
            start++;
        }
    reader.close();
    }
    public static void ex2() {
        Scanner reader = new Scanner(System.in);
        int loopsum = 0;
        System.out.println("Enter N ");
        int N = reader.nextInt();
        int formulasum = (N*(N+1))/2;
        while(N >= 1) {
            loopsum = loopsum + N;
            N--;
        }
        System.out.println("Loop Sum = " + loopsum);
        System.out.println("Formula Sum = " + formulasum);
    reader.close();
    }
    public static void ex3() {
        Scanner reader = new Scanner(System.in);
        int loopsum = 0;
        System.out.println("Enter N ");
        int N = reader.nextInt();
        int formulasum = (N*(N+1)*(2*N+1))/6;
        int sumofcubes =  ((N*(N+1))/2);
        while(N >= 1) {
            loopsum = loopsum + N * N;
            N--;
        }
        System.out.println("Loop Sum = " + loopsum);
        System.out.println("Formula Sum = " + formulasum);
        System.out.println("Sum of cube = " + (sumofcubes * sumofcubes));
    reader.close();
    }
    public static void ex4() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter low:");
        int low = reader.nextInt();
        System.out.println("Enter high:");
        int high = reader.nextInt();
        int sum = 0;
        for(int i = low; i <= high; i++) {
            sum = sum + low;
            low++;
        }
        System.out.println("Sum = " + sum);
    reader.close();
    }
    public static void ex5() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = reader.nextLine();
        System.out.println();
        for(int i = 1; i <= word.length(); i++) {
            System.out.println(word);
        }
    reader.close();
    }
    public static void ex6() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the first word:");
        String first = reader.nextLine();
        System.out.println("Enter the second word:");
        String second = reader.nextLine();
        System.out.println();
        System.out.print(first);
        for(int i = 1; i <= 30 - first.length() - second.length(); i++) {
            System.out.print(".");
        }
        System.out.print(second);
    reader.close();
    }
    public static void ex7() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = reader.nextLine();
        for(int i = 0; i <= word.length(); i++) {
            System.out.println(word.charAt(i));
        }
    reader.close();
    }
}    
