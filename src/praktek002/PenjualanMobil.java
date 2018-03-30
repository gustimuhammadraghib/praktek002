package praktek002;
        
 public class PenjualanMobil {
int harga_mobil;
int jumlah_unit;

    public PenjualanMobil() {
     harga_mobil=70000000;
     jumlah_unit=2;
     
    }
    public PenjualanMobil(int harga_mobil, int jumlah_unit){
        this.harga_mobil = harga_mobil;
        this.jumlah_unit = jumlah_unit;
    }
    
 void tampildata(){
    System.out.println("================================");
    System.out.println("harga_mobil     :"+harga_mobil);
    System.out.println("jumlah_unit     :"+jumlah_unit);
    System.out.println("================================");
 }
    Integer hitungPembelian(){
            int total;
            total=harga_mobil*jumlah_unit;
            return total;
            
    }
    void cetaktotal(){
        System.out.println("Totalnya    = "+hitungPembelian());
    }
 }
