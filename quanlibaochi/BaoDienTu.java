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
public class BaoDienTu extends BaoChi {
    private String url;
    private String nguoiViet;
    private String maBaoDienTu;
    private String tenBaoDienTu;

    public BaoDienTu() {
        super();
    }

    public BaoDienTu(String tenBaoDienTu , String url, String nguoiViet, String maBaoDienTu,String ngonNgu) {
        super(ngonNgu);
        this.url = url;
        this.nguoiViet = nguoiViet;
        this.maBaoDienTu = maBaoDienTu;
        this.tenBaoDienTu = tenBaoDienTu;
    }    

    public String getTenBaoDienTu() {
        return tenBaoDienTu;
    }

    public void setTenBaoDienTu(String tenBaoDienTu) {
        this.tenBaoDienTu = tenBaoDienTu;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String getNguoiViet() {
        return nguoiViet;
    }

    public void setNguoiViet(String nguoiViet) {
        this.nguoiViet = nguoiViet;
    }

    public String getMaBaoDienTu() {
        return maBaoDienTu;
    }

    public void setMaBaoDienTu(String maBaoDienTu) {
        this.maBaoDienTu = maBaoDienTu;
    }
    

    @Override
    public void nhap() {
        Scanner sc= new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap ma bao: ");
        maBaoDienTu = sc.nextLine();
        System.out.print("Nhap ten bao: ");
        tenBaoDienTu = sc.nextLine();
        System.out.print("Nhap url: ");
        url = sc.nextLine();
        System.out.print("Nhap ten nguoi viet: ");
        nguoiViet = sc.nextLine(); 
        
    }
    
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Ma bao dien tu: " + maBaoDienTu);
        System.out.println("Ten bao dien tu: " + tenBaoDienTu);
        System.out.println("Ten url: " + url);
        System.out.println("Ten nguoi viet: " + nguoiViet);
    }

}
