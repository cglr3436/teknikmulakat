package com.example.teknik;

public class Siparis {
   private Integer siparisid;
   private Integer malNumarasi;
   private Integer miktar;
   private Double birimFiyat;


   public Siparis(Integer siparisid, Integer malNumarasi, Integer miktar, Double birimFiyat) {
      this.siparisid = siparisid;
      this.malNumarasi = malNumarasi;
      this.miktar = miktar;
      this.birimFiyat = birimFiyat;
   }

   public Double toplamHesapla(){
      return birimFiyat*Double.valueOf(miktar);
   }

   public Integer getSiparisid() {
      return siparisid;
   }
   public void setSiparisid(Integer siparisid) {
      this.siparisid = siparisid;
   }
   public Integer getMalNumarasi() {
      return malNumarasi;
   }
   public void setMalNumarasi(Integer malNumarasi) {
      this.malNumarasi = malNumarasi;
   }
   public Integer getMiktar() {
      return miktar;
   }
   public void setMiktar(Integer miktar) {
      this.miktar = miktar;
   }
   public Double getBirimFiyat() {
      return birimFiyat;
   }
   public void setBirimFiyat(Double birimFiyat) {
      this.birimFiyat = birimFiyat;
   }
}
