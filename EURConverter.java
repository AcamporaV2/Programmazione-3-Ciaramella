public class EURConverter implements CurrencyConverter{
    @Override
    public double convert(double amount)
    {
        return amount *0.97; //conversione da USD a eur
    }
    
}
