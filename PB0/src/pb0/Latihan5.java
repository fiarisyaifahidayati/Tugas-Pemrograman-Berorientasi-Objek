/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pb0;

/**
 *
 * @author ACER
 */
import
java.util.Scanner;
public class Latihan5 {
    public static void main(String[]args){
        String nama;
        Scanner inputan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Masukkan Nama Lengkap Anda:");
        nama = inputan.next();
        System.out.println("Halo..."+nama+",Selamat Belajar Java");
    }
}
