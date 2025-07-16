/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 *
 * @author User
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NhanVien extends VaiTro{
    private String MaNV;
    private String HoTen;
    private String MatKhau;
    private String Email;
    private double LuongCoBan;
    private Date NgaySinh;
    private String Anh;



    public NhanVien(String MaNV, String HoTen, String MatKhau, String Email, double LuongCoBan, Date NgaySinh, String Anh, int MaVaiTro, String TenVaiTro) {
        super(MaVaiTro, TenVaiTro);
        this.MaNV = MaNV;
        this.HoTen = HoTen;
        this.MatKhau = MatKhau;
        this.Email = Email;
        this.LuongCoBan = LuongCoBan;
        this.NgaySinh = NgaySinh;
        this.Anh = Anh;
    }



    


    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    
    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public double getLuongCoBan() {
        return LuongCoBan;
    }

    public void setLuongCoBan(double LuongCoBan) {
        this.LuongCoBan = LuongCoBan;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getAnh() {
        return Anh;
    }

    public void setAnh(String Anh) {
        this.Anh = Anh;
    }
}