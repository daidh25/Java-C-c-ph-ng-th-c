package bài1;
import java.util.Scanner;
public class UCLNvaTamGiac {
	    public static int timUCLN(int a, int b) {
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;
	    }

	    public static boolean kiemTraTamGiac(int a, int b, int c) {
	        if (a <= 0 || b <= 0 || c <= 0) {
	            return false;
	        }
	        if (a + b > c && a + c > b && b + c > a) {
	            return true;
	        }
	        else {
	            return false;
	        }
	    }

	    public static void main(String[] args) {
	        Scanner x = new Scanner(System.in);
	        int a = 0, b = 0, c = 0;
	        while (a <= 0 && b <= 0 && c <= 0) {
	            System.out.print("Nhập số a (phải là số dương): ");
	            a = x.nextInt();
	            System.out.print("Nhập số b (phải là số dương): ");
	            b = x.nextInt();
	            System.out.print("Nhập số c (phải là số dương): ");
	            c = x.nextInt();
	            if (a <= 0 && b <= 0 && c <= 0) {
	                System.out.println("Vui lòng nhập số dương!!");
	            }
	        } 
	        int ucln_ab = timUCLN(a, b);
	        System.out.println("Ước chung lớn nhất của " + a + " và " + b + " là: " + ucln_ab);

	        if (kiemTraTamGiac(a, b, c)) {
	            System.out.println("Ba số " + a + ", " + b + ", " + c + " tạo thành một tam giác.");
	        }
	        else {
	            System.out.println("Ba số " + a + ", " + b + ", " + c + " không tạo thành một tam giác.");
	        }

	    }
}


