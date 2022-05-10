package Step_4;
import java.util.Scanner;

public class Remainder_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numArr = new int[42];
        int i, a, tmp, count = 0;
        for(i = 0; i < 10; i++){
            a = sc.nextInt();
            tmp = a % 42;
            numArr[tmp]++;
        }
        for(i = 0; i < 42; i++){
            if(numArr[i] != 0)
                count++;
        }
        System.out.println(count);
    }
}
