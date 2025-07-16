/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.impl;

import DAO.ModelDAO.LoginDAO;
import Model.NhanVien;
import Model.VaiTro;
import Util.UQuery;
import java.util.List;

/**
 *
 * @author User
 */
public class Loginimpl implements LoginDAO{
    private String findAllNhanVienSQL = "SELECT maNV, hoTen, namSinh, sdt, email, chucVu FROM Nhanvien";
    private String findNhanVienByIdSQL = findAllNhanVienSQL + " WHERE maNV = ?";
    private String updateNhanVienSQL = "UPDATE Nhanvien SET hoTen = ?, namSinh = ?, sdt = ?, email = ?, chucVu = ? WHERE maNV = ?";

        @Override
    public NhanVien create(NhanVien entity) {
        return entity;
    }

    @Override
    public void update(NhanVien entity) {
    }

    @Override
    public void deleteById(Object id) {
    }

    @Override
    public List<NhanVien> findAll() {
        return UQuery.getBeanList(NhanVien.class, findAllNhanVienSQL);
    }

    @Override
    public NhanVien findById(Object id) {
        return UQuery.getSingleBean(NhanVien.class, findNhanVienByIdSQL, id);
    }
     

}
