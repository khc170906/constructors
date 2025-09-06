public class BankAccount {
   static void display()
   {
    String Bank_name="SBI";
    System.out.println("Bank Name : " +  Bank_name);
   } 
   float balance;
   float deposit_ammount;
   BankAccount(float  balance)
   {
    this.balance=balance;
   }

   void deposit(float deposit_ammount)
   {
    balance=balance+deposit_ammount;
    System.out.println("Ammount Deposited = " + deposit_ammount);
    System.out.println("Total balance after deposited the ammount = " + balance);
   }
   void withdraw(float ammount)
   {
    System.out.println("withdrawal Ammount = " + ammount);
    balance=balance-ammount;
   }
   void checkBalance()
   {
    System.out.println("Balance = " + balance);
   }
   public static void main(String[] args) {
    display();
       BankAccount b1=new BankAccount(4000);
       b1.deposit(2000);
       b1.withdraw(4000);
       b1.checkBalance();
         
       

   }
}
