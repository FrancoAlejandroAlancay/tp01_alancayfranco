package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

/*
Declare una clase denominada Principal que contenga el método main(), dentro de main() declare las
variables necesarias para realizar el cálculo del factorial de un número que se introduce por consola y está
dentro del rango numérico [0,10]. Utilice una estructura de control iterativa para resolver el ejercicio.
Muestre el resultado por consola.
El factorial de un número entero (n!) se calcula de la siguiente forma:
numero! = numero *(numero-1)*(numero-2)...1
0! = 1 (por definición)
1! = 1
2! = 2 * 1 = 2
3! = 3 * 2 * 1 = 6
4! = 4 * 3 * 2 * 1 = 24
*/
@Component
public class Principal {
  int num;
  public void setNum(int num) {
    this.num = num;
  }
  public int getNum() {
    return num;
  }
  public int main(){
    int fact=1;
    while(num!=0){
      fact=fact*num;
      num--;
    }
    return fact;
  }

}
