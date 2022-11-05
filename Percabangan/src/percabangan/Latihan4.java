/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percabangan;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class Latihan4 {
    public static void main (String [] args) {
      int nilai1, nilai2, nilai3;
      Scanner inputan = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println ("masukkan 3 angka");
        System.out.print("masukkan nilai1= ");
        nilai1=inputan.nextInt();
        System.out.print("masukkan nilai2= ");
        nilai2=inputan.nextInt();
        System.out.print("masukkan nilai3= ");
        nilai3=inputan.nextInt();
        
        System.out.println ("kesimpulan");
        
        if ((nilai1 > nilai2) && (nilai1 > nilai3)) {
             System.out.println ("Nilai1 terbesar");}
        if ((nilai2 > nilai1) && (nilai2 > nilai3)) {
            System.out.println ("Nilai2 terbesar");}
        if ((nilai3 > nilai1) && (nilai3 > nilai1)) {
            System.out.println ("Nilai3 terbesar");}
    }
}

