import java.util.Scanner;

public class giaiPhuongTrinhBac2 {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập số b: ");
        double b = sc.nextDouble();
        System.out.println("Nhập số c: ");
        double c = sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                double x = -c / b;
                System.out.println("Phương trình có nghiệm là: " + x);
            }
        } else {
            if (a != 0) {
                double Delta = Math.pow(b, 2) - 4 * a * c;
                if (Delta <= 0) {
                    System.out.println("Phương trình vô nghiệm");
                } else {
                    if (Delta == 0) {
                        double x1 = -b / (2 * a);
                        System.out.println("Phương trình có nghiệm kép là: " + x1);
                    } else {
                        double sqrDelta = Math.sqrt(Delta);
                        System.out.println("Căn Delta là: " + sqrDelta);
                        double x2 = -b + (sqrDelta / (2 * a));
                        double x3 = -b - (sqrDelta / (2 * a));
                        System.out.println("Phương trình có hai nghiệm phân biệt là: " + x2 + "\t và" + x3);
                    }
                }
            }
        }
    }

}
