/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlibaochi;

import java.util.Scanner;

/**
 *
 * @author Redmi
 */
public class DSTapChi {
    private String maTapChi;
    private String ngayXuatBan;
    private String theLoai;
    private String tenTapChi;
    public int giaTien;
    
    public DSTapChi() {
        
    }

    public DSTapChi(String maTapChi ,String ngayXuatBan, String theLoai, String tenTapChi , int giaTien) {
       this.maTapChi = maTapChi;
       this.tenTapChi = tenTapChi;
       this.giaTien = giaTien;
       this.ngayXuatBan = ngayXuatBan;
       this.theLoai = theLoai;
    }

    public String getMaTapChi() {
       return maTapChi;
    }

    public void setMaTapChi(String maTapChi) {
       this.maTapChi = maTapChi;
    }

    public String getTenTapChi() {
       return tenTapChi;
    }

    public void setTenTapChi(String tenTapChi) {
       this.tenTapChi = tenTapChi;
    }

    public int getGiaTien() {
       return giaTien;
    }

    public void setGiaTien(int giaTien) {
       this.giaTien = giaTien;
    }
    
    public String getNgayXuatBan() {
       return ngayXuatBan;
    }

    public void setNgayXuatBan(String ngayXuatBan) {
       this.ngayXuatBan = ngayXuatBan;
    }
    
    public String getTheLoai() {
       return theLoai;
    }

    public void setTheLoai(String theLoai) {
       this.theLoai = theLoai;
    }
    
    public void nhapThongTin() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap ma tap chi: ");
        maTapChi = sc.nextLine();
        System.out.print("Nhap ten tap chi: ");
        tenTapChi = sc.nextLine();
        System.out.print("Nhap ngay xuat ban: ");
        ngayXuatBan = sc.nextLine();
        System.out.print("Nhap the loai: ");
        theLoai = sc.nextLine();
        System.out.print("Nhap gia tien: ");
        giaTien = sc.nextInt();
    }
    
    public void xuatThongTin() {
        System.out.println("Ma tap chi: " + maTapChi);
        System.out.println("The loai: " + theLoai);
        System.out.println("Ten tap chi: " + tenTapChi);
        System.out.println("Ngay xuat ban: " + ngayXuatBan);
        System.out.println("Gia tien: " + giaTien);
    } 
}
