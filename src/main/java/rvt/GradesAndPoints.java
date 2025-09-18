package rvt;
    import java.util.Scanner;
public class GradesAndPoints {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Give points [0-100]: ");
        int Grade = reader.nextInt();
        if (Grade < 0) {
            System.out.println("impossible!");
        } 
        if (Grade < 50) {
            System.out.println("failed");
        } else if (Grade < 60) {
            System.out.println("1");
        } else if (Grade < 70) {
            System.out.println("2");
        } else if (Grade < 80) {
            System.out.println("3");
        } else if (Grade < 90) {
            System.out.println("4");
        } else if (Grade <= 100) {
            System.out.println("5");
        } else if (Grade > 100) {
            System.out.println("Incredible!");
        }
        
    reader.close();
    }
}
