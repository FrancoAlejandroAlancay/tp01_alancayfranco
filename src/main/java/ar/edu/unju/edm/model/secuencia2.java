package ar.edu.unju.edm.model;
/*8.- Utilizando la estructura de control iterativa do-while, genere la secuencia numérica, la cual está
determinada por los números múltiplos de 4 menores o iguales que 100:
4 8 12 16 20 24 28 32 36 40 44 48 52 56 60 64 68 72 76 80 84 88 92 96 100 */
public class secuencia2 {
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
            num=num + 4;
            aux=String.valueOf(num);
            resultado=resultado +""+aux;

        } while (num<100);
        return resultado;
    }
}
