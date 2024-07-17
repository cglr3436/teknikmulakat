package com.example.teknik;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
     

 ArrayList<Siparis> siparisler = new ArrayList<Siparis>();
    siparisler.add(new Siparis(1000,2000, 12, 100.51d));
    siparisler.add(new Siparis(1000,2001, 31, 200d));
    siparisler.add(new Siparis(1000,2002, 22, 150.86));
    siparisler.add(new Siparis(1000,2003, 41, 250d));
    siparisler.add(new Siparis(1000,2004, 55, 244d));

    siparisler.add(new Siparis(1001,2001, 88, 44.531d));
    siparisler.add(new Siparis(1001,2002, 121, 88.11d));
    siparisler.add(new Siparis(1001,2004, 74, 221d));
    siparisler.add(new Siparis(1001,2002, 14, 88.11d));

    siparisler.add(new Siparis(1002,2003, 2, 12.1d));
    siparisler.add(new Siparis(1002,2004, 3, 22.3d));
    siparisler.add(new Siparis(1002,2003, 8, 12.1d));
    siparisler.add(new Siparis(1002,2002, 16, 94d));
    siparisler.add(new Siparis(1002,2005, 9, 44.1d));
    siparisler.add(new Siparis(1002,2006, 19, 90d));

   
    Double sum= 0d;
    Integer adet=0;

    HashSet<Integer> malNumarasilari = new HashSet<Integer>();
     
    for (Siparis siparis : siparisler) {
        malNumarasilari.add(siparis.getMalNumarasi());
        sum+=siparis.toplamHesapla();
        adet+=siparis.getMiktar();
    }


    System.out.println("-----------------------------------------------------------------");
    System.out.println("Tüm malların toplam tutarı : "+String.format("%.2f", sum));  
    
    System.out.println("-----------------------------------------------------------------");
    System.out.println("Tüm malların ortalaması : "+String.format("%.2f", sum/adet));  
    System.out.println("-----------------------------------------------------------------");
    for (Integer malId : malNumarasilari) {
         sum= 0d;

         adet=0;
        for (Siparis siparis : siparisler) {
            malNumarasilari.add(siparis.getMalNumarasi());

            if(siparis.getMalNumarasi()==malId){
                sum+=siparis.toplamHesapla();
                adet+=siparis.getMiktar();
            }
            
        }
        System.out.println(" "+ malId +" nolu Malın ortalama degeri : "+String.format("%.2f", sum/adet));  
    }
    System.out.println("-----------------------------------------------------------------");

HashMap<String, Integer> malzemeyeGoreSiparisler = new HashMap<String, Integer>();

        for (Siparis siparis : siparisler) {
 
                if(siparis.getMiktar()>0){

                String malIdAndSiparisId=new String(siparis.getMalNumarasi() +" nolu Mal "+siparis.getSiparisid()+" numarılı sipariste");
                
                if(malzemeyeGoreSiparisler.containsKey(malIdAndSiparisId))
                {
                    Integer malAdeti=malzemeyeGoreSiparisler.get(malIdAndSiparisId);
                    malAdeti+= siparis.getMiktar();
                    malzemeyeGoreSiparisler.put(malIdAndSiparisId, malAdeti);
                }else{
                    malzemeyeGoreSiparisler.put(malIdAndSiparisId, siparis.getMiktar());
                }
                }
            }

    for (String i : malzemeyeGoreSiparisler.keySet()) {
        System.out.println(" " + i + " : " + malzemeyeGoreSiparisler.get(i) +" adet");
      }
      

     
}
}