/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.impl;

import DAO.ModelDAO.SignInDAO;
import Model.NhanVien;
import Util.UJdbc;
import java.util.List;

/**
 *
 * @author baoha
 */
public class SignInImpl implements SignInDAO{
    private static final String createsql = "UPDATE NhanVien\n" +
            "SET \n" +
            "    HoTen = ?,\n" +
            "    MatKhau = ?,\n" +
            "    Email = ?,\n" +
            "    NgaySinh = ?\n" +
            "WHERE MaNV = ?";
    @Override
    public NhanVien create(NhanVien entity) {
        Object[] values = {
            entity.getHoTen(),
            entity.getMatKhau(),
            entity.getEmail(),
            entity.getNgaySinh(),
            entity.getMaNV(),
        };
        UJdbc.executeUpdate(createsql, values);
        return entity;
    }

    @Override
    public void update(NhanVien entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteById(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<NhanVien> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public NhanVien findById(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
