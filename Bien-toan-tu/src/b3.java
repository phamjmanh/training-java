import java.util.Scanner;

public class b3 {
	public static void main (String[] args) {
		double cv ;
		double dt ;
		double pi=3.14 ;
		Scanner sc= new Scanner(System.in);
		System.out.println("nhap ban kinh");
		double r= sc.nextDouble() ;
		cv= 2*r*pi;
		System.out.println("chu vi hinh tron"+cv +"\n");
		System.out.println("dien tich hinh tron"+ Math.pow(r, 2));
	}
}
