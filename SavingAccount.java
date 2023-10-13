
public class SavingAccount extends BankAccount{
    
    public SavingAccount(double soldi) //costruttore
    {
        super(soldi); //chiama la classe principale tramite super
    }

    public void addInterest()
    {
        Interesse = super.getBalance() * InteresseRate / 100;

        deposit(Interesse);
    }

    private double Interesse;
    private int InteresseRate = 2;
    
  

}
