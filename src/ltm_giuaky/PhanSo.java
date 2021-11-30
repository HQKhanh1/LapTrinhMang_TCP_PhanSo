/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ltm_giuaky;

/**
 *
 * @author khanhs
 */
public class PhanSo {

    int tu, mau;

    public PhanSo() {
        tu = 0;
        mau = 1;
    }

    public PhanSo(int t, int m) {
        tu = t;
        mau = m;
    }
    public PhanSo(PhanSo a){
        tu = a.getTu();
        mau = a.getMau();
    }
    public PhanSo sum(PhanSo b) {
        PhanSo c = new PhanSo();
        c.setTu(tu * b.getMau() + b.getTu() * mau);
        c.setMau(mau * b.getMau());
        return c;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }
    public void toiGianPhanSo(){
        int UCLN = HamPhanSo.USCLN(this.getTu(), this.getMau());
        this.setTu(this.getTu()/UCLN);
        this.setMau(this.getMau()/UCLN);
    }
    public void setMau(int mau) {
        this.mau = mau;
    }
}
