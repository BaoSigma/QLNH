/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.ModelController;

import Util.UDialog;

/**
 *
 * @author baoha
 */
public interface SignInController {
    void create();
    default void exit(){
    if(UDialog.confirm("Bạn muốn kết thúc?")){
    System.exit(0);
    }
    }
    void back();
}
