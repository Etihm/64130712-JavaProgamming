package TheTich;
import java.util.Scanner;
public class TheTichLP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập cạnh của khối lập phương: ");
		Double canh = scanner.nextDouble();
		Double theTich = Math.pow(canh,3);
		
		System.out.println("Thể tích khối lập phương là: "+theTich);

		scanner.close();
	}

}
