nhập  java . sử dụng . Máy quét ;

 lớp  công khai DIEM {
	nhân  đôi  x , y ;
	công  DIEM () {};
	 DIEM công cộng ( double  x , double  y ) {
		này . x = x ;
		này . y = y ;
	}
	Máy quét  sc = Máy quét mới  ( Hệ thống . in );
	public  void  nhapDiem () {
		Hệ thống . ra . println ( "Nhap vao toa do diem: " );
		x = sc . nextDouble ();
		y = sc . nextDouble ();
	}
	 getX kép  công khai () {
		trả lại  x ;
	}
	public  void  setX ( double  x ) {
		này . x = x ;
	}
	công khai  gấp đôi  getY () {
		trả lại  y ;
	}
	public  void  setY ( double  y ) {
		này . y = y ;
	}
	public  void  inDiem () {
		Hệ thống . ra . println ( "Toa diem: (" + x + "," + y + ")" );
	}
	
	
}