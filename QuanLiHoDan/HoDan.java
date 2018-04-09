package QuanLiHoDan;

import java.util.Scanner;

public class HoDan extends NhanSu {
	private int soThanhVien;
	private String soNha;
	
	NhanSu[] danhsach = null;
	
	public HoDan() {
		// TODO Auto-generated constructor stub
		
	}
	public HoDan(String hoTen, int tuoi, int namSinh, String ngheNghiep, int soThanhVien, String soNha) {
		super(hoTen, tuoi, namSinh, ngheNghiep);
		this.soThanhVien = soThanhVien;
		this.soNha = soNha;
	}
	@Override
	public void NhapTT() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("Số thành viên : ");
				soThanhVien = Integer.parseInt(sc.nextLine());
				if(soThanhVien<0)
					throw new NumberFormatException();
				break;
				
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Bạn cần nhập số nguyên dương");
			}
			
		}
		
		
		
		danhsach = new NhanSu[soThanhVien];
		System.out.print("Số nhà : ");
		soNha = sc.nextLine();
		for(int i=0;i<danhsach.length;i++) {
			System.out.println("Thông tin thanh viên thứ " +(i+1));
			danhsach[i] = new NhanSu();
			danhsach[i].NhapTT();
		}
			
	}
	public void HienThiTT() {
		System.out.println("Số thành viên : "+soThanhVien);
		System.out.println("Số nhà : "+soNha);
		for(int i=0;i<danhsach.length;i++) {
			System.out.println("Thông tin thanh viên thứ " +(i+1));
			danhsach[i].HienThiTT();
			
		}
	}
	

}
