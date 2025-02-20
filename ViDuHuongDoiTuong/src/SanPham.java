
public class SanPham {
	// Định nghĩa các thuộc tính
	int maSP;
	String tenSP;
	String loaiSP;
	String anhSP;	// Tên file ảnh
}
	// Hàm tạo
public SanPham() {
	// Khởi tạo giá trị ban đầu 
}

public SanPham(int _maSP, String _tenSP, String _loaiSP, String _anhSP) {
	maSP =_maSP;
	tenSP =_tenSP;
	loaiSP =_loaiSP;
	anhSP =_anhSP;
}
public SanPham(int maSP, String tenSP, String loaiSP, String anhSP) {
	this.maSP =maSP;
	this.tenSP =tenSP;
	this.loaiSP =loaiSP;
	this.anhSP =anhSP;
}
public int getSP() {
	return maSP;
}
public void setMaSP(int maSP) {
	this.maSP = maSP;
}

}