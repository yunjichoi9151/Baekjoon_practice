import java.util.Scanner;

public class Evaluation_20839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble(), y = sc.nextDouble(), z = sc.nextDouble(), xi = sc.nextDouble(), yi = sc.nextDouble(), zi = sc.nextDouble();
        if (xi >= x && yi >= y && zi >= z)
		    System.out.println("A");
	    else if (xi >= x / 2 && yi >= y && zi >= z)
		    System.out.println("B");
	    else if (yi >= y && zi >= z)
		    System.out.println("C");
	    else if (yi >= y / 2 && zi >= z)
		    System.out.println("D");
	    else
		    System.out.println("E");
    }
}
