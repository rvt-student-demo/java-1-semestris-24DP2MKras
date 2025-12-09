package rvt;
import java.util.*;
public class Book {
    private String name;
    private int pages;
    private int year;
    public Book (String name, int pages, int year) {
        this.name = name;
        this.pages = pages;
        this.year = year;
    }

    public String toString() {
        return name + ", " + pages + ", " + year;
    }
        
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while(true) {
            System.out.print("Title: ");
            String name = reader.nextLine();
            if(name.isEmpty()) {
                break;
            }
            System.out.print("Number of pages: ");
            int pages = Integer.valueOf(reader.nextLine());
            System.out.print("publication year: ");
            int year = Integer.valueOf(reader.nextLine());

            books.add(new Book(name, pages, year));

        }
        System.out.print("what would you like to get printed? ");
        String output = reader.nextLine();
        if(output.equals("everything")) {
            for(Book b : books) {
            System.out.println(" " + b);
        }
        }
        if(output.equals("name")){
            for(Book b : books) {
            System.out.println(b.name);
            }
        }       
    }
}

