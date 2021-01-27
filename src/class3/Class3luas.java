/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class3;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Class3luas {
    static void hitung(){
        //membuat scanner
        Scanner input = new Scanner(System.in);
        //membuat perulangan pilihan user
        boolean b = true;
        while(b){
        System.out.println("1. Segitiga");
        System.out.println("2. Persegi");
        System.out.println("3. Persegi Panjang");
        
        //user memasukkan pilihan
        System.out.print("Masukkan Pilihan Anda : ");
        int pilihan = input.nextInt();
        System.out.println("");
        //percabangan 
        switch(pilihan){
        //jika user memasukkan angka 1 maka program pada case 1 yang akan dijalankan
        case 1 :
            System.out.println("Anda Memilih Menghitung Luas Segitiga");
            System.out.print("Masukkan Alas     : ");
            double a = input.nextDouble();
            System.out.print("Masukkan Tinggi   : ");
            double t = input.nextDouble();
            double luas1 = a*t/2;
            System.out.println("Luas Segitiga   : "+luas1);
            break;
        //jika user memasukkan angka 2 maka program pada case 2 yang akan dijalankan
        case 2 :
            System.out.println("Anda Memilih Menghitung Luas Persegi");
            System.out.print("Masukkan Sisi     : ");
            int s = input.nextInt();
            int luas2 = s*s;
            System.out.println("Luas Persegi    : "+luas2);
            break;
        //jika user memasukkan angka 3 maka program pada case 3 yang akan dijalankan
        case 3 :
            System.out.println("Anda Memilih Menghitung Luas Persegi Panjang");
            System.out.print("Masukkan Panjang          : ");
            int p = input.nextInt();
            System.out.print("Masukkan Lebar            : ");
            int l = input.nextInt();
            int luas3 = p*l;
            System.out.println("Luas Persegi Panjang    : "+luas3);
            break;
        default: //jika user tidak memasukkan angka 1-3 maka akan muncul kata dibawah ini
            System.out.println("Angka yang Anda Masukkan Salah");
    }
            System.out.println("");
        //perulangan
        System.out.println("Apakah Anda ingin Menghitung Luas Bangun Lagi? (ya/tidak)");
        String jawab = input.next();
        if (jawab.equalsIgnoreCase("ya")){
            b = true;//jika user memasukkan kata ya, maka program akan mengulangi/kembali ke pemilihan bangun
        }else if (jawab.equalsIgnoreCase("tidak")){
            b = false;//jika user memasukkan kata tidak, maka program akan selesai
        }
            System.out.println("");
            System.out.println("========================================================");
            System.out.println("");
    } 
}
    //membuat method static yang digunakan untuk membuat judul program
    static void judul(){
            System.out.println("<<<             Menghitung luas bangun              >>>");
            System.out.println("Silahkan pilih bangun yang akan di hitung luasnya : ");
            System.out.println("");
    }
}
