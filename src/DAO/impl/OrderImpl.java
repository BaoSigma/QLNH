/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.impl;

import Model.BanAn;
import Model.ChiTietHoaDon;
import Model.HoaDon;
import Model.MonAn;
import Util.UJdbc;
import Util.UQuery;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author baoha
 */
public class OrderImpl {
    public static final String goiDoUong = "SELECT L.TenLoai AS LoaiMon, M.TenMon, M.DonGia, M.HinhAnh\n" +
"FROM MonAn M\n" +
"JOIN LoaiMon L ON M.MaLoai = L.MaLoai\n" +
"WHERE L.TenLoai = N'Đồ uống'";
    public static final String goiMonLau = "SELECT L.TenLoai AS LoaiMon, M.TenMon, M.DonGia, M.HinhAnh\n" +
"FROM MonAn M\n" +
"JOIN LoaiMon L ON M.MaLoai = L.MaLoai\n" +
"WHERE L.TenLoai = N'Món lẩu'";
    public static final String goiMonNuong = "SELECT L.TenLoai AS LoaiMon, M.TenMon, M.DonGia, M.HinhAnh\n" +
"FROM MonAn M\n" +
"JOIN LoaiMon L ON M.MaLoai = L.MaLoai\n" +
"WHERE L.TenLoai = N'Món nướng'";
    public static final String goiMoNhe = "SELECT L.TenLoai AS LoaiMon, M.TenMon, M.DonGia, M.HinhAnh\n" +
"FROM MonAn M\n" +
"JOIN LoaiMon L ON M.MaLoai = L.MaLoai\n" +
"WHERE L.TenLoai = N'Món nhẹ'";
    public static final String sqlBanAn = "SELECT MaBan, SoBan, TrangThai\n" +
"FROM BanAn";
    public static final String sqlHoaDon = "EXEC sp_ThemHoaDon \n" +
"    @MaBan = ? ,\n" +
"    @MaNV = ?,\n" +
"    @NgayLap = ?,\n" +
"    @TongTien = ?,\n" +
"    @HinhThucTT = ?;";
    public static final String sqlcreate = "EXEC sp_ThemChiTietHoaDon ?, ?, ?, ?, ?, NULL;";
    public static final String timkiemall = "SELECT L.TenLoai AS LoaiMon, M.TenMon, M.DonGia, M.HinhAnh\n" +
"FROM MonAn M\n" +
"JOIN LoaiMon L ON M.MaLoai = L.MaLoai\n";
    public HoaDon create(HoaDon entity) {
        Object[] values = {
            entity.getMaBan(),
            entity.getMaNV(),
            entity.getNgayLap(),
            entity.getTongTien(),
            entity.getHinhThucTT(),
        };
        UJdbc.executeUpdate(sqlHoaDon, values);
        return entity;
    }
    public void insertChiTietHoaDon(String maHD, String MaMon, int SoLuong, String GhiChu, String TrangThai) {
        try (CallableStatement cs = UJdbc.openConnection().prepareCall(sqlcreate)) {
            cs.setString(1, maHD);
            cs.setString(2, MaMon);
            cs.setString(3, GhiChu);
            cs.setInt(4, SoLuong);
            cs.setString(5, TrangThai);
            cs.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
         
    }
        public List<MonAn> timkiemdouong(String keyword) {
    String sql = timkiemall
        + " WHERE L.TenLoai = N'Đồ uống' AND M.TenMon LIKE ? OR M.DonGia LIKE ? ";

    String value = "%" + keyword + "%";
    return UQuery.getBeanList(MonAn.class, sql,value, value);
}
        public List<MonAn> timkiemmonlau(String keyword) {
    String sql = timkiemall
        + " WHERE L.TenLoai = N'Món lẩu' OR M.TenMon LIKE ? OR M.DonGia LIKE ? ";

    String value = "%" + keyword + "%";
    return UQuery.getBeanList(MonAn.class, sql, value, value);
}
        public List<MonAn> timkiemmonnuong(String keyword) {
    String sql = timkiemall
        + " WHERE L.TenLoai = N'Món nướng' OR M.TenMon LIKE ? OR M.DonGia LIKE ? ";

    String value = "%" + keyword + "%";
    return UQuery.getBeanList(MonAn.class, sql, value, value);
}
        public List<MonAn> timkiemmonnhe(String keyword) {
    String sql = timkiemall
        + " WHERE L.TenLoai = N'Món nhẹ' OR M.TenMon LIKE ? OR M.DonGia LIKE ? ";

    String value = "%" + keyword + "%";
    return UQuery.getBeanList(MonAn.class, sql, value, value);
}
    
    public List<MonAn> DoUong() {
        return UQuery.getBeanList(MonAn.class, goiDoUong);
    }
    public List<MonAn> MonLau() {
        return UQuery.getBeanList(MonAn.class, goiMonLau);
    }
    public List<MonAn> MonNuong() {
        return UQuery.getBeanList(MonAn.class, goiMonNuong);
    }
    public List<MonAn> MoNhe() {
        return UQuery.getBeanList(MonAn.class, goiMoNhe);
    }
    public List<BanAn> CBOBan() {
        return UQuery.getBeanList(BanAn.class, sqlBanAn);
    }
}
