package Step_2;
import java.util.Scanner;

public class Alarm_Clock_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(b < 45) {
            b += 15;
            if (a == 0)
                a = 23;
            else
                a -= 1;
        }
        else
            b -= 45;
        System.out.println(a + " " + b);
    }
}
