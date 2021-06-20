import java.util.Scanner;

public class EqualityOfLength {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of coordinates for line 1: ");
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		System.out.print("Enter the value of coordinates for line 2: ");
		int a1 = scan.nextInt();
		int b1 = scan.nextInt();
		int a2 = scan.nextInt();
		int b2 = scan.nextInt();
		scan.close();
		double length2 = Math.sqrt(Math.pow(a2 - a1, 2) + Math.pow(b2 - b1, 2));

		String line1 = String.valueOf(length1);
		String line2 = String.valueOf(length2);
		if (line1.equals(line2))
			System.out.println("Line 1 and Line 2 are equal");
		else
			System.out.println("Line 1 and Line 2 are not equal");
	}
}
