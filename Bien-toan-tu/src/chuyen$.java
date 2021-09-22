import java.util.Scanner;

public class chuyen$ {
	public static void main (String[] args) {
		double vnd = 25000;
		double usd;
		Scanner sc= new Scanner(System.in);
		System.out.println("nhap tien so USD can chuyển :");
		usd = sc.nextDouble();
		double tienviet = usd * vnd;
		System.out.println("số tiền sau khi đổi :"+tienviet +"VND");
	}
}
