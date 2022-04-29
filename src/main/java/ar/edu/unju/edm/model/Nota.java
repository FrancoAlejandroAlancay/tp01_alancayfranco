package ar.edu.unju.edm.model;
/*6.- Solicitar al usuario que ingrese de forma repetitiva un número entero por consola. Evalué el valor del
número y muestre los siguientes mensajes según el valor de número.
- Si el número es igual a 6 mostrar “Alumno regulariza”.
- Si el número es mayor o igual a 7 y menor o igual a 10, mostrar “El alumno promociona”.
- Si el número es menor a 6 pero mayor o igual a 1, mostrar “El alumno desaprueba”.
- Si el número es menor que 0, mostrar “valor no permitido” y finaliza el ingreso de datos.
Utilice una estructura de control iterativa while.
*/
public class Nota {
    int num;
    public void setNum(int num) {
      this.num = num;
    }
    public int getNum() {
      return num;
    }
    public String nota(){
      String resultado;
      if(num==6){
        resultado="Alumno regulariza";
      }else{
        if(num>=7 && num<=10){
          resultado="El alumno promociona";
        }else{
          if(num<6 && num>=1){
            resultado ="El alumno desaprueba";
          }else{
              resultado="valor no permitido";
          }
        }
      }
      return resultado;
    }
  
  }
  