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
public class test {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int chon;
        QuanLi ql = new QuanLi();
        BaoChi bg = new BaoGiay();
        BaoDienTu bdt = new BaoDienTu();
        TapChi tc = new TapChi();

        do {
        ql.menuChinh();
        System.out.print("Lua chon: ");
        chon = sc.nextInt();
        switch (chon) 
        {
            case 1 -> 
            {
                bg.nhap();
                break;
            }
            case 2 -> 
            {
                bdt.nhap();
                break;
            }
            case 3 ->
            {
                tc.nhap();
                break;
            }
            case 4 ->
            {
                bg.xuat();
                break;
            }
            case 5 ->
            {
                bdt.xuat();
                break;
            }
            case 6 ->
            {
                tc.xuat();
                break;
            }
            case 7 ->
            {
                ql.menuSuaDoi();
                tc.SuaDoi();
                break;
            }
            case 8 ->
            {
                tc.SapXepTheoGiaTien();
                break;
            }
            case 9 ->
            {
                tc.thongKeGiaTien();
                break;
            }
            default -> {
                break;
            }
        }
        } while (chon != 0);
    }
}   
    
