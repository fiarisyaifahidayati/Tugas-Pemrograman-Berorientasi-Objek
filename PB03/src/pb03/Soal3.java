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
public class Soal3 {
    public static void main(String[] args) {
        int Luas, Keliling, sisi;
        Scanner scan = new Scanner (System.in).useDelimiter("\n");
        
        System.out.println ("Pilih Metode:");
        System.out.println ("1.Menghitung Luas Persegi");
        System.out.println ("2.Menghitung Keliling Persegi");
        System.out.println ("Pilihan : ");
        
        char pilih = scan.next().charAt(0);
        
        switch (pilih){
        case '1':
            System.out.println ("Masukkan panjang sisi persegi = ");
            sisi = scan.nextInt();
            Luas = sisi * sisi;
            System.out.println ("Luas persegi adalah = " + Luas);
            break;
        case '2':
            System.out.println ("Masukkan panjang sisi persegi = ");
            sisi = scan.nextInt();
            Keliling = 4 * sisi;
            System.out.println ("Keliling persegi adalah = " + Keliling);
            break;
        case '3':
            System.out.println ("Sistem Eror");
        }
    }
}

