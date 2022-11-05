/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pb03;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Soal2 {
    public static void main(String[] args) { 
        int angka;
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Masukkan Bulan(angka)= ");
        angka = scan.nextInt();
       
        switch(angka) {
        case 1:
        System.out.println("Januari"); break; 
        case 2:
        System.out.println("Februari"); break; 
        case 3:
        System.out.println("Maret"); break;
        case 4:
        System.out.println("April"); break;
        case 5:
        System.out.println("Mei"); break;
        case 6:
        System.out.println("Juni"); break;
        case 7:
        System.out.println("Juli"); break;
        case 8:
        System.out.println("Agustus"); break;
        case 9:
        System.out.println("September"); break;
        case 10:
        System.out.println("Oktober"); break;
        case 11:
        System.out.println("November"); break;
        case 12:
        System.out.println("Desember"); break;
        case 13:
        System.out.println("Sistem Eror"); break;
        default:
            System.out.println ("Sistem Eror");
        }
    }
}

