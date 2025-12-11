package rvt;
import java.util.*;
public class Chapter44 {
    public static void main(String[] args) {
        ex7();
    }
    public static void ex1() {
        Scanner name = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullname = name.nextLine();
        fullname = fullname.trim();
        int Space = fullname.indexOf(" ");
        String firstName = fullname.substring(0, Space);
        String lastName = fullname.substring(Space + 1);
        lastName = lastName.toUpperCase();
        System.out.println(firstName + " " + lastName);
    }

    public static void ex2() {
        System.out.print("Enter a String: ");
        Scanner name = new Scanner(System.in);
        String word = name.nextLine();
        for(int i = 0; word.length() > i; i++) {
            System.out.println(word.charAt(i));
        }
    }

    public static void ex3() {
        Scanner name = new Scanner(System.in);
        while(true) {
            System.out.print("Enter a name: ");
            String fullName = name.nextLine();
            if(fullName.equals("")) {
                break;
            }
            if(fullName.startsWith("Amy")) {
                System.out.println("Ms. " + fullName);
            }
            if(fullName.startsWith("Buffy")) {
                System.out.println("Ms. " + fullName);
            }
            if(fullName.startsWith("Cathy")) {
                System.out.println("Ms. " + fullName);
            }
            if(fullName.startsWith("Elroy")) {
                System.out.println("Mr. " + fullName);
            }
            if(fullName.startsWith("Fred")) {
                System.out.println("Mr. " + fullName);
            }
            if(fullName.startsWith("Graham")) {
                System.out.println("Mr. " + fullName);
            }
        }
    }
    public static void ex4() {
        Scanner clock = new Scanner(System.in);
        System.out.print("Enter cook time: ");
        String time = clock.nextLine();
        while(time.length() < 2) {
            time = "0" + time;
        }
        String seconds = time.substring(time.length() - 2);
        String minutes = time.substring(0, time.length() - 2);
        if(minutes.equals("")){
            minutes = "0";
        }
        System.out.println("your time -> " + minutes + ":" + seconds);
    }
    public static void ex6() {
        Scanner pass = new Scanner(System.in);
        while(true) {
            System.out.println("Enter a password: ");
            String password = pass.nextLine();
            if(password.length() >= 7 ) {
                if(!password.equals(password.toLowerCase())) {
                    for(int i = 0; i < password.length(); i++) {
                        boolean digitHere = false;
                        if(Character.isDigit(password.charAt(i))) {
                            digitHere = true; 
                        }
                    }
                    System.out.println("acceptable password");
                    break;
                }
                else {
                System.out.println("password is not acceptable, make sure its atleast 7 characters long, includes both capital and decapital letters and has atleast one symbol in it");
                System.out.println();
            }
                
            }
            else {
                System.out.println("password is not acceptable, make sure its atleast 7 characters long, includes both capital and decapital letters and has atleast one symbol in it");
                System.out.println();
            }
        }
    }
    public static void ex7() {
        Scanner phrase = new Scanner(System.in);
        System.out.print("Enter a word -> ");
        String word = phrase.nextLine();
        int indent = 0;
        while (word.length() > 2) {
            for (int i = 0; i < indent; i++) {
                System.out.print(" ");
            }
            System.out.println(word);
            word = word.substring(1, word.length() - 1);
            indent++;
        }
        for (int s = 0; s < indent; s++) {
            System.out.print(" ");
        }
        System.out.println(word);
    }   
}