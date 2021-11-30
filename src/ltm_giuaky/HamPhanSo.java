package ltm_giuaky;

import java.awt.List;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author khanhs
 */
public class HamPhanSo {

    public static PhanSo taoPhanSoNgauNhien() {
        PhanSo ran = new PhanSo();
        ran.setTu(ThreadLocalRandom.current().nextInt(1, 1001));
        ran.setMau(ThreadLocalRandom.current().nextInt(1, 1001));
        return ran;
    }

    public static int USCLN(int a, int b) {
        if (b == 0) {
            return a;
        }
        return USCLN(b, a % b);
    }

    public static ArrayList<PhanSo> DSPhanSoNgauNhien(int n) {
        ArrayList<PhanSo> DSPhanSo = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            PhanSo a = taoPhanSoNgauNhien();
            DSPhanSo.add(a);
        }
        return DSPhanSo;
    }

    public static String chuyenPhanSoThanhChuoi(ArrayList<PhanSo> DSPhanSo) {
        int sl = DSPhanSo.size();
        String chuoiPhanSo = Integer.toString(sl);
        for (int i = 0; i < sl; i++) {
            String tu = Integer.toString(DSPhanSo.get(i).getTu());
            String mau = Integer.toString(DSPhanSo.get(i).getMau());
            chuoiPhanSo += "-";
            chuoiPhanSo = chuoiPhanSo + tu;
            chuoiPhanSo += "-";
            chuoiPhanSo = chuoiPhanSo + mau;
        }
        return chuoiPhanSo;
    }
    public static ArrayList<PhanSo> DSPhanSoCoMauNguyenTo(ArrayList<PhanSo> DSPhanSo) {
        ArrayList<PhanSo> DSPSNguyenTo = new ArrayList<>();
        for(int i = 0; i < DSPhanSo.size(); i++){
            if(SoNguyenTo.isPrimeNumber(DSPhanSo.get(i).getMau())){
                DSPSNguyenTo.add(DSPhanSo.get(i));
            }
        }
        return DSPSNguyenTo;
        
    }
    public static ArrayList<PhanSo> chuyenStringThanhPhanSo(String stringPS) {
        ArrayList<PhanSo> DSPhanSo = new ArrayList<>();
        String[] parts = stringPS.split("-", 0);
        int soLuongPS = Integer.parseInt(parts[0]);
        System.out.println("So luong PS:" + soLuongPS);
        for (int i = 1; i < soLuongPS * 2 + 1; i += 2) {
            int tu = Integer.parseInt(parts[i]);
            int mau = Integer.parseInt(parts[i + 1]);

            PhanSo a = new PhanSo();
            a.setTu(tu);
            a.setMau(mau);
            DSPhanSo.add(a);
        }
        return DSPhanSo;
    }
    public static String hienThiPhanSo(ArrayList<PhanSo> DSPhanSo){
        int sl = DSPhanSo.size();
        String chuoiPhanSo = "";
        for (int i = 0; i < sl; i++) {
            String tu = Integer.toString(DSPhanSo.get(i).getTu());
            String mau = Integer.toString(DSPhanSo.get(i).getMau());
            chuoiPhanSo = chuoiPhanSo + tu;
            chuoiPhanSo += "/";
            chuoiPhanSo = chuoiPhanSo + mau;
            chuoiPhanSo += "        ";
        }
        return chuoiPhanSo;
    }
}
