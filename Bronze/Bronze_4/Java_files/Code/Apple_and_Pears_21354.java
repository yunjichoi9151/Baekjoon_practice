import java.util.Scanner;

public class Apple_and_Pears_21354 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), p = sc.nextInt();
        if (a * 7 == p * 13)
            System.out.println("lika");
        else
            System.out.println((a * 7 > p * 13) ? "Axel" : "Petra");
    }
}
