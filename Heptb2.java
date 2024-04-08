package bài1;

import java.util.Scanner;

public class Heptb2 {

	public static void giaiPTB2(float a, float b, float c) {
        float delta = b * b - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có hai nghiệm phân biệt:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép:");
            System.out.println("x = " + x);
        } else {
            System.out.println("Phương trình vô nghiệm.");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hệ số a: ");
        float a = scanner.nextFloat();
        System.out.println("Nhập hệ số b: ");
        float b = scanner.nextFloat();
        System.out.println("Nhập hệ số c: ");
        float c = scanner.nextFloat();
        giaiPTB2(a, b, c);
    }
}
