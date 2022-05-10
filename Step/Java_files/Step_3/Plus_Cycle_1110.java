package Step_3;
import java.util.Scanner;

public class Plus_Cycle_1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0, tmp = num;
        while (true) {
            int a = tmp / 10;
            int b = tmp % 10;
            int new_num = b * 10 + (a + b) % 10;
            count++;
            if(num == new_num)
                break;
            else
                tmp = new_num;
        }
        System.out.println(count);
    }
}
