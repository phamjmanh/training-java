import java.util.Scanner;

public class tinhLuongNV {
	public static void main (String[] args) {
		int hsl;
		int sonamlv;
		float luongthang;
		Scanner sc= new Scanner(System.in);
		System.out.println("nhap he so luong");
		sonamlv = sc.nextInt();
		System.out.println("nhap so nam lam viec");
		hsl = sc.nextInt();
		if( hsl < 5 || hsl >1 ){
			luongthang = hsl * 4000000 + sonamlv * 500000;
			System.out.println("luong thang la :"+luongthang);
		}
		else {
		    System.out.println("gia tri khong hop le !!!");
		}
	}
	
}
