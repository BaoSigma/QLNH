/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class doanhthu {
      private String maHoaDon;
    private String tenKhachHang;
    private String tenNhanVien;
    private java.time.LocalDateTime ngayLap;
    private double tongTien;
    private String theoNgay; // dd/MM/yyyy
    private String theoThang; // MM/yyyy
    private String maKhachHang;
    private String maNhanVien;

    public doanhthu(String maHoaDon, String tenKhachHang, String tenNhanVien,
                         java.time.LocalDateTime ngayLap, double tongTien,
                         String theoNgay, String theoThang,
                         String maKhachHang, String maNhanVien) {
        this.maHoaDon = maHoaDon;
        this.tenKhachHang = tenKhachHang;
        this.tenNhanVien = tenNhanVien;
        this.ngayLap = ngayLap;
        this.tongTien = tongTien;
        this.theoNgay = theoNgay;
        this.theoThang = theoThang;
        this.maKhachHang = maKhachHang;
        this.maNhanVien = maNhanVien;
    }

    // Getter & Setter (có thể sinh tự động trong NetBeans)
    public String getMaHoaDon() 
    { return maHoaDon; }
    public void setMaHoaDon(String maHoaDon) 
    { this.maHoaDon = maHoaDon; }

    public String getTenKhachHang()
    { return tenKhachHang; }
    public void setTenKhachHang(String tenKhachHang) 
    { this.tenKhachHang = tenKhachHang; }

    public String getTenNhanVien() 
    { return tenNhanVien; }
    public void setTenNhanVien(String tenNhanVien)
    { this.tenNhanVien = tenNhanVien; }

    public java.time.LocalDateTime getNgayLap() 
    { return ngayLap; }
    public void setNgayLap(java.time.LocalDateTime ngayLap)
    { this.ngayLap = ngayLap; }

    public double getTongTien()
    { return tongTien; }
    public void setTongTien(double tongTien) 
    { this.tongTien = tongTien; }

    public String getTheoNgay() 
    { return theoNgay; }
    public void setTheoNgay(String theoNgay)
    { this.theoNgay = theoNgay; }

    public String getTheoThang() 
    { return theoThang; }
    public void setTheoThang(String theoThang)
    { this.theoThang = theoThang; }

    public String getMaKhachHang() 
    { return maKhachHang; }
    public void setMaKhachHang(String maKhachHang)
    { this.maKhachHang = maKhachHang; }

    public String getMaNhanVien()
    { return maNhanVien; }
    public void setMaNhanVien(String maNhanVien) 
    { this.maNhanVien = maNhanVien; }
}
