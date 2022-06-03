import java.util.Scanner;
import java.util.Arrays;

public class Choice_of_Subject_11948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[6];
        int i, sum = 0;
        for(i = 0; i < 6; i++)
            score[i] = sc.nextInt();
        Arrays.sort(score, 0, 4);
        Arrays.sort(score, 4, 6);
        for(i = 1; i < 4; i++)
            sum += score[i];
        sum += Math.max(score[4], score[5]);
        System.out.println(sum);
    }
}
