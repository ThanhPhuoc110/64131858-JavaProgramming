package vidu;
import java.util.ArrayList;

public class LopArray {

	public static void main (String [] args) {
	     ArrayList<SanPham> dsSanPham;
	     dsSanPham = new ArrayList<SanPham>();
	         SanPham sp1 = new SanPham(0, "kem", "Giải khát", null);
	         SanPham sp2 = new SanPham(1, "cơm", "đồ ăn", null);
	         SanPham sp3 = new SanPham(2, "Phở", "đồ ăn", null);
	         
	         dsSanPham.add(new SanPham(0, "kem", "Giải khát", null));
	         dsSanPham.add(sp1);
	         dsSanPham.add(sp2);
	         dsSanPham.add(sp3);
	     

	     for (int i =0 ; i < dsSanPham.size(); i++) {
	    	 SanPham sp = dsSanPham.get(i);
	    	 System.out.println(sp.toString());
	     }
	     
	  
		}

}
