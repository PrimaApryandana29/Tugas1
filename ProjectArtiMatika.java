/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectartimatika;

/**
 *
 * @author PC-A-30
 */
public class ProjectArtiMatika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    AritMatika AM = new AritMatika();
    
    AM.tambah (3,5);
    
    System.out.println ("Hasil Penjumlahan : "+AM.getHasil());
    }
    
}
