package phuongThuc;

import java.util.Scanner;

public class daoNguoc {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số: ");
        int number = scanner.nextInt();
        System.out.println("số ngược : ");
        System.out.println(reverse(number));
    }

    public static int reverse(int number) {
        int reverse = 0;
        int rem;
        while (number > 0) {
            rem = number % 10;
            reverse = reverse * 10 + rem;
            number /= 10;
        }
        return reverse;
    }
}
