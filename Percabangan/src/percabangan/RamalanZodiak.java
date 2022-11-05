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
public class RamalanZodiak {
    public static void main(String[] args) { 
        int kode;
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Masukkan nomor kode = ");
        kode = input.nextInt();

        System.out.println("Masukkan Tanggal = ");
        kode = input.nextInt();
        
        switch(kode) {
        case 1:
        System.out.println("Aquarius"); break; 
        case 2:
        System.out.println("Pisces"); break; 
        case 3:
        System.out.println("Aries"); break;
        case 4:
        System.out.println("Taurus"); break;
        case 5:
        System.out.println("Gemini"); break;
        case 6:
        System.out.println("Cencer"); break;
        case 7:
        System.out.println("Leo"); break;
        case 8:
        System.out.println("Virgo"); break;
        case 9:
        System.out.println("Libra"); break;
        case 10:
        System.out.println("Scorpio"); break;
        case 11:
        System.out.println("Sagitarius"); break;
        case 12:
        System.out.println("Capricon"); break;
        default:
            System.out.println ("Sistem Eror");
}
    }
}
