/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO.ModelDAO;

import DAO.CrudDAO;
import Model.NhanVien;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public interface NhanVienDAO extends CrudDAO<NhanVien, Object> {
    List<NhanVien> nv = new ArrayList<>();
}
