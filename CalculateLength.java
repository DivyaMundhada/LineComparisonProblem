import java.util.Scanner;

public class CalculateLength {

int x1;
int x2;
int y1;
int y2;

public void Length() {
	double line1 = (( (x2 - x1)*(x2-x1) + (y2-y1)*(y2-y1) ));
	double len = Math.pow(line1, 0.5);
	System.out.println(len);
}
public void statement() {
System.out.println("Enter coordinate");
}

public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	CalculateLength m1 = new CalculateLength();
	m1.statement();
	m1.x1 = scan.nextInt();
	m1.statement();
        m1.x2 = scan.nextInt();
	m1.statement();
        m1.y1 = scan.nextInt();
	m1.statement();
        m1.y2 = scan.nextInt();

	m1.Length();
scan.close();
}

}
