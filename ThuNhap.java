package bài1;
import java.util.Scanner;
public class ThuNhap {
	public static void main(String[] args) {
	        int NGAY_LAM_VIEC_TIEU_CHUAN = 22;
	        double LUONG_CO_BAN = 1490000;
	        Scanner x = new Scanner(System.in);
	        System.out.println("Nhập số ngày làm việc của nhân viên: ");
	        int soNgayLamViec = x.nextInt();
	        System.out.println("Nhập chức vụ của nhân viên (Nhân viên/Trưởng phòng/Giám đốc): ");
	        String chucVu = x.nextLine();
	        double luongCoBan = LUONG_CO_BAN;
	        if (soNgayLamViec > NGAY_LAM_VIEC_TIEU_CHUAN) {
	            if (soNgayLamViec > 30) {
	                luongCoBan *= 2;
	            } else {
	                luongCoBan *= 1.2;
	            }
	        }
	        double heSoChucVu = 1.0;
	        switch (chucVu) {
	            case "Trưởng phòng":
	                heSoChucVu += 0.3;
	                break;
	            case "Giám đốc":
	                heSoChucVu += 0.5;
	                break;
	            default:
	                break;
	        }
	        double thuNhap = luongCoBan * heSoChucVu;
	        System.out.println("Thu nhập của nhân viên là: " + thuNhap);
	    }
}
