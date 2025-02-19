package CVDT;
import java.util.Scanner;

//Bài 2: Tính chu vi và diện tích của hình chữ nhật
public class CVDT_ {

	public static void main(String[] args) {
		// Nhập vào 2 cạnh a và b
	Scanner scanner = new Scanner(System.in);
	System.out.println("Nhập cạnh thứ nhất: ");
	Double a = scanner.nextDouble();
	System.out.println("Nhập cạnh thứ hai: ");
	Double b = scanner.nextDouble();
	
		// Tính chu vi
	Double chuVi = ((a+b)*2);
		
		//Tính diện tích
	Double dienTich = a*b;
	
		//Cạnh nhỏ nhất
	Double canhNho = Math.min(a,b);
	
	System.out.println("Chu vi của hình chữ nhật là: "+chuVi+"\nDiện tích của hình chữ nhật là: "+dienTich+"\nCạnh nhỏ nhất là: "+canhNho);
	
scanner.close();
	}

}
