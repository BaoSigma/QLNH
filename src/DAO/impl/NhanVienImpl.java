/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.impl;

import DAO.ModelDAO.NhanVienDAO;
import Model.NhanVien;
import Util.UJdbc;
import Util.UQuery;
import java.util.List;
import java.sql.ResultSet;
/**
 *
 * @author baoha
 */
public class NhanVienImpl implements NhanVienDAO{
private static final String findall = "SELECT \n" +
"    nv.MaNV,\n" +
"    nv.HoTen,\n" +
"    vt.TenVaiTro,\n" +
"    nv.MatKhau,\n" +
"    nv.Email,\n" +
"    nv.LuongCoBan,\n" +
"    nv.NgaySinh,\n" +
"    nv.Anh\n" +
"FROM NhanVien nv\n" +
"JOIN VaiTro vt ON nv.MaVaiTro = vt.MaVaiTro;";
    private static final String  createsql= "EXEC sp_ThemVaTraNhanVien\n" +
"    @HoTen = ?, \n" +
"    @MaVaiTro = ?,\n" +
"    @Email = ?, \n" +
"    @LuongCoBan = ?,\n" +
"    @NgaySinh = ?,\n" +
"    @Anh = ?; ";
    private static final String updatesql = "UPDATE NhanVien\n" +
"SET\n" +
"    HoTen = ?,\n" +
"    MaVaiTro = ?,\n" +
"    Email = ?,\n" +
"    LuongCoBan = ?,\n" +
"    NgaySinh = ?,\n" +
"    Anh = ?\n" +
"WHERE MaNV = ?;";
    private static final String deletesql = 
    "DELETE FROM NhanVien WHERE MaNV = ?;";

    private static final String findbyid = 
    "SELECT nv.MaNV, nv.HoTen, vt.TenVaiTro, nv.Email, nv.LuongCoBan, nv.NgaySinh, nv.MatKhau " +
    "FROM NhanVien nv " +
    "JOIN VaiTro vt ON nv.MaVaiTro = vt.MaVaiTro " +
    "WHERE nv.MaNV = ?;";
   
    public int getMaVaiTro(String tenVaiTro) {
    String sql = "SELECT MaVaiTro FROM VaiTro WHERE TenVaiTro = ?";
    try {
        ResultSet rs = UJdbc.executeQuery(sql, tenVaiTro);
        if (rs.next()) {
            return rs.getInt("MaVaiTro");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return 0; // hoặc -1 nếu không có
}


    
    
    @Override
    public NhanVien create(NhanVien entity) {
        Object[] values = {
            entity.getHoTen(),
           entity.getMaVaiTro(),
           entity.getEmail(),
           entity.getLuongCoBan(),
           entity.getNgaySinh(),
           entity.getAnh()
        };
        UJdbc.executeUpdate(createsql, values);
        return entity;
    }

    @Override
    public void update(NhanVien entity) {
        Object[] values = {
            entity.getHoTen(),
           entity.getMaVaiTro(),
           entity.getEmail(),
           entity.getLuongCoBan(),
           entity.getNgaySinh(),
           entity.getAnh(),
           entity.getMaNV()
        };
        UJdbc.executeUpdate(updatesql, values);
        
    }

    @Override
    public void deleteById(Object id) {
        UJdbc.executeUpdate(deletesql, id);    
    }

    @Override
    public List<NhanVien> findAll() {
        return UQuery.getBeanList(NhanVien.class, findall);
    }

    @Override
    public NhanVien findById(Object id) {
        return UQuery.getSingleBean(NhanVien.class, findbyid, id);
    }
    public List<NhanVien> findByKeyword(String keyword) {
    String sql = """
        SELECT 
            nv.MaNV,
            nv.HoTen,
            vt.TenVaiTro,
            nv.MatKhau,
            nv.Email,
            nv.LuongCoBan,
            nv.NgaySinh,
            nv.Anh
        FROM NhanVien nv
        JOIN VaiTro vt ON nv.MaVaiTro = vt.MaVaiTro
        WHERE nv.MaNV LIKE ? 
            OR nv.HoTen LIKE ? 
            OR vt.TenVaiTro LIKE ? 
            OR nv.Email LIKE ? 
            OR CAST(nv.LuongCoBan AS VARCHAR) LIKE ?
    """;

    String value = "%" + keyword + "%";
    return UQuery.getBeanList(NhanVien.class, sql, value, value, value, value, value);
}




}
