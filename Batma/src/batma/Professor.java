
package batma;


public class Professor {
   private String nomeProf,materiaProf,Sigla;
    
    
 public String getNomeProf ()
             
 {
  return nomeProf;
 }
 public void setNomeProf (String nomeProf)
 {
  this.nomeProf = nomeProf;    
 }
 
     public String getmateriaProf ()            
       
 {
  return materiaProf;
 }
 public void setmateriaProf (String materiaProf)
 {
  this.materiaProf = materiaProf;    
  
 }
 public String getSigla ()
 {
  return Sigla;
 }
 public void setSigla(String Sigla)
 {
  this.Sigla = Sigla;    
 }

    void setMateriaProf(String filosofia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
