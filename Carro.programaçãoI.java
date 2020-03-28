package aula20200327.carro;

public class Carro  {
   private double combustivelNoTanqueEmLitros = 0.00 ;
   private boolean ligado = false;
   
   public void carro () {
	   if (combustivelNoTanqueEmLitros < 0.250) { 
        ligado = false;  
   
	   }
   }
   public void abastecer (double volumeEmLitros) { 
      combustivelNoTanqueEmLitros += volumeEmLitros;
	  
   }
   public void ligar () {
	  combustivelNoTanqueEmLitros = 0.250;
	  this.ligado = true;
	 
   }
   public void desligar () { 
	   if (combustivelNoTanqueEmLitros >= 0.250) { 
	     this.ligado = false;
	   }
   }   
   public void acelerar () {
	   if(combustivelNoTanqueEmLitros > 0.250) {
		   combustivelNoTanqueEmLitros -=0.250;   
	   }else 
	          this.ligado = false;
   }	   
   public boolean isLigado() {
     return true; 
   
   }
   public boolean isDesligado() { 
      return false;
	   
   }


}
