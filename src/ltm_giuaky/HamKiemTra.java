/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ltm_giuaky;

import javax.swing.JOptionPane;

/**
 *
 * @author khanhs
 */
public class HamKiemTra {
    public static boolean coPhaiLaSoNguyen(String str) {
        try {
            Integer.parseInt(str);  //chuyển string sang int để kiểm tra
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static int kiemTraSo(String chuoi){
        if(chuoi.equals("")){
            return 2;
        }
        if(coPhaiLaSoNguyen(chuoi) == false){
            //chuoi nhap vao khong phai la mot so
            return 0;
        }
        int sl = Integer.parseInt(chuoi);
        if(sl < 0){
            //chuoi nhap vao la mot so nhung nho hon 0
            return -1;
        }
            //chuoi nhap vao la mot so
        return 1;
    }
}
