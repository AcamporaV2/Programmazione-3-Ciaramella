public class BankAccount {
    private double balance;
    private int accountnumber;
    private static int ultimonumero=0;
    private int numDeposits;

     //costruttore
    public BankAccount(double soldi) //se non ha argomento bankaccount non ha bisogno di robe
    {
        this.balance = soldi;
        accountnumber= ++ultimonumero;
    } 

    //depositare denaro nel conto bancario
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Versamento di " + amount + " effettuato con successo.");
            numDeposits++;
        } else {
            System.out.println("Il versamento deve essere di importo positivo.");
        }
    }

    //prelevare soldi dal conto bancario
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= this.balance) {
                this.balance -= amount;
                System.out.println("Prelievo di " + amount + " effettuato con successo.");
            } else {
                System.out.println("Saldo insufficiente per il prelievo.");
            }
        } else {
            System.out.println("L'importo del prelievo deve essere positivo.");
        }
    }

    //ottenere il saldo attuale
    public double getBalance() {
        return this.balance;
    }
    public int getNumero(){
        return this.accountnumber;

    }

    public int getNumDeposits(){
        return numDeposits;
    }

    public double tax(BankAccount account){
        
        Double tassa= account.getBalance() - 600; //Odio le tasse
        System.out.println("account " + account.getNumero()+ " Sei stato tassato, ti rimangono " + tassa);
        return tassa;
    }

    public void convertCurrency(String currency){
        double scambioValuta;

        switch(currency){

        case "USD":
            scambioValuta = 1.2;
            break;
        case "GBP":
            scambioValuta= 0.9;
        
        default:
            System.out.println("Valuta non supportata");
            return;
        }
        double nuovoSaldo = balance * scambioValuta;


        balance = nuovoSaldo;

        System.out.println("Il saldo del conto è stato convertito in "+ currency + ": " + nuovoSaldo);
    }

    public boolean controlloaccount(Object account1 )
    {
        BankAccount account2 = (BankAccount)account1; //castato come account 2
        if(this.balance == account2.balance)
        {
            System.out.println("muort e mammt");
            return true;
        }
        else
        {
            System.out.println("mrow");
            return false;
        }
    }
}

