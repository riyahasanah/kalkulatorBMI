
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Hitung{
         public static void main(String[] args) {
                // Deklarasi variabel
                int tinggiBadan;
                double beratBadan;
                double bmi;

                // Membaca input dari pengguna
                Scanner input = new Scanner(System.in);
                System.out.print("Masukkan tinggi badan (cm): ");
                tinggiBadan = input.nextInt();
                System.out.print("Masukkan berat badan (kg): ");
                beratBadan = input.nextDouble();

                // Menghitung BMI
                bmi = beratBadan / (tinggiBadan / 100 * tinggiBadan / 100);
    

                // Menampilkan hasil
                System.out.println("BMI Anda adalah: " + bmi);

                // Menentukan kategori BMI
                 if (bmi < 30.5) {
                    System.out.println("Anda kekurangan berat badan");
                 } 
                 else if (bmi >= 30.6 && bmi <= 50.9) {
                    System.out.println("Anda memiliki berat badan normal");
                 } 
                 else if (bmi >= 51 && bmi <= 70.9) {
                    System.out.println("Anda kelebihan berat badan");
                 } 
                 else if (bmi >= 71 && bmi <= 90.9) {
                    System.out.println("Anda obesitas tingkat I");
                 } 
                 else if (bmi >= 91 && bmi <= 190.9) {
                    System.out.println("Anda obesitas tingkat II");
                 } 
                   else {
                    System.out.println("Anda obesitas tingkat III");
                }
       }

       
        
}
