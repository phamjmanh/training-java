import java.util.Scanner;

public class b1 {
	public static void main (String[] args) {
		float vl, hh, sh;
		Scanner sc= new Scanner(System.in);
		System.out.println("nhap diem vat ly");
		vl = sc.nextFloat();
		System.out.println("nhap diem hoa hoc");
		hh = sc.nextFloat();
		System.out.println("nhap diem sinh hoc");
		sh = sc.nextFloat();
		float tb = (vl + hh + sh)/3;
		System.out.println("diem trung binh:"+tb);
		float tong = vl + hh + sh;
		System.out.println("diem ttong:"+tong);
	}
}
