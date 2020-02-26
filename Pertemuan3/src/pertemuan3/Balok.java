
package pertemuan3;


public class Balok extends PersegiPanjang {
double tinggi,volumeBalok,luasPermukaanBalok;
    Balok(double p1, double l1, double t) {
       super(p1,l1);
       this.tinggi = t;
    }

    double volumeBalok() {
        volumeBalok = super.luasPersegiPanjang()*tinggi;
    return volumeBalok;
        
    }
    
    double luasPermukaanBalok (){
        luasPermukaanBalok = 2*(super.getLebar()*super.getPanjang() + super.getPanjang()*tinggi + super.getLebar()*tinggi);
        return luasPermukaanBalok;
        
    }
    
       
    }

    

