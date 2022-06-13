import java.util.Scanner;

public class Ten_part_system_10797 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] car = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            car[i] = sc.nextInt();
            if (car[i] == x)
                sum += 1;
        }
        System.out.println(sum);
    }
}
