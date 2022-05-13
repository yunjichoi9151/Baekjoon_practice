package Step_6;
import java.util.Scanner;

public class Vocabulary_Study_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = -1;
        char a = '?';
        int[] alphabet = new int[26];
        String word = sc.next();

        for (int i = 0; i < word.length(); i++){
 
			if ('A' <= word.charAt(i) && word.charAt(i) <= 'Z') {
				alphabet[word.charAt(i) - 'A']++;
			}
    
			else {
				alphabet[word.charAt(i) - 'a']++;
			}
		}
        
        for(int i = 0; i < 26; i++) {
            if (alphabet[i] > m) {
				m = alphabet[i];
				a = (char) (i + 65);
			}
			else if (alphabet[i] == m) {
				a = '?';
			}
        }
        System.out.print(a);
    }
}
