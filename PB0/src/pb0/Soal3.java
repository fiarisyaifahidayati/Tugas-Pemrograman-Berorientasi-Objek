/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pb0;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class Soal3 {
    public static void main(String[]args){
        String Nama;
        String NIM;
        String Semester;
        String Kelas;
        
        Scanner input= new Scanner (System.in).useDelimiter("\n");
        System.out.print("Masukkan Nama = ");
        Nama = input.nextLine();
        System.out.print("Masukkan NIM = ");
        NIM = input.nextLine();
        System.out.print("Masukkan Semester = ");
        Semester = input.nextLine();
        System.out.print("Masukkan Kelas = ");
        Kelas = input.nextLine();
        
        System.out.println("Nama = "+Nama);
        System.out.println("NIM = "+NIM);
        System.out.println("Semester = "+Semester);
        System.out.println("Kelas = "+Kelas);
    }
}