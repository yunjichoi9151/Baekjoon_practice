import java.util.Scanner;

public class Speed_fines_are_not_fine_6793 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        if (s2 - s1 < 1)
            System.out.println("Congratulations, you are within the speed limit!");
        else if (s2 - s1 >= 1 && s2 - s1 <= 20)
            System.out.println("You are speeding and your fine is $100.");
        else if (s2 - s1 >= 21 && s2 - s1 <= 30)
            System.out.println("You are speeding and your fine is $270.");
        else if (s2 - s1 >= 31)
            System.out.println("You are speeding and your fine is $500.");
    }
}
