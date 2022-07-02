import java.util.Scanner;

public class Standard_for_Newbies_19944 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        if (m == 1 || m == 2)
            System.out.println("NEWBIE!");
        else if (m > 2 && m <= n)
            System.out.println("OLDBIE!");
        else
            System.out.println("TLE!");
    }
}
