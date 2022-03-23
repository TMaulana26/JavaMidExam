package data;

public class Dell extends Laptop{
    private int VRAM;

    public Dell(String nama, String brand, String namaProsesor, String jmlProsesor, String OS, String RAM,
            String jenisStorage, int stok, int VRAM) {
        super(nama, brand, namaProsesor, jmlProsesor, OS, RAM, jenisStorage, stok);
        this.VRAM = VRAM;
    }

    public void print() {
        if (VRAM < 0) {
            System.out.println("VRAM tidak bisa bernilai negatif");
        } else {
            System.out.println("VRAM                    : "+ VRAM +" GB");
        }

    }
    
}
