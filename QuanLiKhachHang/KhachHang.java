package QuanLiKhachHang;

import java.util.Scanner;

public class KhachHang {
	private String maKH;
	private String hoTen;
	private int namSinh;
	private int tongLuong;
	
	
	
	public KhachHang() {
		// TODO Auto-generated constructor stub
	}
	KhachHang(String maKH){
		this.maKH = maKH;
	}
	KhachHang(String maKH, String hoTen, int namSinh, int tongLuong){
		this.maKH = maKH;
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.tongLuong = tongLuong;
	}
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public int getTongLuong() {
		return tongLuong;
	}
	public void setTongLuong(int tongLuong) {
		this.tongLuong = tongLuong;
	}
	
	public void NhapTT() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Mã khách hàng : ");
		maKH = sc.nextLine();
		System.out.print("Tên khách hàng : ");
		hoTen = sc.nextLine();
		System.out.print("Năm sinh : ");
		namSinh = Integer.parseInt(sc.nextLine());
		System.out.print("Tổng lương : ");
		tongLuong = Integer.parseInt(sc.nextLine());

		
	}
	public void HienThiTT() {
		System.out.println("Mã khách hàng : "+maKH);
		System.out.println("Tên khách hàng : "+hoTen);
		System.out.println("Năm sinh : "+namSinh);
		System.out.println("Tổng lương : "+tongLuong);
		
	}

}
