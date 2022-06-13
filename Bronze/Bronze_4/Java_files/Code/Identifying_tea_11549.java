import java.util.Scanner;

public class Identifying_tea_11549 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] tea = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            tea[i] = sc.nextInt();
            if (tea[i] == t)
                sum += 1;
        }
        System.out.println(sum);
    }
}
