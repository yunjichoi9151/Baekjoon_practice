import java.util.Scanner;

public class Microwave_10162 {
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if (t % 10 == 0)
            System.out.println(t / 300 + " " + (t % 300) / 60 + " " + ((t % 300) % 60) / 10);
        else
            System.out.println("-1");
    }
}
