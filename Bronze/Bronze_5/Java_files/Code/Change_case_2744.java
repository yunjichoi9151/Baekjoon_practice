import java.util.Scanner;

public class Change_case_2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr;
        arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 65 && arr[i] <= 90)
                arr[i] = (char)(arr[i] + 32);
            else if (arr[i] >= 97 && arr[i] <= 122)
                arr[i] = (char)(arr[i] - 32);
        }
        System.out.println(arr);
    }
}
