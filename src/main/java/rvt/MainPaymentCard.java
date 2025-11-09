package rvt;

public class MainPaymentCard {
    public static void main(String[] args) {
        PaymentCard Paulcard = new PaymentCard(20);
        PaymentCard Mattscard = new PaymentCard(30);

        Paulcard.eatHeartily();
        System.out.println("Paul " + Paulcard);

        
        Mattscard.eatAffordibly();
        System.out.println("Matts " + Mattscard);

        Paulcard.AddMoney(20);
        System.out.println("Paul " + Paulcard);

        Mattscard.eatHeartily();
        System.out.println("Matts " + Mattscard);

        Paulcard.eatAffordibly();
        Paulcard.eatAffordibly();
        Mattscard.AddMoney(50);
        System.out.println("Paul " + Paulcard);
        System.out.println("Matts " + Mattscard);

    }

}
