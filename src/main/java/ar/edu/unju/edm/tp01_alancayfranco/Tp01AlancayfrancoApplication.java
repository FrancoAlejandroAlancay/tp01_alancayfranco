package ar.edu.unju.edm.tp01_alancayfranco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.Bisiesto;
import ar.edu.unju.edm.model.Nota;
import ar.edu.unju.edm.model.Principal;
import ar.edu.unju.edm.model.Mes;
import ar.edu.unju.edm.model.Mes1;
import ar.edu.unju.edm.model.Par_Impar;
import ar.edu.unju.edm.model.secuencia1;
import ar.edu.unju.edm.model.secuencia2;
import ar.edu.unju.edm.model.secuencia3;
import ar.edu.unju.edm.model.secuencia4;
import ar.edu.unju.edm.model.secuencia5;
import ar.edu.unju.edm.model.tiempo;

@SpringBootApplication
public class Tp01AlancayfrancoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp01AlancayfrancoApplication.class, args);
		
		//prueba punto1
		Principal factoPrincipal = new Principal();
		factoPrincipal.setNum(4);
		System.out.println("El factorial es " + factoPrincipal.main());

		//prueba punto2
		Bisiesto biBisiesto = new Bisiesto();
		biBisiesto.setanio(2020);
		System.out.println("El año " + biBisiesto.Bi());

		//prueba punto3
		Par_Impar ppar = new Par_Impar();
		int aux=3;
		for(int i=0;i<5;i++){
			ppar.setNum(aux);
			System.out.println("El numero es "+ ppar.par());
			aux=aux+3;
		}

		//prueba punto4
		Mes mmes = new Mes();
		mmes.setNum(13);
		System.out.println(mmes.ME());

		//prueba punto5
		Mes1 mmes1 = new Mes1();
		mmes1.setNum(2);
		System.out.println(mmes1.ME());

		//prueba punto6
		Nota nnota = new Nota();
		aux=8;
		while(aux>0){
			nnota.setNum(aux);
			System.out.println(nnota.nota());
			aux--;
		}
		//prueba punto7
		secuencia1 ssecuencia = new secuencia1();
		ssecuencia.setNum(80);
		System.out.println(ssecuencia.secu());

		//prueba punto8
		secuencia2 ssecuencia2 = new secuencia2();
		ssecuencia2.setNum(4);
		System.out.println(ssecuencia2.secu());

		//prueba punto9
		secuencia3 ssecuencia3 = new secuencia3();
		ssecuencia3.setNum(320);
		System.out.println(ssecuencia3.secu());

		//prueba punto10
		secuencia4 ssecuencia4 = new secuencia4();
		ssecuencia4.setNum(320);
		System.out.println(ssecuencia4.secu());

		//prueba punto11
		secuencia5 ssecuencia5 = new secuencia5();
		ssecuencia5.setNum(320);
		System.out.println(ssecuencia5.secu());

		//prueba punto12
		tiempo ttiempo = new tiempo();
		ttiempo.setNum(6);
		System.out.println(ttiempo.formula());
	}
}