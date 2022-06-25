import java.util.Scanner;

public class Telemarketer_or_not_16017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numArr[] = new int[5];
        for (int i = 0; i < 4; i++)
            numArr[i] = sc.nextInt();
        if ((numArr[0] == 8 || numArr[0] == 9) && (numArr[3] == 8 || numArr[3] == 9) && numArr[1] ==  numArr[2])
            System.out.println("ignore");
        else
            System.out.println("answer");
    }
}
