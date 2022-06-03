import java.util.Scanner;

public class Contest_Timing_5928 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        if (d == 11 && h == 11 && m < 11 || d == 11 && h < 11 || d < 11)
            System.out.println("-1");
        else {
            if (d == 11)
                System.out.println((h * 60 + m) - (11 * 60 + 11));
            else 
                System.out.println(((d - 12) * 24 * 60) + (12 * 60 + 49) + (h * 60 + m));
        
        }
    }
}
