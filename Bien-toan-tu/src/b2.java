import java.util.Scanner;

public class b2 {
	public static void main (String[] args) {
		double Celsius ;
		Scanner sc= new Scanner(System.in);
		System.out.println("nhap Celsius");
		Celsius = sc.nextDouble();
		double Fahrenheit = (double) 9/5*Celsius+32;
		System.out.println(Celsius+"do C ="+Fahrenheit+"do F");
	}
}
