/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controller.ModelController;

import Util.UDialog;

/**
 *
 * @author User
 */
public interface LoginController {
    void loginn();
    default void exit(){
if(UDialog.confirm("Bạn muốn kết thúc?")){
System.exit(0);
}
}
}
