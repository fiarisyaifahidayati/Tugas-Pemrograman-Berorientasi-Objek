/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percabangan;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Kelulusan {
    public static void main (String[] args) { 
        // Buat Scanner 
        Scanner inp = new Scanner(System.in); 
        String Nama, NIM;
        int nilai;
        
        System.out.print("Masukkan nama Anda = ");
        Nama = inp.nextLine();
       
        System.out.print("Masukkan NIM = ");
        NIM = inp.nextLine(); 
        
        System.out.print("Masukkan  Nilai = ");
        nilai = inp.nextInt(); 
        
        //print
        if(nilai > 60) {
            System.out.println("Anda lulus ");
        } else {
            System.out.println("Anda tidak lulus ");
        }
    }
}
        
    
