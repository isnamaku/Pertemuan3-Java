
package pertemuan3;

import java.util.Scanner;

public class Pertemuan3 {


    public static void main(String[] args) {
        int pilih;
        char jawab;
        Scanner a = new Scanner (System.in);
        do {
            System.out.println("Menu : ");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Volume");
            System.out.println("4. Luas Permukaan");
            System.out.print("Pilih : ");
            pilih = a.nextInt();
            System.out.println("");
       
       switch (pilih){
           case 1 :
               double luasPersegi,kelilingPersegi,s;
               System.out.println("Menu Persegi");
               System.out.print("Masukkan sisi : ");
               s=a.nextDouble();
               Persegi hitung = new Persegi(s);
               kelilingPersegi = hitung.keliling();
               luasPersegi = hitung.hitungLuas();
               System.out.println("Keliling Persegi :"+kelilingPersegi);
               System.out.println("Luas Persegi : "+luasPersegi);
               
              break;
              
       
       
       case 2 : 
           double p,l,luasPersegiPanjang,kelilingPersegiPanjang;
           
           System.out.println("Menu Persegi Panjang ");
           System.out.print("Panjang : ");
           p=a.nextDouble();
           System.out.print("lebar : ");
           l=a.nextDouble();
           PersegiPanjang hitung2 = new PersegiPanjang(p,l);
           kelilingPersegiPanjang = hitung2.kelilingPersegiPanjang();
           luasPersegiPanjang = hitung2.luasPersegiPanjang();
           System.out.println("Keliling Persegi Panjang : " + kelilingPersegiPanjang);
           System.out.println("Luas Persegi Panjang : "+luasPersegiPanjang);
           
       break;
       
       case 3 : 
           int pilih1;
           System.out.println("Menu Volume");
           System.out.println("1. Volume Kubus");
           System.out.println("2. Volume Balok");
           System.out.print("Pilih menu : ");
           pilih1=a.nextInt();
           
           if (pilih1==1){
               double sisi,volumeKubus;
               System.out.print("Masukkan sisi : ");
               sisi=a.nextDouble();
               Kubus kubus = new Kubus (sisi);
               volumeKubus = kubus.volumeKubus();
               System.out.println("Volume Kubus : "+volumeKubus);

           }else if (pilih1==2){
               double p1,l1,t,volumeBalok;
               System.out.print("Masukkan panjang Balok : ");
               p1=a.nextDouble();
               System.out.print("Masukkan lebar Balok : ");
               l1 = a.nextDouble();
               System.out.print("Masukkan tinggi Balok : ");
               t =a.nextDouble();
               Balok balok = new Balok(p1,l1,t);
               volumeBalok = balok.volumeBalok();
               System.out.println("Volume Balok : "+volumeBalok);
                
               
           }
           else {
               System.out.println("Tidak ada menu ");
           }
           
           
        break;
        
       case 4 :
            int pilih2;
           System.out.println("Menu Volume");
           System.out.println("1. Luas Permukaan Kubus");
           System.out.println("2. Luas Permukaan Balok");
           System.out.print("Pilih menu : ");
           pilih2=a.nextInt();
           
           if (pilih2==1){
               double sisi,luasPermukaan;
               System.out.print("Masukkan sisi : ");
               sisi=a.nextInt();
               Kubus kubus = new Kubus (sisi);
               luasPermukaan = kubus.luasPermukaanKubus();
               System.out.println("Luas Permukaan Kubus : "+luasPermukaan);
               
           }else if (pilih2==2){
                double p1,l1,t,luasPermukaanBalok;
               System.out.print("Masukkan panjang Balok : ");
               p1=a.nextDouble();
               System.out.print("Masukkan lebar Balok : ");
               l1 = a.nextDouble();
               System.out.print("Masukkan tinggi Balok : ");
               t =a.nextDouble();
               Balok balok = new Balok(p1,l1,t);
               luasPermukaanBalok = balok.luasPermukaanBalok();
               System.out.println("Luas Permukaan Balok : "+luasPermukaanBalok);
               
               
           }
           else {
               System.out.println("Tidak ada menu ");
           }
           break;
       }
            
            
            
            System.out.print("Balik ke menu (y/n)?");
            jawab=a.next().charAt(0);
            System.out.println("");
    }while (jawab!='n');
}
}
    

