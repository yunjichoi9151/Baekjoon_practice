import java.util.Scanner;

public class Ordeal_of_5_23037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numArr = sc.next();
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += Math.pow(Character.getNumericValue(numArr.charAt(i)), 5);
        }
        System.out.println(sum);
    }
}
