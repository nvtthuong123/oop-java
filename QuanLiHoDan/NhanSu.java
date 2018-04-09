package QuanLiHoDan;

import java.util.Scanner;

public class NhanSu {
	private String hoTen;
	private int tuoi;
	private int namSinh;
	private String ngheNghiep;
	
	
	public NhanSu() {
		// TODO Auto-generated constructor stub
	}
	NhanSu(String hoTen, int tuoi, int namSinh, String ngheNghiep){
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.namSinh = namSinh;
		this.ngheNghiep = ngheNghiep;
	}
	public void NhapTT() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Nhập vào họ tên thành viên : ");
		hoTen = sc.nextLine();
		while(true) {
			try {
				System.out.print("Tuổi : ");
				tuoi = Integer.parseInt(sc.nextLine()); 
				if(tuoi<0)
					throw new NumberFormatException();
				break;
				
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Bạn cần nhập số nguyên dương");
			}
		}
		while(true) {
			try {
				System.out.print("Năm sinh : ");
				namSinh = Integer.parseInt(sc.nextLine());
				if(namSinh<0)
					throw new NumberFormatException();
				
				break;
				
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Bạn cần nhập số nguyên dương");
			}
		}
		
		
		System.out.print("Nghề nghiệp : ");
		ngheNghiep = sc.nextLine();
		
	}
	public void HienThiTT() {
		System.out.println("Họ tên thành viên : "+hoTen);
		System.out.println("Tuổi : "+tuoi);
		System.out.println("Năm sinh : "+namSinh);
		System.out.println("Nghề nghiệp : "+ngheNghiep);
	}

}
