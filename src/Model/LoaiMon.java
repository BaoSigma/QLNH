/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class LoaiMon {
    private int maLoai;
    private String tenLoai;
    private String tenMua;

    public LoaiMon(int maLoai, String tenLoai, String tenMua) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
        this.tenMua = tenMua;
    }

    public LoaiMon() {
    }
    
    public int getMaLoai() {
        return maLoai;
    }
    public void setMaLoai(int maLoai) {
        this.maLoai = maLoai;
    }
    public String getTenLoai() {
        return tenLoai;
    }
    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }
    public String getTenMua() {
        return tenMua;
    }
    public void setTenMua(String tenMua) {
        this.tenMua = tenMua;
    }
}
