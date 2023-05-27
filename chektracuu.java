kiểm tra lớp  công khai {
public  static  void  main ( String [] args ) {
   Máy quét  sc = Máy quét mới  ( Hệ thống . in );
   TAMGIAC  tga ;
   DUONGTRON  dt ;
   dt = new  DUONGTRON ();
   tga = TAMGIAC mới  ();
   tga . nhapTG ();
   nếu ( tga . kiemtraTG ()== 1 ) {
       Hệ thống . ra . println ( "3 diem vua nhap co tao thanh tam giac!" );
       Hệ thống . ra . println ( "Chu vi tam giac: " + tga .tinhChuVi ( ));
       Hệ thống . ra . println ( "Dien tich tam giac: " + tga . tinhDienTich ());
   }
   khác {
       Hệ thống . ra . println ( "3 diem vua nhap khong tao thanh tam giac" );
   }
   đt . nhapDT ();
   Hệ thống . ra . println ( "Chu vi hinh tron: " + dt . tinhChuVi ());
   Hệ thống . ra . println ( "Dien tich hinh tro: " + dt . tinhDienTich ());
   
}
} {
    
}
