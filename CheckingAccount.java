public class CheckingAccount extends BankAccount
{  public CheckingAccount(int initialBalance)
   {  // costruisce la superclasse
      super(initialBalance);
      
      // inizializza il conteggio delle transazioni
      transactionCount = 0; 
   }

   public void deposit(double amount) 
   {  transactionCount++;
      // ora somma l'importo al saldo 
      super.deposit(amount); 
      System.out.println("numero transazioni : "+transactionCount);
   }
   
   public void withdraw(double amount) 
   {  transactionCount++;
      // ora sottrae l'importo dal saldo 
      super.withdraw(amount); 
   }

   public void deductFees()
   {  if (transactionCount > FREE_TRANSACTIONS)
      {  double fees = TRANSACTION_FEE *
            (transactionCount - FREE_TRANSACTIONS);
         super.withdraw(fees);
      }
      transactionCount = 0;
   }

   private int transactionCount;

   private static final int FREE_TRANSACTIONS = 3;
   private static final double TRANSACTION_FEE = 2.0;
}