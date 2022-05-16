package ar.edu.unju.edm.model;
/*7.- Utilice la estructura de control iterativa for para mostrar por consola la secuencia numérica:
80 117 152 185 216 245 272 297 320 341 360 377 392 405 416 425 432 437 440 441 440 437
+37  +35 +33 +31  +29 +27 +25 +23 +21+19 +17 +15 +13 +11 +9  +7  +5  +3  +1   -1  -3 
432 425 416 405 392 377 360 341 320 297 272 245 216 185 152 117 80 41
Las únicas variables que se utilizan son i, j tanto en la sección de inicialización e incremento.
j inicia en 40 e i inicia en 2.
Si el valor de j es negativo se finaliza.
La serie de números se imprime en una sola línea.*/
public class secuencia1 {
    int num,aux=37;
    public void setNum(int num) {
        this.num=num;

    }
    public int getNum() {
        return num;
    }
    public String secu(){
        String resultado= " ", aux1;
        int i=2;
        for(int j=40; j>40; j--) {
            aux1=String.valueOf (num);
            resultado=resultado +""+aux1;
            if(aux==0) {
                num=num-aux;
                aux=aux+i;

            }else{
                num=num+1;
            }
        }
        return resultado;
    }
}
