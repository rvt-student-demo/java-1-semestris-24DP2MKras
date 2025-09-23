package rvt;

    import java.util.Scanner;

public class Detalas {
    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);
        int skruvesCena = 5;
        int uzgrieznuCena = 3;
        int paplaksnesCena = 1;
        System.out.println("Ievadi skruvju skaitu pasutijuma");
        int skruvesdaudzums = reader.nextInt();
        System.out.println("Ievadi uzgrieznu skaitu pasutijuma");
        int uzgrieznudaudzums = reader.nextInt();
        System.out.println("Ievadi paplaksnu skaitu pasutijuma");
        int paplaksnudaudzums = reader.nextInt();
        if (uzgrieznudaudzums >= skruvesdaudzums && paplaksnudaudzums >= 2 * skruvesdaudzums) {
            int cena = (skruvesCena * skruvesdaudzums) + (uzgrieznuCena * uzgrieznudaudzums) + (paplaksnesCena * paplaksnudaudzums);
            System.out.println("Skrūvju skaits: " + skruvesdaudzums);
            System.out.println("Uzgriežņu skaits: " + uzgrieznudaudzums);
            System.out.println("Paplakšņu skaits: " + paplaksnudaudzums);

        System.out.println("Kopēja cena: " + cena);
        } else if(uzgrieznudaudzums < skruvesdaudzums) {
            System.out.println("Kļūda!");
            System.out.println("Pārbaudi pasūtijumu par maz uzgriežņu");
        } else if(paplaksnudaudzums < 2 * skruvesdaudzums){
            System.out.println("Kļūda!");
            System.out.println("Pārbaudi pasūtijumu par maz paplākšņu");
    
        }

    reader.close();
    }
    
    
}
