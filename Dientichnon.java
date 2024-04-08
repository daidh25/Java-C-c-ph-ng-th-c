package bài1;
import java.util.Scanner;
public class Dientichnon {	    
	    public static double TinhDientichbematnon(double radius, double chieucao) {
	        double duongsinh = Math.sqrt(radius * radius + chieucao * chieucao);
	        double dientichbematnon = Math.PI * radius * (radius + duongsinh);
	        return dientichbematnon;
	    }
	    public static void main(String[] args) {
	        Scanner x = new Scanner(System.in);
	        double radius = 0, chieucao = 0;
	        while(radius <= 0 && chieucao <= 0) {
	        	System.out.println("Nhập bán kính của hình nón (r): ");
		        radius = x.nextDouble();
		        System.out.println("Nhập chiều cao của hình nón (h): ");
		        chieucao = x.nextDouble();
		        if(radius <= 0 && chieucao <= 0) {
		        	 System.out.println("Vui lòng nhập số nguyên dương ");
		        }
	        }
	        double Dientichbematnon = TinhDientichbematnon(radius, chieucao);
	        System.out.println("Diện tích bề mặt của hình nón là: " + Dientichbematnon);
	    }
}
