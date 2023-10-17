

public class BankAccountTest {
   /*  public static void main(String[] args) {
        // Creazione di un'istanza di BankAccount
        BankAccount account = new BankAccount(400);
        
        // Test  deposit
        account.deposit(100.0);
        System.out.println("Dopo il deposito di 100.0, saldo attuale: " + account.getBalance());

        // Test withdraw
        account.withdraw(50.0);
        System.out.println("Dopo il prelievo di 50.0, saldo attuale: " + account.getBalance());

        // Test getBalance
        double saldoAttuale = account.getBalance();
        System.out.println("Saldo attuale: " + saldoAttuale);

        // Stampa finale del saldo
        System.out.println("Saldo finale: " + account.getBalance());

        System.out.println("Numero account: " + account.getNumero());

        BankAccount account2 = new BankAccount(500);

        System.out.println("numero account: " + account2.getNumero());
    } */



    public static void main(String args[]){

        Bank provaBank = new Bank();

        SavingAccount prova1 = new SavingAccount(6000);
        SavingAccount prova2 = new SavingAccount(5000);
        CheckingAccount prova3 = new CheckingAccount(2000);

     Bank.addAccount(prova1);  //Funziona
    Bank.addAccount(prova2);
        
        Bank.printAccounts();   //FUNZIONA
        Bank.calcolaTotale();       //FUNZIONA
        Bank.stampaNumeriAccount();     //FUNZIONA
        Bank.tassaAccount();            //FUNZIONA

        Bank.convertiValuta(1, "Cuckcoins"); //Funziona

        prova3.deposit(3000);
        prova3.deposit(200);
        prova3.deposit(400);

        prova2.controlloaccount(prova1);

        coin monetaprova1 = new coin( "euro", 1);
        coin monetaprova2 = new coin("noneuro",1);

        monetaprova2.sonoUguali(monetaprova1);


        
    }



}

