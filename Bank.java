

import java.util.ArrayList;

public class Bank {

    private static ArrayList<BankAccount> accounts;

   
    public Bank(){                                  //Costruttore
        Bank.accounts = new ArrayList<>();
    } 
    

    /*static {                                       //Blocco di inizializzazione statica
        accounts = new ArrayList<>();
    } */

    public static void addAccount(BankAccount account){
        
        accounts.add(account);
    }
    
    public static double calcolaTotale(){

        double totale = 0;

        for( BankAccount account : accounts)
        {
            totale += account.getBalance();
        }
        System.out.println(totale);
        return totale;
    }

    public static void stampaNumeriAccount(){
        for (BankAccount account : accounts)
        {
            System.out.println(String.format("%010d", account.getNumero()));

        }

    }

    public static void tassaAccount(){

        for (BankAccount account : accounts)
        {
            if (account.getBalance() > 5000)
            {
                account.tax(account);
            }
        }
    }

    public static void convertiValuta(int accountnumber, String currency)
    {
        for (BankAccount account: accounts)
        {
            if (account.getNumero() == accountnumber){
                account.convertCurrency(currency);
            }
        }
    }

    public static void printAccounts() {
        System.out.println("account in banca :");
        for (BankAccount account : accounts) {
            System.out.println("Account Number: " + account.getNumero());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("----------");
        }
    }
}
