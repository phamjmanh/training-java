package phuongThuc;

import java.util.Scanner;

public class sapXepSoNguyen {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Nhập Số thứ 1: ");
	        double num1 = scanner.nextDouble();
	        System.out.println("Nhập Số thứ 2: ");
	        double num2 = scanner.nextDouble();
	        System.out.println("Nhập Số thứ 3: ");
	        double num3 = scanner.nextDouble();
	        displaySortedNumbers(num1, num2, num3);
	    }

	    public static void displaySortedNumbers(double num1, double num2, double num3) {
	        double temp = 0;
	        if (num1 > num2) {
	            temp = num1;
	            num1 = num2;
	            num2 = temp;
	        }

	        if (num1 > num3) {
	            temp = num1;
	            num1 = num3;
	            num3 = temp;
	        }

	        // chuyển số bé nhì vào b
	        if (num2 > num3) {
	            temp = num2;
	            num2 = num3;
	            num3 = temp;
	        }
	        System.out.println("giảm dần : " + num3 + "\t" + num2 + "\t" + num1);
	    }
}
