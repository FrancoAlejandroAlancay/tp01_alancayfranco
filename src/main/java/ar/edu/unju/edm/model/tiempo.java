package ar.edu.unju.edm.model;

public class tiempo {
    int num;
    double g=9.81, aux;
    String resultado;
    public void setNum(int num){
        this.num = num;

    }
    public int getNum(){
        return num;
    }
    public String formula(){
        aux=(Math.sqrt((2*num)/g));
        resultado=String.valueOf(aux);
        return resultado;
    }
}
