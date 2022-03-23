package application;

import java.util.Scanner;

import data.Axioo;
import data.Dell;
import data.Laptop;

public class Application {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        
        System.out.println("Masukan Informasi PC");
        System.out.print("Nama                    : ");
        String a = input.nextLine();
        System.out.print("Brand                   : ");
        String b = input.nextLine();
        System.out.print("Nama Prosesor           : ");
        String c = input.nextLine();
        System.out.print("Jumlah Core Prosesor    : ");
        String d = input.nextLine();
        System.out.print("Sistem Operasi          : ");
        String e = input.nextLine();
        System.out.print("Ukuran RAM              : ");
        String f = input.nextLine();
        System.out.print("Jenis Storage           : ");
        String g = input.nextLine();
        System.out.print("Stok                    : ");
        int h = input.nextInt();
        System.out.print("Harga                   : ");
        int i = input.nextInt();
        System.out.print("VRAM                    : ");
        int j = input.nextInt();
        input.close();

        var lpt1 = new Laptop(a, b, c, d, e, f, g, h);
        var lpt2 = new Dell(a, b, c, d, e, f, g, h, j);
        var lpt3 = new Axioo(a, b, c, d, e, f, g, h, i);
        lpt1.print();
        lpt2.print();
        lpt3.print();
        lpt3.storageType();
    }
}
