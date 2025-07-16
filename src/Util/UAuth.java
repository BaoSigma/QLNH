/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import Model.NhanVien;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.prefs.Preferences;

/**
 *
 * @author baoha
 */
public class UAuth {
    public static NhanVien user = null; 

    public static void clear() {
        user = null;
    }

    public static boolean isLogin() {
        return user != null;
    }

    public static boolean is1() {
        return user != null && "Quản lý".equalsIgnoreCase(user.getTenVaiTro());
    }

    public static boolean is2() {
    return user != null && (
        "Nhân viên".equalsIgnoreCase(user.getTenVaiTro())
    );
}

    public static boolean is3() {
        return user != null && (
                 "Phục vụ".equalsIgnoreCase(user.getTenVaiTro())
                );
    }
    
    public static boolean is4() {
        return user != null && (
                "Bảo vệ" .equalsIgnoreCase(user.getTenVaiTro())
                );
    }
    private static final Preferences prefs = Preferences.userRoot().node("PolyLogin");

    public static void save() {
        if (user != null) {
            prefs.put("maNV", safe(user.getMaNV()));
        prefs.put("hoTen", safe(user.getHoTen()));
        prefs.put("matKhau", safe(user.getMatKhau()));
        prefs.put("email", safe(user.getEmail()));
        prefs.put("luongCoBan", safe(Double.toString(user.getLuongCoBan())));
        prefs.put("tenVaiTro", safe(user.getTenVaiTro()));
        prefs.put("anh", safe(user.getAnh()));

            
            String namSinhStr = "";
            if (user.getNgaySinh()!= null) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                namSinhStr = sdf.format(user.getNgaySinh());
            }
            prefs.put("NgaySinh", namSinhStr);
            prefs.put("Anh", safe(user.getAnh()));
        }
    }

    public static void load() {
        String maNV = prefs.get("MaNV", null);
        if (maNV == null || maNV.isEmpty()) {
            user = null;
            return;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date ngaySinh;
        try {
            ngaySinh = sdf.parse(prefs.get("NgaySinh", "2000-01-01"));
        } catch (ParseException e) {
            ngaySinh = new Date();
        }

        user = NhanVien.builder()
                .MaNV(maNV)
                .HoTen(prefs.get("HoTen", ""))
                .MatKhau(prefs.get("MatKhau", ""))
                .Email(prefs.get("Email", ""))
                .LuongCoBan(Double.parseDouble(prefs.get("LuongCoBan", "0")))
                .NgaySinh(ngaySinh)
                .Anh(prefs.get("Anh", ""))
                .build();
    }
    public static void buildSampleUser() {
    try {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date sampleDate = sdf.parse("2000-01-01");
        
        user = NhanVien.builder()
                .MaNV("NV01")
                .HoTen("Bùi Gia Bảo")
                .MatKhau("123   ")
                .Email("baobao1@gmail.com")
                .LuongCoBan(7000000.00)
                .NgaySinh(sampleDate)
                .Anh("nv1.jpg")
                .build();
    } catch (ParseException e) {
        e.printStackTrace();
    }
}

    private static String safe(String value) {
        return value == null ? "" : value;
    }
}
