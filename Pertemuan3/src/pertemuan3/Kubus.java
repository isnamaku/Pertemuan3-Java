
package pertemuan3;


public class Kubus extends Persegi {
    double volumeKubus,luasPermukaanKubus;
    
    
    
    public Kubus(double sisi) {
        super(sisi); 
    }
    


    double volumeKubus() {
        volumeKubus = super.getPersegi()*super.hitungLuas();
        return volumeKubus;
        
    }
    
    double luasPermukaanKubus (){
        luasPermukaanKubus = super.hitungLuas()*6;
        return luasPermukaanKubus;
        
    }
    

   
    
  
    
}
