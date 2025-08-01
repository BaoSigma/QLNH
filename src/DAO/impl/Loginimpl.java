/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.impl;


import DAO.ModelDAO.NhanVienDAO;
import Model.NhanVien;
import Model.VaiTro;
import Util.UJdbc;
import Util.UQuery;
import java.util.List;

/**
 *
 * @author User
 */
public class Loginimpl implements NhanVienDAO{
    private String findAllNhanVienSQL = "SELECT * FROM Nhanvien";
    private String findNhanVienByIdSQL = findAllNhanVienSQL + " WHERE maNV = ?";
    private String updateNhanVienSQL = "UPDATE Nhanvien SET MatKhau = ? WHERE maNV = ?";

        @Override
    public NhanVien create(NhanVien entity) {
        return entity;
    }

    @Override
    public void update(NhanVien entity) {
        Object[] values = {
            entity.getMatKhau(),
            entity.getMaNV(),
        };
        UJdbc.executeUpdate(updateNhanVienSQL, values);
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
