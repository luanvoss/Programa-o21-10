import java.lang.reflect.Method;

public class Moldegarrafa {
    String modelo;
    String cor;
    int carga;
    boolean tampada;

   void  beber() {
       if (this.tampada == true) {
           System.out.println("Não é possível beber o líquido dessa garrafa, está fechada!!");
       } else {
           System.out.println("Capacidade da garrafa é : " + this.carga + " % " );
           System.out.println("Bebendo");
           this.carga = this.carga - 10;
           System.out.println("Capacidade atual da garrafa depois do uso é de: " + this.carga);

       }


   }
   void tampar(){
       this.tampada = true;
   }
 void destampar(){
       this.tampada = false;
 }

 void status(){
       System.out.println("Uma garrafa " + this.cor);
       if (this.tampada == true){
           System.out.println("A garrafa está tampada");
       }
       else{
           System.out.println("A garrafa está destampada ");
       }
       System.out.println("Modelo: "+ this.modelo);
 }
}
