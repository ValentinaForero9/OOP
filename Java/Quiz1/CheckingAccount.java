
package banco;
public class CheckingAccount{
    
  private String name;
  private int balance;
  private String id;

  
   public CheckingAccount(String inputName, int inputBalance, String inputId){
    this.name = inputName;
    this.balance = inputBalance;
    this.id = inputId;

   }
    public int getBalance(){
    System.out.println("Su saldo es: " );
    return this.balance;
    
  }
    
    public void setBalance(int newBalance){
    this.balance = newBalance;
  }
      
    public void consignar(int ValorDepositado){
    balance = balance+ValorDepositado;
    }
    
    public void retirar(int ValorRetirado){
    balance = balance-ValorRetirado;

    }
}
