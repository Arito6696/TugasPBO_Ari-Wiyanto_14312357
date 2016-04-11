/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arito
 */
public class Class1 {
    String NPM;
    String Nama;
   
    
    public String getNPM() {
        return NPM;
    }

    public void setNPM(String NPM) {
        this.NPM = NPM;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    
    public void tampildata(){
        System.out.println("NPM  : "+getNPM());
        System.out.println("Nama : "+getNama());
    }  
    public void inputdata(String NP, String NM)
            {
                setNPM(NP);
                setNama(NM);
          
            }

   
    
    
            
    
    
    
}
