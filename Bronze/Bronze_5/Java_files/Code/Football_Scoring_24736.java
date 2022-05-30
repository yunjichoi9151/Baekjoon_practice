import java.util.Scanner;

public class Football_Scoring_24736 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numArr1[] = new int[5];
        int numArr2[] = new int[5];
        for (int i = 0; i < 5; i++) {
            numArr1[i] = sc.nextInt();
        }
        int sum1 = numArr1[0] * 6 + numArr1[1] * 3 + numArr1[2] * 2 + numArr1[3] + numArr1[4] * 2;
        for (int i = 0; i < 5; i++) {
            numArr2[i] = sc.nextInt();
        }
        int sum2 = numArr2[0] * 6 + numArr2[1] * 3 + numArr2[2] * 2 + numArr2[3] + numArr2[4] * 2;
        System.out.println(sum1 + " " + sum2);
    }
}
