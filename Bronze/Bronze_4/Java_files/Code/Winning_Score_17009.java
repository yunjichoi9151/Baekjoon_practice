import java.util.Scanner;

public class Winning_Score_17009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt(), b1 = sc.nextInt(), c1 = sc.nextInt(), a2 = sc.nextInt(), b2 = sc.nextInt(), c2 = sc.nextInt(), a, b;
        a = a1 * 3 + b1 * 2 + c1;
        b = a2 * 3 + b2 * 2 + c2;
        if (a == b)
            System.out.println("T");
        else
            System.out.println((a > b) ? "A" : "B");        
    }
}
