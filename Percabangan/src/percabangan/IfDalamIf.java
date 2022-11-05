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
public class IfDalamIf {
    public static void main(String[] args) {
        String jurusan;
        Float nilai;
        Scanner input = new Scanner(System.in);
  
        System.out.print ("Masukkan jurusan IPA/IPS = ");
        jurusan = input.nextLine ();
        
        System.out.print ("Masukkan nilai = ");
        nilai = input.nextFloat ();
    
        if("IPA".equals (jurusan) ) {
                if(nilai >= 8.5) {
                System.out.println("Anda lulus ");
            } else {
                System.out.println("Anda tidak lulus ");
            }
            
        } else if("IPS".equals (jurusan)) { 
            if(nilai >= 7.5) {
                System.out.println("Anda lulus ");
            } else {
            System.out.println("Anda tidak lulus ");
        }

        }
    }  
}