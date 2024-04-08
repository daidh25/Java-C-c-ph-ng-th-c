package bài1;
import java.util.Scanner;
public class Tinhdiemtichluy {

	public static void main(String[] args) {
		 Scanner x = new Scanner(System.in);
	     System.out.println("Nhập số học kỳ: ");
	     int soHocKy = x.nextInt();
	     double tongSoTinChi = 0; 
	     double tongDiemTichLuy = 0; 
	     for (int i = 1; i <= soHocKy; i++) {
            System.out.println("Nhập số môn học trong học kỳ " + i + ": ");
            int soMonHoc = x.nextInt();
            double tongDiemHocKy = 0;
            for (int j = 1; j <= soMonHoc; j++) {
                System.out.println("Nhập điểm của môn học " + j + " (trong khoảng từ 0 đến 10): ");
                double diem = x.nextDouble();
                System.out.println("Nhập số tín chỉ của môn học " + j + ": ");
                double tinChi = x.nextDouble();

                tongDiemHocKy += diem * tinChi;
                tongSoTinChi += tinChi;
            }

            double diemTrungBinhHocKy = tongDiemHocKy / tongSoTinChi;
            System.out.println("Điểm trung bình của học kỳ " + i + ": " + diemTrungBinhHocKy);

            tongDiemTichLuy += tongDiemHocKy;
	     }

	        double diemTichLuy = tongDiemTichLuy / tongSoTinChi;
	        System.out.println("Điểm tích lũy của sinh viên là: " + diemTichLuy);
	    }
}
