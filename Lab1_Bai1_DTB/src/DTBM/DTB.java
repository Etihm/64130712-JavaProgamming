package DTBM;
import java.util.Scanner;
// Bài 1: NHập họ tên và điểm trung bình
public class DTB {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập họ tên sinh viên ");
		String hoTen = scanner.nextLine();
		System.out.println("Nhập điểm trung bình ");
		Double diemTB = scanner.nextDouble();
		System.out.println("Sinh viên: "+ hoTen + " \n Điểm trung bình: " +diemTB);

		scanner.close();
	}

}
