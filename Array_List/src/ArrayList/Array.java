package ArrayList;
import java.util.ArrayList;
public class Array {

	public static void main(String[] args) {
		ArrayList<SanPham> dsSanPham;
		//
		dsSanPham = new ArrayList<SanPham>();
		
		// Nhập 3 sản phẩm
		SanPham sp1 = new SanPham(0, "Kem", "Giải Khát", null);
		SanPham sp2 = new SanPham(1, "Cơm", "Đồ ăn", null);
		SanPham sp3 = new SanPham(2, "Phở", "Đồ ăn", null);
		
		dsSanPham.add(sp1);
		dsSanPham.add(sp2);
		dsSanPham.add(sp3);
		
		for(int i=0; i<dsSanPham.size();i++) {
			SanPham sp = dsSanPham.get(i);
			System.out.println("sp.toString");
		}
	}

}
