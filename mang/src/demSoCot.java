import java.util.Scanner;

public class demSoCot {
	public static void main(String[] args) {
        double array[][] = new double[3][3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("điền " + array.length + " hàng  " +
                array[0].length + " cột: ");
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print("phân tử thứ [" + row + "][" + column + "] = ");
                array[row][column] = scanner.nextDouble();
            }
        }
        System.out.println("Nhập cột số :");
        int number = scanner.nextInt();

        double total = 0;
        for (int row = 0; row < array.length; row++) {
            total += array[row][number];
        }
        System.out.println("Tổng Số pt côt là: " + total);
    }
}
