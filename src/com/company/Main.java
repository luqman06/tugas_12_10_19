package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code her

        System.out.print("#####Luqman Rijalludien#####\n");
        tugas1();

        tugas2();


        tugas3();


    }

    public static void tugas1() {
        //t
        //sitem scaner
        System.out.print("#####Mencari Angka Ganjil#####\n");
        Scanner luq = new Scanner(System.in);
        System.out.printf("lobokno ongko sak jeleh mu =  ");
        int ongko = luq.nextInt();

        System.out.println("Angka ganjil");

        for (int x = 1; x <= ongko; x += 2) {
            System.out.print(" " + x);
        }
        System.out.println("\nAngka genap");
        for (int y = 2; y <= ongko; y += 2) {
            System.out.print(" " + y);

        }
    }

    public static void tugas2() {
        //mencari angka perbandingan
        System.out.print("\n\n#####Membandingkan Dua Angka#####\n");


        Scanner lr = new Scanner(System.in);
        System.out.print("lebokno ongko sek ke siji = ");
        int llh = lr.nextInt();

        Scanner lr2 = new Scanner(System.in);
        System.out.print("lebokno ongko sek ke loro = ");
        int llh2 = lr2.nextInt();

        System.out.println(llh);

        if (llh > llh2) {
            System.out.println("Imput nomer satu lebih besar");
        } else if (llh < llh2) {
            System.out.println("imput nomer dua lebih besar");

        } else if (llh == llh2) {
            System.out.println("dua nomer sama saja");
        }

    }

    public static void tugas3() {
        //mencari luas kerucut
        System.out.print("\n#####Menghitung volume kerucut#####\n");
        int phi1;
        double phi2;
        phi1 = 22 / 7;
        phi2 = 3.14;


        Scanner datar = new Scanner(System.in);
        System.out.print("masukan r kerucut = ");
        int r = datar.nextInt();

        Scanner datat = new Scanner(System.in);
        System.out.print("masukan tingi kerucut = ");
        int t = datat.nextInt();

        //double bill;
       // bill = r/7;

        //Scanner scan = new Scanner(System.in);
       // double bill = scan.nextDouble();
        double hasil,Hasil1,Hasil2,l;
        l = r/7;
        hasil = l%1;
        if (hasil>0||hasil<0){


            Hasil1 = r*r*t*phi1/3;
           // System.out.print("Mengunakan phi 22/7\n");
            System.out.print("Mengunakan phi 22/7\n"+Hasil1);

        }else {


            Hasil2 = r*r*t*phi2/3;
            //System.out.print("Mengunakan phi 3,14\n");
            System.out.print("Mengunakan phi 3,14\n"+Hasil2);
        }

    }
}

