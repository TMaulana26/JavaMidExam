package data;

public class Axioo extends Laptop {
    private int harga;

    public Axioo(String nama, String brand, String namaProsesor, String jmlProsesor, String OS, String RAM,
            String jenisStorage, int stok, int harga) {
        super(nama, brand, namaProsesor, jmlProsesor, OS, RAM, jenisStorage, stok);
        this.harga = harga;
        this.jenisStorage = jenisStorage;
    }

    public void print() {
        System.out.println("Jenis Storage           : "+ jenisStorage);
        System.out.println("Harga                   : Rp. " + harga);
    }
    
    public void storageType() {
        switch (jenisStorage) {
            case "SSD M.2":
            System.out.println("Storefront Position     : Best");
                break;
                
            case "SSD SATA":
            System.out.println("Storefront Position     : Good");
                break;

            case "HDD":
            System.out.println("Storefront Position     : Middle");
                break;
        
            default:
                break;
        }
    }

}
