/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controller.ModelController;

    

/**
 *
 * @author baoha
 */
public interface OrderController {
    void filltoTableDoUong();
    void filltoTableMonLau();
    void filltoTableMonNuong();
    void filltoTableMonnhe();

    // Dùng object thay vì từng thuộc tính
    void filltoTableGoiMon(String MaMon, String TenMon, double Gia);
    double tinhTongTien();
    void filltoCombo();
    
    void timkiem();
    void XacNhan();
    void HuyBo();
}
