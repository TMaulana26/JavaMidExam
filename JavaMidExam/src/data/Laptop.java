package data;

public class Laptop {
    String nama;
    String brand;
    String namaProsesor;
    String jmlProsesor;
    String OS;
    String RAM;
    String jenisStorage;
    int stok;

    public Laptop (String nama, String brand, String namaProsesor, String jmlProsesor, String OS, String RAM, String jenisStorage, int stok){
        this.nama = nama;
        this.brand = brand;
        this.namaProsesor = namaProsesor;
        this.jmlProsesor = jmlProsesor;
        this.OS = OS;
        this.RAM = RAM;
        this.jenisStorage = jenisStorage;
        this.stok = stok;
    }

    public void print() {
        System.out.println("\n");
        System.out.println("Nama                    : "+ nama);
        System.out.println("Brand                   : "+ brand);
        System.out.println("Nama Prosesor           : "+ namaProsesor);
        System.out.println("Jumlah Core Prosesor    : "+ jmlProsesor);
        System.out.println("Sistem Operasi          : "+ OS);
        System.out.println("Ukuran RAM              : "+ RAM +" GB");
        System.out.println("Stok                    : "+ stok);
    }
}
