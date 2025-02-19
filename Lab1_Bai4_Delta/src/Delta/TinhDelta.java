package Delta;
import java.util.Scanner;
public class TinhDelta {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Nhập a: ");
	Double a = scanner.nextDouble();
	System.out.println("Nhập b: ");
	Double b = scanner.nextDouble();
	System.out.println("Nhập c: ");
	Double c = scanner.nextDouble();
	
	Double delta = Math.pow(b,2)-4*a*c;
	System.out.println("Delta: "+delta+"\nCăn Delta: "+Math.sqrt(Math.abs(delta)));
	scanner.close();
	}

}
