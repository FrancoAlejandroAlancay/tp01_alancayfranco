package ar.edu.unju.edm.tp01_alancayfranco;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Bisiesto;
import ar.edu.unju.edm.model.Nota;
import ar.edu.unju.edm.model.Principal;
import ar.edu.unju.edm.model.Mes;
import ar.edu.unju.edm.model.Mes1;
import ar.edu.unju.edm.model.Par_Impar;



@Controller
public class MenuController {
    @GetMapping("/menu")
    public String GetMenu(){
      return "index";
    }
    //punto1
    @GetMapping("/potencia")
    public String getPotenciapage(@RequestParam (name = "num") int num, Model model){
      int Factorial=1;
      Principal factoPrincipal = new Principal();
      factoPrincipal.setNum(num);
      Factorial= factoPrincipal.main();
      model.addAttribute("Factorial", Factorial);
      return "punto1";
    }
    //punto2
    @GetMapping("/anioBisiesto")
    public String getBiPage(@RequestParam (name = "num") int num, Model model){
      String ABisiesto;
      Bisiesto biBisiesto = new Bisiesto();
      biBisiesto.setanio(num);
      ABisiesto = biBisiesto.Bi();
      model.addAttribute("ABisiesto", ABisiesto);
      return "punto2";
    }
  
    //punto3
    @GetMapping("/ParImpar")
    public String getparPage(@RequestParam (name = "num") int num,Model model){
      String[] Aux1= new String[5];
      Par_Impar ppar = new Par_Impar();
          for(int i=0;i<5;i++){
              ppar.setNum(num);
              Aux1[i] = ppar.par();
        model.addAttribute("par1", Aux1[0]);
        model.addAttribute("par2", Aux1[1]);
        model.addAttribute("par3", Aux1[2]);
        model.addAttribute("par4", Aux1[3]);
        model.addAttribute("par5", Aux1[4]);
              num=num+3;
          }
      return "punto3";
    }
  
    //punto4
    @GetMapping("/mes")
    public String getmesPage(@RequestParam (name = "num") int num,Model model){
      String aux;
      Mes mmes = new Mes();
      mmes.setNum(num);
          aux = mmes.ME();
      model.addAttribute("me", aux);
      return "punto4";
    }
  
    //punto5
    @GetMapping("/mes2")
    public String getmes2Page(@RequestParam (name = "num") int num,Model model){
      String aux;
      Mes1 mmes1 = new Mes1();
      mmes1.setNum(num);
          aux = mmes1.ME();
      model.addAttribute("me2", aux);
      return "punto5";
    }
  
    //punto6
    @GetMapping("/nota")
    public String getnotaPage(@RequestParam (name = "num") int num,Model model){
      String[] Aux1= new String[8];
      Nota nnota = new Nota();
          for(int i=0;i<8;i++){
              nnota.setNum(num);
              Aux1[i] = nnota.nota();
        model.addAttribute("nota1", Aux1[0]);
        model.addAttribute("nota2", Aux1[1]);
        model.addAttribute("nota3", Aux1[2]);
        model.addAttribute("nota4", Aux1[3]);
        model.addAttribute("nota5", Aux1[4]);
        model.addAttribute("nota6", Aux1[5]);
        model.addAttribute("nota7", Aux1[6]);
        model.addAttribute("nota8", Aux1[7]);
              num--;
          }
      return "punto6";
    }
}
