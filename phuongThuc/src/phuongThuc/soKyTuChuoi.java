package phuongThuc;

import java.util.Scanner;

public class soKyTuChuoi {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println("Enter a char: ");
        char c = scanner.next().charAt(0);
        System.out.println("The number of appearance in string is: " + countLetters(str, c));
    }

    public static int countLetters(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            String xxx = String.valueOf(str.charAt(i));

            if (Character.toString(c).equalsIgnoreCase(xxx)) {
                count++;
            }
        }
        return count;
    }
}
