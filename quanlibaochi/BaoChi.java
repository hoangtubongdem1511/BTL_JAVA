/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlibaochi;

import java.util.Scanner;

/**
 *
 * @author Redmi
 */
public class BaoChi {
    private String ngonNgu;
    
    public BaoChi() {
        
    }

    public BaoChi(String ngonNgu) {
        this.ngonNgu = ngonNgu;
    }


    public String getNgonNgu() {
        return ngonNgu;
    }
    

    public void setNgonNgu(String ngonNgu) {
        this.ngonNgu = ngonNgu;
    }
    
    public void nhap() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap ngon ngu: ");
        ngonNgu= sc.nextLine();
    }
    
    public void xuat() {
        System.out.println("Ngon ngu: " + getNgonNgu());
    }
}
