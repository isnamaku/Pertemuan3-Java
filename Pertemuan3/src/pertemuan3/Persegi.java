
package pertemuan3;

public class Persegi {
  double sisi1,luas,keliling;

 
    
  
    Persegi(double sisi) {
         this.sisi1=sisi;
        
    }

    double getPersegi (){
       return sisi1;
    }
    
    double hitungLuas (){
        luas=sisi1*sisi1;
        return luas;
        
    }

    public double getLuas() {
        return luas;
    }
    double keliling (){
        keliling = sisi1*4;
        return keliling;
    }

  
    
    
    
    
}
