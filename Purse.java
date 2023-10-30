import java.util.ArrayList;

public class Purse {
    
    
    public Purse() 
    {
        coins = new ArrayList<>();
    }
    //ok
    public void add(coin moneta)
    {
        coins.add(moneta);
    }
    //ok

    public double getTotal() {
        double total = 0.0;

        for (int i = 0; i < coins.size(); i++) {

            coin coin = (coin) coins.get(i);
            total += coin.getValue();
        }
        return total;
    }

    public int count()
    {
        return coins.size();
    }

    public boolean find(coin moneta)
    {
        for (int i = 0; i < coins.size(); i++) 
        {
            coin prova = (coin)coins.get(i);

            if(prova.getName().equals(moneta.getName()) && prova.getValue() == moneta.getValue())
            {   
                System.out.println("uguali");
                return true;
            }
            else
            {
                System.out.println("non uguali");
            }
        }
        
        return false;
    }

    public int count(coin moneta)
    {
        int uguali = 0;

        for (int i = 0; i < coins.size(); i++)
        {
          coin indice = (coin)coins.get(i);
          
            if(indice.getName().equals(moneta.getName()) && indice.getValue() == moneta.getValue())
            {
                uguali++;
                System.out.println("prova");
            }
        }

        return uguali;
    }
    
    public coin getMaximum()
    {
        if(coins.isEmpty())
        {
            return null;
        }

        coin maximumcoin = (coin)coins.get(0);

        for(int i = 1; i< coins.size();i++)
        {
            coin indice = (coin)coins.get(i);

            if(indice.getValue() > maximumcoin.getValue())
            {
                maximumcoin = indice;
                
            }
            
        }
       
        return maximumcoin;
    }


    private ArrayList<coin> coins;
}
