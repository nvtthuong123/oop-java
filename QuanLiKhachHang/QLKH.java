package QuanLiKhachHang;

import java.util.ArrayList;
import java.util.Scanner;

public class QLKH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Array;
		ArrayList<KhachHang> danhsach = new ArrayList();
		int n;
		int luachon; // so luong khach hang
		
		System.out.println("===========================");
		System.out.println("1. Nhập vào n khách hàng :");
		System.out.println("2. Hiển thị thông tin danh sách khách hàng :");
		System.out.println("3. Hiển thị khách hàng có tổng lượng lớn hơn x :");
		System.out.println("4. Thoát chương trình.");
		System.out.println("===========================");
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println(" Mời bạn nhập vào lựa chọn : ");
		
			try {
				luachon = Integer.parseInt(sc.nextLine());
				
			} catch (NumberFormatException e) {
				// TODO: handle exception
				luachon = 0;
				System.out.println(" Bạn cần nhập vào số nguyên : ");
			}
			switch(luachon) {
			  case 1:{
				  System.out.print("Nhập vào số lượng khách hàng : ");
				  n = Integer.parseInt(sc.nextLine());
				  Array = new int[n]; // tao lap so luong phan tu cho mang
				  for(int i=0;i<Array.length;i++) {
					  KhachHang KH = new KhachHang();
					  System.out.println("Thông tin khách hàng : "+(i+1));
					  KH.NhapTT();
					  danhsach.add(KH); // them khach hang duoc luu vao danh sach
				  }
				  break;
			  }
			  case 2:{
				  System.out.println("Thông tin khách hàng có trong danh sách : ");
				  for(int i=0;i<danhsach.size();i++) {
					  System.out.println("Thông tin khách hàng : "+(i+1));
					  danhsach.get(i).HienThiTT();
					  
				  }
				  break;
			  }
			  case 3:{
				  int x;
				  System.out.println("Nhập vào tổng lương : ");
				  x = Integer.parseInt(sc.nextLine());
				  for(int i=0;i<danhsach.size();i++) {
					  if(x<=danhsach.get(i).getTongLuong()) {
						  danhsach.get(i).HienThiTT();
					  }
				  }
				  break;
			  }
			  case 4:{
				  break;
			  }
			}
		}
		while(luachon!=4);
		

	}

}
