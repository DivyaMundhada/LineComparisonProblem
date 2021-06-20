import java.util.Scanner;

public class ComparisonOfLength {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the coordinates for line 1: ");
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		System.out.print("Enter the coordinates of line 2: ");
		float m1 = scan.nextFloat();
		float n1 = scan.nextFloat();
		float m2 = scan.nextFloat();
		float n2 = scan.nextFloat();
		scan.close();
		double length2 = Math.sqrt(Math.pow(m2 - m1, 2) + Math.pow(n2 - n1, 2));

		String line1 = String.valueOf(length1);
		String line2 = String.valueOf(length2);

		if (line1.compareTo(line2) == 0)
			System.out.println("Line 1 and Line 2 are equal");
		else if (line1.compareTo(line2) > 0)
			System.out.println("Line 1 is greater than Line 2");
		else if (line2.compareTo(line1) > 0)
			System.out.println("Line 2 is greater than Line 1");
	}
}

