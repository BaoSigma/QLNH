/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO.ModelDAO;

import DAO.CrudDAO;
import Model.HoaDon;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public interface HoaDonDAO extends CrudDAO<HoaDon, Object> {
    List<HoaDon> nv = new ArrayList<>();
}
