import java.util.Scanner;

public class Counting_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0;
        int numArr[] = new int[101];
        for(int i = 0; i < n; i++)
            numArr[i] = sc.nextInt();
        int v = sc.nextInt();
        for(int i = 0; i < n; i++) {
            if (numArr[i] == v)
                sum++;
        }
        System.out.println(sum);
    }
}
