package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

/*4.- Solicite al usuario de forma repetitiva que ingrese un número de tipo entero y verifique si
corresponde a algún mes del año. Si el número no corresponde a ningún mes, muestre un
mensaje “no existe ese mes” y finaliza el ingreso de datos. Utilice la estructura de control de
selección use la estructura de control if.
*/
@Component
public class Mes {
  int num;
  public void setNum(int num) {
    this.num = num;
  }
  public int getNum() {
    return num;
  }
  public String ME(){
    String aux;
    if(num==1){
      aux="Enero";
    }else{
      if(num==2){
        aux="Febrero";
      }else{
        if(num==3){
          aux="Marzo";
        }else{
          if(num==4){
            aux="Abril";
          }else{
            if(num==5){
              aux="Mayo";
            }else{
              if(num==6){
                aux="Junio";
              }else{
                if(num==7){
                  aux="Julio";
                }else{
                  if(num==8){
                    aux="Agosto";
                  }else{
                    if(num==9){
                      aux="Septiembre";
                    }else{
                      if(num==10){
                        aux="Octubre";
                      }else{
                        if(num==11){
                          aux="Noviembre";
                        }else{
                          if(num==12){
                            aux="Diciembre";
                          }else{
                            aux="No existe ese mes";
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return aux;
  }
}
