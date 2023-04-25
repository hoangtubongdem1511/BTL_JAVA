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
public class BaoGiay extends BaoChi {
    private String maBaoGiay;
    private String nhaXuatBan;
    private String tenBaoGiay;
    private int soTrang;
    
    public BaoGiay() {
        super();
    }

    public BaoGiay(String maBaoGiay, String nhaXuatBan, String tenBaoGiay, int soTrang, String ngonNgu) {
        super(ngonNgu);
        this.maBaoGiay = maBaoGiay;
        this.nhaXuatBan = nhaXuatBan;
        this.tenBaoGiay = tenBaoGiay;
        this.soTrang = soTrang;
    }    

    public String getTenBaoGiay() {
        return tenBaoGiay;
    }

    public void setTenBaoGiay(String tenBaoGiay) {
        this.tenBaoGiay = tenBaoGiay;
    }
    
    public void setMaBaoGiay(String maBaoGiay) {
        this.maBaoGiay = maBaoGiay;
    }

    public String getMaBaoGiay() {
        return maBaoGiay;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    

    @Override
    public void nhap() {
        Scanner sc= new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap ma bao: ");
        maBaoGiay = sc.nextLine();
        System.out.print("Nhap ten bao: ");
        tenBaoGiay = sc.nextLine();
        System.out.print("Nhap ten nha xuat ban: ");
        nhaXuatBan = sc.nextLine();
        System.out.print("Nhap so trang: ");
        soTrang = sc.nextInt();        
    }
    
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Ma bao giay: " + maBaoGiay);
        System.out.println("Ten bao giay: " + tenBaoGiay);
        System.out.println("Ten nha xuat ban: " + nhaXuatBan);
        System.out.println("So trang: " + soTrang);
    }
}

