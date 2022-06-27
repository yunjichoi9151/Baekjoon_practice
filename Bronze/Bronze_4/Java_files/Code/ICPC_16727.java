import java.util.Scanner;

public class ICPC_16727 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1 = sc.nextInt(), s1 = sc.nextInt(), s2 = sc.nextInt(), p2 = sc.nextInt();
        if (p1 + p2 == s1 + s2) {
            if (s1 == p2)
                System.out.println("Penalty");
            else
                System.out.println((s1 < p2) ? "Persepolis" : "Esteghlal");
        }
        else
            System.out.println((p1 + p2 > s1 + s2) ? "Persepolis" : "Esteghlal");
    }
}
