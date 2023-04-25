/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlibaochi;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Redmi
 */
public class TapChi extends BaoChi {
    private ArrayList <DSTapChi> dstc;
    DSTapChi dstapchi;
    
    public TapChi() {
        super();
    }

    public TapChi(String ngonNgu, String kenh , ArrayList <DSTapChi> ct) {
        super(ngonNgu);
        this.dstc = ct;
    }

    public ArrayList<DSTapChi> getDstc() {
        return dstc;
    }

    public void setDstc(ArrayList<DSTapChi> dstc) {
        this.dstc = dstc;
    }

    public DSTapChi getDstapchi() {
        return dstapchi;
    }

    public void setDstapchi(DSTapChi dstapchi) {
        this.dstapchi = dstapchi;
    }
    

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("----------------------------------------------");
        nhapDSTapChi();
    }
    
    @Override
    public void xuat() {
        super.xuat();
        xuatDSTapChi();
    }
    
    public void nhapDSTapChi() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap so tap chi can them: ");
        int n = sc.nextInt();
        dstc = new ArrayList<>();
        for(int i=0; i<n; i++) {
            dstapchi= new DSTapChi();
            dstapchi.nhapThongTin();
            dstc.add(dstapchi);
            System.out.println("----------------------------------------------");
        }
    }
    
    public void xuatDSTapChi() {
        System.out.println("----------------------------------------------");
        for(DSTapChi x: dstc) {
            x.xuatThongTin();
            System.out.println("----------------------------------------------");
        }
    }
    
    public void themTapChi() {
        DSTapChi newTC = new DSTapChi();
        newTC.nhapThongTin();
        dstc.add(newTC);
        System.out.println("Da them thong tin tap chi " );
    }
    
    public void xoaTapChi() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap ma tap chi can xoa: ");
    String ten = sc.nextLine();
    for (DSTapChi c : dstc) {
        if (c.getMaTapChi().equals(ten)) {
            dstc.remove(c);
            System.out.println("Da xoa thong tin tap chi " + ten);
            return;
        }
    }
        System.out.println("Khong tim thay tap chi can xoa " + ten);
    }
    
    public void timKiemTapChi() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap ma tap chi can tim kiem: ");
    String ten = sc.nextLine();
    System.out.println("----------------------------------------------");
    for (DSTapChi c : dstc) {
        if (c.getMaTapChi().equals(ten)) {
            c.xuatThongTin();
            System.out.println("Da tim thay thong tin tap chi " + ten);
            return;
        }
    }
        System.out.println("Khong tim thay tap chi " + ten);
    }
    
    public void suaTapChi() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap ma tap chi can sua: ");
    String ten = sc.nextLine();
    for (DSTapChi c : dstc) {
        if (c.getMaTapChi().equals(ten)) {
            c.nhapThongTin();
            System.out.println("Da sua thong tin tap chi " + ten);
            return;
        }
    }
        System.out.println("Khong tim thay tap chi can sua " + ten);
    }
    
    public void SapXepTheoGiaTien() {
        Collections.sort(dstc, new sapXep());
        System.out.println("Danh sach tap chi sau khi sap xep theo gia tien ");
        xuatDSTapChi();
    }
    
    public void thongKeGiaTien() {
        double tongGiaTien = 0;
        for(DSTapChi x: dstc) {
            tongGiaTien += x.getGiaTien();
        }
        System.out.println("Tong gia tien cac tap chi: " + tongGiaTien);
    }

    
    public void SuaDoi() {
    Scanner sc = new Scanner(System.in);
    int n;
    do {
        System.out.print("Chon: ");
        n = sc.nextInt();
        switch (n) {
            case 1 ->  {
                xoaTapChi();
                break;
            }
            case 2 ->  {
                suaTapChi();
                break;
            }
            case 3 ->  {
                timKiemTapChi();
                break;
            }
            case 4 ->  {
                themTapChi();
                break;
            }
            default -> {
                break;
            }
        }
    } while (n != 0);
    
    }
}
