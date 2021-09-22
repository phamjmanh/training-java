import java.util.Scanner;

public class b4 {
	public static void main (String[] args) {
		int ns ;
		Scanner sc= new Scanner(System.in);
		System.out.println("nhap nam sinh");
		ns = sc.nextInt();
		
		int tinhtuoi = 2021 - ns;
		System.out.println("tuoi la:"+ tinhtuoi+"tuổi");
	}
}
