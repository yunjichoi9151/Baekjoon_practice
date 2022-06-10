import java.util.Scanner;

public class Number_of_Alphabet_10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int arr[] = new int[26];
        for (int i = 0; i < s.length(); i++)
		    arr[s.charAt(i) - 'a']++;
	    for (int j = 0; j < 26; j++)
		    System.out.print(arr[j] + " ");
    }
}
