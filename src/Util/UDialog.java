/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import javax.swing.JOptionPane;

/**
 *
 * @author baoha
 */
public class UDialog {
    public static void alert(String message){
        UDialog.alert(message, "Thông báo!");
    }
    public static void alert(String message, String title){
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.WARNING_MESSAGE);
    }
    
    public static boolean confirm(String message){
        return UDialog.confirm(message, "Xác nhận!");
    }
    public static boolean confirm(String message, String title){
        int result = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return (result == JOptionPane.YES_OPTION);
    }
    
    public static String prompt(String message){
        return UDialog.prompt(message, "Nhập vào!");
    }
    public static String prompt(String message, String title){
        return JOptionPane.showInputDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }
}

