import java.util.Scanner;

public class Three_Integers_18408 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[4], sum_one = 0, sum_two = 0;
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
            if (a[i] == 1)
                sum_one += 1;
            else if (a[i] == 2)
                sum_two += 1;
        }
        System.out.println((sum_one > sum_two) ? 1 : 2);
    }
}
