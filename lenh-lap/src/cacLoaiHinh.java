import java.util.Scanner;

public class cacLoaiHinh {
	 public static void main(String[] args) {
		 System.out.print("hình tam giác botton-left: \n");
		 for(int i=1; i<=5; i++) {
	            for (int j = 1; j < i; j++) {
	                System.out.print("*");
	            }
	            System.out.println("*");
	      }
		 System.out.print("hình chữ nhật: \n");
		 for(int i=1; i<=3; i++) {
	            for (int j = 1; j <= 10; j++) {
	                System.out.print("*");
	            }
	            System.out.println("\n");
	      }
		 System.out.print("hình tam giác top-left: \n");
		 for (int i = 7; i >= 1; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println("*");
	       }
		 System.out.print("hình tam giác cân: \n");

		 int height;
	        Scanner sc = new Scanner(System.in);
	        do {
	            System.out.print("height = ");
	            height = sc.nextInt();
	        }while(height <= 0);
	         
	        for(int i = 1; i <= height; i++) {
	            for(int j = 1; j <= height-i; j++) {
	            System.out.print("  ");
	            }
	            for(int k = 1; k <= 2*i-1; k++) {
	            System.out.print("* ");
	            }
	            System.out.println("");
	        }
	   }
}
