import java.util.Scanner;

public class gopMang {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int index = 0;
        int i;
		//số lượng phần tử mảng 1
		System.out.println("Mời bạn nhập số lượng phần tử mảng A");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        // số lượng phần tử mang 2 
        System.out.println("Mời bạn nhập số lượng phần tử mảng B");
        int m = scanner.nextInt();
        int brr[] = new int[m];
        //tạo mảng
        int crr[] = new int[m + n];
        //Nhập phần tử mảng 1
        for (i = 0; i < n; i++) {
            System.out.println("Mời bạn nhập phần tử mang A : ");
            arr[i] = scanner.nextInt();
        }
        //Nhập phần tử mảng 2
        for (i = 0; i < m; i++) {
            System.out.println("Mời bạn nhập phần tử B : ");
            brr[i] = scanner.nextInt();
        }
        //Gán giá trị mảng 1 cho mảng 3
        for (i = 0; i < n; i++) {
            crr[index] = arr[i];
            index++;
        }
        
        //Gán giá trị mảng 2 cho mảng 3
        for (i = 0; i < m; i++) {
            crr[index] = brr[i];
            index++;
        }
        System.out.println("Số phần tử 2 mảng là : ");
        for (i = 0; i < n + m; i++) {
            System.out.print(crr[i]+"\t");
        }
	}
}
