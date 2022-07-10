import java.util.Scanner;

public class Ice_Cream_24087 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
        if (a >= s)
            System.out.println("250");
        else {
            if ((s - a) % b == 0)
                System.out.println(250 + 100 * ((s - a) / b));
            else
                System.out.println(250 + 100 * ((s - a) / b + 1));
        }
    }
}
