package Step_4;
import java.util.Scanner;

public class Number_of_Numbers_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numArr = new int[10];
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = a * b * c;
        while (d > 0) {
            numArr[d % 10]++;
            d /= 10;
        }
        for(int i = 0; i < 10;i++){
            System.out.println(numArr[i]);
        }
    }
}
