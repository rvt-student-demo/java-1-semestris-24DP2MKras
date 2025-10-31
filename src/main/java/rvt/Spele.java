package rvt;
    import java.util.*;
public class Spele {
    public static void main(String[] args) {
    Random random = new Random();
    Scanner reader = new Scanner(System.in);
    int result = random.nextInt(10) + 1;
    System.out.println("Es domāju par skaitli no 1 līdz 10.");
    System.out.println("Tev tas jauzmin trīs mēģinājumos.");
    System.out.println("Ievadi mēģinājumu:");
    for(int i = 1; i <= 3; i++) {
        int guess = reader.nextInt();
        if(guess == result) {
            System.out.println("PAREIZI!");
            System.out.println("Tu esi uzvarējis spēli.");
            break;
        } else {
            System.out.println("nepareizi");
        }
    }
    System.out.println("Pareizais skaitlis bija: " + result);
    }
}
    
