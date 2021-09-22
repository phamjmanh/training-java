import java.util.Scanner;

public class soCotMax {
	 public static void main(String[] args) {
	        double array[][] = new double[3][3];
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("điền " + array.length + " hàng " +
	                array[0].length + " cột: ");

	        for (int row = 0; row < array.length; row++) {
	            for (int column = 0; column < array[row].length; column++) {
	                System.out.print("phần tử[" + row + "][" + column + "] = ");
	                array[row][column] = scanner.nextDouble();
	            }
	        }
	        double maxValue = array[0][0];
	        for (int row = 0; row < array.length; row++) {
	            for (int column = 0; column < array[row].length; column++) {
	                if (array[row][column] > maxValue) {
	                    maxValue = array[row][column];
	                }
	            }
	        }
	        System.out.println("cột tổng lớn nhất: " + maxValue);
	    }
}
