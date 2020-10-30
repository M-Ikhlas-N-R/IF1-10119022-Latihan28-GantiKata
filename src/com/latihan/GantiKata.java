package com.latihan;

// mengimpor Scanner ke program
import java.util.Scanner;

/*
 * @author
 * Nama              : M Ikhlas N R
 * Kelas             : IF-1
 * NIM               : 10119022
 * Deskripsi Program : Program Ganti Kata latihan 28
 *
 */

public class GantiKata {
    public static void main(String[] args) {
        // Deklarasi Variabel
        String kalimat, gantiKata, menjadiKata, kalimatBaru;

        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        // Memasukkan data
        System.out.print("Masukkan Kalimat : ");
        kalimat = keyboard.nextLine();

        System.out.print("Ganti Kata : ");
        gantiKata = keyboard.nextLine();

        System.out.print("Menjadi Kata : ");
        menjadiKata = keyboard.nextLine();

        kalimatBaru = kalimat.replace(gantiKata, menjadiKata);
        // Menampilkan kata yang sudah dirubah dan yang sebelum dirubah
        System.out.println("====Hasil Formatting====");
        System.out.println("Kalimat awal : " + kalimat);
        System.out.println("Kalimat baru : " + kalimatBaru);

    }
}
