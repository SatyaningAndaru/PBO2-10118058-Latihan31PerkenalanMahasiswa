/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan31perkenalanmahasiswa;

/**
 *
 * @author user
 */
public class PBO210118058Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     * Nama : Satyaning Andaru Bawalaksana
     * NIM : 10118058
     * Kelas : IF-2
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa n = new Mahasiswa();
        n.nim="10110269";
        n.nama="RIzki Adam Kurniawan";
        n.perkenalanDiri(n.nim,n.nama) ;
        
         Mahasiswa n2 = new Mahasiswa();
        n2.nim="10110270";
        n2.nama="Indra Tiola";
        n2.perkenalanDiri(n2.nim,n2.nama) ;
        
        Mahasiswa n3 = new Mahasiswa();
        n3.nim="10110271";
        n3.nama="Tanzil Ganefi";
        n3.perkenalanDiri(n3.nim,n3.nama) ;
        
        Mahasiswa n4 = new Mahasiswa();
        n4.nim="10110272";
        n4.nama="Nur Awaludin";
        n4.perkenalanDiri(n4.nim,n4.nama) ;
        
        
    }
    
}
