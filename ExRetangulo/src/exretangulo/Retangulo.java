package exretangulo;
/**
 *
 * @author Andrey Dalosto
 */
public class Retangulo {
private double base, altura;
   
   public Retangulo ()
   {
       base=1;
               altura = 1;
   }
   
   public Retangulo (double base, double altura)
   {
       this.base = base;
               this.altura= altura;
   }
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void setAltura()
    {
      if (altura>=1 && altura<=20)
           this.altura= altura;
      else 
          this.altura=1;
  }
    public double calculaArea()
   {
    double area = altura*base;
    return area;
   }
   public double calculaPerimetro()
   {
       double perimetro = (altura*2) + (base*2);
       return perimetro;
   }
    
}