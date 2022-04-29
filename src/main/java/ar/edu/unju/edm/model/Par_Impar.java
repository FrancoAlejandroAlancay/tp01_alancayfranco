package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

/*3.- Solicitar al usuario que ingrese 5 números enteros. Por cada número ingresado mostrar por consola si es
un número par. Utilice alguna estructura de control repetitiva para ingresar los datos.
Recordemos que para establecer si un número es par, el resto de la división de dicho número entre 2 tiene
que dar cero.
*/
@Component
public class Par_Impar {
  int num;
  public void setNum(int num) {
    this.num = num;
  }
  public int getNum() {
    return num;
  }
  public String par(){
    String resultado;
    if(num%2==0){
      resultado="es par";
    }else{
      resultado="es impar";
    }
    return resultado;
  }

}