/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlibaochi;
import java.util.Comparator;

/**
 *
 * @author Redmi
 */
public class sapXep implements Comparator<DSTapChi> {
    @Override
    public int compare(DSTapChi tc1, DSTapChi tc2) {
        return tc1.getGiaTien()- tc2.getGiaTien();
    }
}
