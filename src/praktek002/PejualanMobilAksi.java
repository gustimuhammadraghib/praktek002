package praktek002;

public class PejualanMobilAksi {
    public static void main(String[] args) {
        PenjualanMobil r1 = new PenjualanMobil();
        
        r1.harga_mobil = 100000000;
        r1.jumlah_unit = 2;
        
        r1.cetakInfo();
        System.out.println("total   =   "+r1.hitungtotal());
    }
}
