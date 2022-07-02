import java.util.Scanner;

public class Archivist_20232 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if (y == 1996 || y == 1997 || y == 2000 || y == 2007 || y == 2008 || y == 2013 || y == 2018)
            System.out.println("SPbSU");
        else if (y == 2006)
            System.out.println("PetrSU, ITMO");
        else
            System.out.println("ITMO");
    }
}
