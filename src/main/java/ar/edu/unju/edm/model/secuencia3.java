package ar.edu.unju.edm.model;
/*9.- Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle for. */
public class secuencia3 {
    int num;
    String aux;
    public void setNum(int num){
        this.num = num;
    }
    public int getNum(){
        return num;
    }
    public String secu(){
        String resultado =" ";
        for(int i=20; num>=160; num=num-i){
            aux=String.valueOf(num);
            resultado=resultado + "" + aux;
        }
        return resultado;
    }
}
