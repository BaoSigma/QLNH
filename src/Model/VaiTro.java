/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author User
 */
public class VaiTro {
    private int MaVaiTro;
    private String TenVaiTro;

    public VaiTro() {
    }

    public VaiTro(int MaVaiTro, String TenVaiTro) {
        this.MaVaiTro = MaVaiTro;
        this.TenVaiTro = TenVaiTro;
    }

    public int getMaVaiTro() {
        return MaVaiTro;
    }

    public void setMaVaiTro(int MaVaiTro) {
        this.MaVaiTro = MaVaiTro;
    }

    public String getTenVaiTro() {
        return TenVaiTro;
    }

    public void setTenVaiTro(String TenVaiTro) {
        this.TenVaiTro = TenVaiTro;
    }
}


