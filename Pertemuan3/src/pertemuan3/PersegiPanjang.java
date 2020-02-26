
package pertemuan3;

public class PersegiPanjang {
    double panjang,lebar,kelilingPersegiPanjang,luasPersegiPanjang;

    PersegiPanjang(double p, double l) {
      this.panjang=p;
      this.lebar=l;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

   

    double kelilingPersegiPanjang() {
       kelilingPersegiPanjang = 2*(panjang+lebar);
       
       return kelilingPersegiPanjang;
    }

   

    double luasPersegiPanjang() {
       luasPersegiPanjang = panjang*lebar;
       return luasPersegiPanjang;
    }

  
    
    
}
