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
public class Latihan4 {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in).useDelimiter("\n");
        System.out.println ("Apakah Anda mahasiswa ITS Mandiri Fiari Syaifa Hidayati? (Ya, Jika setuju)");
        
        String jawaban = scan.next();
        
        if ("Ya".equals (jawaban)){
            System.out.println ("Selamat Berjuang di ITS Mandiri Fiari Syaifa Hidayati");
        }else{
            System.out.println ("Selamat Datang di ITS Mandiri Fiari Syaifa Hidayati");
        }    
    }
}
