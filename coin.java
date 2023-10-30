public class coin implements Interfaccia{
    private double value;
    private String name;

    
    public coin(String coinName, double coinValue )
    {
        value = coinValue;
        name = coinName;
    }


    public String getName(){
        return name;
    }
    public double getValue(){
     return value;
    }

   public boolean sonoUguali(Object moneta1)
   {
        coin moneta2 = (coin)moneta1;

        if(this.value == moneta2.value && this.name.equals(moneta2))
        {
            System.out.println("argh");
            return true;
        }
        else
        {
            System.out.println("hgra");
            return false;
        }
   }

   public double getMeasure()
   {
    return value;
   } 
}
