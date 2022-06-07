import java.util.Scanner;

public class Who_submit_Assignment_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numArr[] = new int[31];
        for (int i = 0; i < 28; i ++) {
            int tmp = sc.nextInt();
            numArr[tmp - 1] = tmp;
        }
        for (int i = 0; i < 30; i ++) {
            if (numArr[i] == 0)
                System.out.println(i + 1);
        }
    }
}
