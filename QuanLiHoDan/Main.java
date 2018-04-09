package QuanLiHoDan;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HoDan[] danhsachHD = null;
		int n =0; // số hộ dân
		int luachon;
		Scanner sc =new Scanner(System.in);
		
		
		do {
			System.out.println("---------- MENU ----------");
			System.out.println("1. Nhập thông tin cho n hộ dân.");
			System.out.println("2. Hiển thị thông tin hộ dân trong khu phố.");
			System.out.println("3. Thoát chương trình.");
			System.out.println("---------- END ----------");
			try {
				System.out.println("Mời bạn nhập vào lựa chọn");
				luachon = Integer.parseInt(sc.nextLine());
				
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Bạn cần nhập số nguyên dương");
				luachon = 0;
			}
			
			
			
			
			switch(luachon) {
			case 1: {
				while(true) {
					try {
						System.out.println("Số hộ dân trong khu phố : ");
						n = Integer.parseInt(sc.nextLine());
						if(n<0)
							throw new NumberFormatException();
						break;
						
					} catch (NumberFormatException e) {
						// TODO: handle exception
						System.out.println("Bạn cần nhập số nguyên dương");
					}
					
				}
				
				danhsachHD = new HoDan[n]; // danh sách lưu trữ n hộ dân.
				
				for(int i=0;i<danhsachHD.length;i++) {
					System.out.println("Hộ dân thứ "+(i+1));
					danhsachHD[i] = new HoDan(); // cấp phát ô nhớ để lưu trữ
					danhsachHD[i].NhapTT();
					
				}
				break;
			}
			case 2: {
				System.out.println("------------Danh sách thành viên------------");
				System.out.println("");
				for(int i=0;i<danhsachHD.length;i++) {
					System.out.println("Hộ dân thứ "+(i+1));
					danhsachHD[i].HienThiTT();
				}
				break;
			}
			case 3: {
				break;
			}
			
			}
		} while (luachon!=3);

	}

}
