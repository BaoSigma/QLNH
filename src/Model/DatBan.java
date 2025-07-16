/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class DatBan {
    private String maDat;
    private String maKH;
    private String maBan;
    private java.sql.Date ngayDat;
    private java.sql.Time gioDat;
    private int soNguoi;
    private String trangThai;

    public String getMaDat() {
        return maDat;
    }

    public void setMaDat(String maDat) {
        this.maDat = maDat;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getMaBan() {
        return maBan;
    }

    public void setMaBan(String maBan) {
        this.maBan = maBan;
    }

    public java.sql.Date getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(java.sql.Date ngayDat) {
        this.ngayDat = ngayDat;
    }

    public java.sql.Time getGioDat() {
        return gioDat;
    }

    public void setGioDat(java.sql.Time gioDat) {
        this.gioDat = gioDat;
    }

    public int getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(int soNguoi) {
        this.soNguoi = soNguoi;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

}