/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alfi NurizkyaNama  : ALFI NURIZKYA
 * Kelas : IF-1
 * NIM   : 10119036
 * Deskripsi Program : Program Menentukan Perbandingan Dua Buah Nilai
 */

import java.util.Scanner;

public class IF110119036Latihan24 {

    /**
     * @param args the command line arguments
     */
    static final Scanner scan = new Scanner(System.in);
    int nilai1, nilai2;

    private void masukkanNilai(){
        System.out.println("=======Progaram Perbandingan Nilai=======");
        System.out.print("Masukkan nilai pertama : ");
        nilai1 = scan.nextInt();
        System.out.print("Masukkan nilai kedua : ");
        nilai2 = scan.nextInt();
    }

    private String perbandinganNilai(){
        return (nilai1 < nilai2) ? nilai1+" lebih kecil dari "+nilai2 :
                (nilai1 > nilai2) ? nilai1+" lebih besar dari "+nilai2 :
                        nilai1+" sama dengan "+nilai2;
    }

    private void ulangPerbandingan(){
        System.out.print("\nUlangi Aktifitas ? (Ya/Tidak) : ");
        if(scan.next().equals("Ya")){
            System.out.print("\n");
            startMethod();
        }
    }

    private void tampilPerbandingan(String hasil){
        System.out.println("\nHasil : "+hasil);
    }

    private void startMethod(){
        masukkanNilai();
        tampilPerbandingan(perbandinganNilai());
        ulangPerbandingan();
    }

    public static void main(String[] args) {
	    IF110119036Latihan24 data = new IF110119036Latihan24();
            data.startMethod();
	    System.out.println("Developed by : Alfi Nurizkya");
    }
}