package com.prodemy.h2;

import java.util.Scanner;

public class BacaInput {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Nama  : ");
        String nama = scan.nextLine();
        System.out.printf("Selamat Datang " + nama);
    }
}
