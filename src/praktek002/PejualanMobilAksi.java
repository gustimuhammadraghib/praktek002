package praktek002;

public class PejualanMobilAksi {
    public static void main(String[] args) {
        PenjualanMobil r1 = new PenjualanMobil();
        
        r1.harga_mobil = 100000000;
        r1.jumlah_unit = 2;
        
        r1.tampildata();
        System.out.println("total   =   "+r1.hitungPembelian());
        r1.cetaktotal();
        
        PenjualanMobil r2 = new PenjualanMobil();
        r2.tampildata();
        r2.cetaktotal();
        
        PenjualanMobil r3 = new PenjualanMobil(50000000,2);
        r3.tampildata();
        r3.cetaktotal();
        
    }
}
