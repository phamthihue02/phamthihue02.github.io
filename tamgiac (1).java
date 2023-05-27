public  class  TAMGIAC  extends  DIEM {
	riêng  DIỄM  A , B , C ;
	
	public  void  nhapTG () {
		A = new  DIEM ();
		B = new  DIEM ();
		C = new  DIEM ();
		Hệ thống . ra . println ( "Nhap vao toa do diem A: " );
		A. _ nhapDiem ();
		Hệ thống . ra . println ( "Nhap vao toa do diem B: " );
		B. _ nhapDiem ();
		Hệ thống . ra . println ( "Nhap vao toa do diem C: " );
		C. _ nhapDiem ();
	}
	public  int  kiemtraTG () {
		int  kiemtra = 0 ;
		nhân đôi  AB = Toán . sqrt ( Math . pow ( B . getX ()- A . getX (), 2 )+ Math . pow ( B . getY ()- A . getY (), 2 ));
		gấp đôi  AC = Toán học . sqrt ( Math . pow ( C . getX ()- A . getX (), 2 )+ Math . pow ( C . getY ()- A . getY (), 2 ));
		gấp đôi  BC = Toán học . sqrt ( Math . pow ( C . getX ()- B . getX (), 2 )+ Math . pow ( C . getY ()- B . getY (), 2 ));
		nếu ( AB + AC > BC && AB + BC > AC && BC + AC > AB ) {
			kiếmtra = 1 ;}
		trả  kiemtra ;
	}
	công  đôi  tinhChuVi () {
		nhân đôi  AB = Toán . sqrt ( Math . pow ( B . getX ()- A . getX (), 2 )+ Math . pow ( B . getY ()- A . getY (), 2 ));
		gấp đôi  AC = Toán học . sqrt ( Math . pow ( C . getX ()- A . getX (), 2 )+ Math . pow ( C . getY ()- A . getY (), 2 ));
		gấp đôi  BC = Toán học . sqrt ( Math . pow ( C . getX ()- B . getX (), 2 )+ Math . pow ( C . getY ()- B . getY (), 2 ));
		trở lại  AB + BC + AC ;
	}
	public  double  tinhDienTich () {
		nhân đôi  AB = Toán . sqrt ( Math . pow ( B . getX ()- A . getX (), 2 )+ Math . pow ( B . getY ()- A . getY (), 2 ));
		gấp đôi  AC = Toán học . sqrt ( Math . pow ( C . getX ()- A . getX (), 2 )+ Math . pow ( C . getY ()- A . getY (), 2 ));
		gấp đôi  BC = Toán học . sqrt ( Math . pow ( C . getX ()- B . getX (), 2 )+ Math . pow ( C . getY ()- B . getY (), 2 ));
		nhân đôi  p = ( AB + BC + AC ) / 2 ;
        trả lại  Toán học . sqrt ( p * ( p - AB ) * ( p - BC ) * ( p - AC ));
	}
	

} {
    
}
