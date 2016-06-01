
package primerproyecto;
/**
 * 
 * @author Axel
 */

public class Numero {
    int num;
  
  boolean correcto() {
      return (num >=0 && num <=99);
  }//Final meotod correcto
  
    String dameNumero(int n) {
        switch(n) {
            case 0:
                return "cero";
            case 1:
                return "uno";
            case 2:
                return "dos";
            case 3:
                return "tres";
            case 4:
                return "cuatro";
            case 5:
                return "cinco";
            case 6:
                return "seis";
            case 7:
                return "siete";
            case 8:
                return "ocho";
            case 9:
                return "nueve";
            case 10:
                return "diez";
            case 11:
                return "once";
            case 12:
                return "doce";
            case 13:
                return "trece";
            case 14:
                return "catorce";
            case 15:
                return "quince";
            case 30:
                return "treinta";
            default:
              return "";
        }//Final switch   
    }//Final metodo dameNumero      

    String numeroCompuesto(int num) {
        String cad;
        int decenas, unidades;
        decenas  = num / 10;
        unidades = num % 10;
        if (decenas > 2) {
            cad = dameNumero(decenas*10) + " y ";
        }else {
            if (decenas == 1) {
                cad="dieci";
            }else {
                cad="veinti";
                }//else2
        }//else1 
        cad +=(unidades);
        return cad;
    }//Final metodo numeroCompuesto
  
    void muestraFin(int n) {
      System.out.println("\n\t\tEl Numero " + n + "Es: " + dameNumero(n));
    }//Final metodo muestraFin
    
    /*
    public String escribirNumero(int n){
        int num = 0;
        int unidades = num%10;
        int decenas = num/10;
        
        switch(decenas){
            case 1:
                System.out.println("dieci");
                break;
            case 2:
                System.out.println("veinti");
                break;
            case 3:
                System.out.println("treinta");
                break;

                    
            
                
        }//Primer Switch
        
        switch(unidades){
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("dos");
                break;    
            case 3:
                System.out.println("tres");
                break;
            case 4:
                System.out.println("cuatro");
                break;
            case 5:
                System.out.println("cinco");
                break;
            case 6:
                System.out.println("seis");
                break;
            case 7:
                System.out.println("siete");
                break;
            case 8:
                System.out.println("ocho");
                break;
            case 9:
                System.out.println("nueve");
                break;
   
        }//Segundo Switch
        
   
        
    }*/
}
