package banco;

public class Banco{
     private CheckingAccount cuentauno;
     private CheckingAccount cuentados;
     
     
     public Banco(){
         
    cuentauno = new CheckingAccount ("Juan",0, "1");
    cuentados = new CheckingAccount ("Luisa",0,"2");
    
  
     }
     public static void main (String[] args){
      System.out.println("1.Bienvenido al banco Juan ");
      System.out.println("Consignaciones: ");
       Banco bankone = new Banco();
      System.out.println(bankone.cuentauno.getBalance());
      bankone.cuentauno.setBalance(50000);
      System.out.println(bankone.cuentauno.getBalance());
      bankone.cuentauno.consignar(3000);
      System.out.println(bankone.cuentauno.getBalance());
      bankone.cuentauno.consignar(10500);
      System.out.println(bankone.cuentauno.getBalance());
      bankone.cuentauno.consignar(8000);
      System.out.println(bankone.cuentauno.getBalance());
      bankone.cuentauno.consignar(5000);
      System.out.println(bankone.cuentauno.getBalance());
      
      System.out.println("Retiros: ");
      bankone.cuentauno.retirar(4000);
      System.out.println(bankone.cuentauno.getBalance());
      bankone.cuentauno.retirar(26000);
      System.out.println(bankone.cuentauno.getBalance());
      bankone.cuentauno.retirar(100);
      System.out.println(bankone.cuentauno.getBalance());
      bankone.cuentauno.retirar(650);
      System.out.println(bankone.cuentauno.getBalance());
      bankone.cuentauno.retirar(8000);
      System.out.println(bankone.cuentauno.getBalance());
      
      System.out.println("//////////////////////////////");
     
      
      System.out.println("2. Bienvenida al banco Luisa ");
      System.out.println("Consignaciones: ");
      System.out.println(bankone.cuentados.getBalance());
      bankone.cuentados.setBalance(50000);
      System.out.println(bankone.cuentados.getBalance());
      bankone.cuentados.consignar(8000);
      System.out.println(bankone.cuentados.getBalance());
      bankone.cuentados.consignar(5900);
      System.out.println(bankone.cuentados.getBalance());
      bankone.cuentados.consignar(10000);
      System.out.println(bankone.cuentados.getBalance());
      bankone.cuentados.consignar(95000);
      System.out.println(bankone.cuentados.getBalance());
      
      System.out.println("Retiros: ");
      bankone.cuentados.retirar(4500);
      System.out.println(bankone.cuentados.getBalance());
      bankone.cuentados.retirar(90000);
      System.out.println(bankone.cuentados.getBalance());
      bankone.cuentados.retirar(1500);
      System.out.println(bankone.cuentados.getBalance());
      bankone.cuentados.retirar(6500);
      System.out.println(bankone.cuentados.getBalance());
      bankone.cuentados.retirar(1000);
      System.out.println(bankone.cuentados.getBalance());
  }
  
      
    }