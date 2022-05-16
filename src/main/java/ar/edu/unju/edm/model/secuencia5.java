package ar.edu.unju.edm.model;

public class secuencia5 {
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
        do{
            aux=String.valueOf(num);
            resultado=resultado + " " + aux;
            num=num-20;
        }while(num>=160);
        return resultado;
    }
}
