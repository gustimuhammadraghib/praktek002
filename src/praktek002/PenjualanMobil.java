package praktek002;

 class PenjualanMobil {
Integer harga_mobil;
Integer jumlah_unit;

    public PenjualanMobil() {
     harga_mobil=70000000;
     jumlah_unit=2;
     
    }


 void cetakInfo(){
    System.out.println("================================");
    System.out.println("harga_mobil     :"+harga_mobil);
    System.out.println("jumlah_unit     :"+jumlah_unit);
    System.out.println("================================");
 }
    Integer hitungtotal () {
            Integer total;
            total=harga_mobil*jumlah_unit;
            return total;
            
    }
    void cetaktotal(){
        System.out.println("Totalnya Adalah    = "+hitungtotal());
    }
 }
