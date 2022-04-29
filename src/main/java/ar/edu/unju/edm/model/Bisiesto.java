package ar.edu.unju.edm.model;
import org.springframework.stereotype.Component;

/*2.- Solicitar al usuario que ingrese por consola un año, ejemplo: 2010. Determinar si ese año
es un año bisiesto. Mostrar el mensaje por consola indicando si es o no un año bisiesto.
Un año es bisiesto cuando en vez de tener 365 días, tiene 366 que es cuando el mes
de Febrero tiene 29 días.
Podemos utilizar la siguiente regla para determinar si un año es bisiesto o no, debe de cumplir una serie de
condiciones: 
El año debe ser divisible por 4, pero no divisible por 100, o el año debe ser divisible por 400. Si cumple estas
condiciones el año es bisiesto.*/
@Component
public class Bisiesto {
  int anio;
  public void setanio(int anio) {
    this.anio = anio;
  }
  public int getanio() {
    return anio;
  }
  public String Bi(){
    String bisi="";
    if(((anio%4==0) || (anio%400==0)) && (anio%100!=0)){
      bisi="Si es Bisiesto";
    }else{
      bisi="No es bisiesto";
    }
    return bisi;
  }
}