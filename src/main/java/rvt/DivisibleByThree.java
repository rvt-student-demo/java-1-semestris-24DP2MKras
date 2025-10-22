package rvt;
    
public class DivisibleByThree {
    public static void main(String[] args) {
        divisibleByThreeInRange(2, 10);
    }
    public static void divisibleByThreeInRange(int start, int end) {
        for (int a = start; a <= end; a++) {
            if (a % 3 == 0) {
                System.out.println(a);
            }
        }
    }
}

