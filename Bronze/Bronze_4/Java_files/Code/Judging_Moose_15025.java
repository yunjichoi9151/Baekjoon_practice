import java.util.Scanner;

public class Judging_Moose_15025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(), r = sc.nextInt();
        if (l == r && l != 0 && r != 0)
            System.out.println("Even " + (l * 2));
        else if (l == 0 && r == 0)
            System.out.println("Not a moose");
        else
            System.out.println("Odd " + (l > r ? l * 2 : r * 2));
    }
}
