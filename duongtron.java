nhập java . sử dụng . Máy quét ;

public  class  DUONGTRON  extends  DIEM {
	Máy quét  sc = Máy quét mới  ( Hệ thống . in );
	riêng  int  r ;
	riêng  DIỆM  tam ;

	public  void  nhapDT () {
		tam = new  DUONGTRON ();
		Hệ thống . ra . println ( "Nhap vao toa do tam :" );
		tam . nhapDiem ();
		Hệ thống . ra . println ( "Nhap ban kinh duong tren:" );
		r=sc.nextInt();
	}
	public double tinhChuVi() {
		return Math.PI*2*r;
	}
	public double tinhDienTich() {
		return 2*Math.PI*r*r;
	}
}
