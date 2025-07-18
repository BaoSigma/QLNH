/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.ModelDAO;

import DAO.CrudDAO;
import Model.NhanVien;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author baoha
 */
public interface SignInDAO extends CrudDAO<NhanVien, Object>{
    List<NhanVien>list = new ArrayList<>();
}
