public class  PurseTest
{
    public static void main(String[] args){

        Purse Borsello = new Purse();

        Borsello.add(new coin("moneta1",10));
        Borsello.add(new coin("moneta2",20));
        Borsello.add(new coin("moneta3",30));
        Borsello.add(new coin("moneta1",10));

            

        //System.out.println(Borsello.getMaximum().getValue()); //funziona
        //System.out.println(Borsello.getTotal()); //funziona
        //System.out.println(Borsello.count()); //funziona 
        //System.out.println(Borsello.getMaximum()); //Kinda funziona 


       System.out.println(Borsello.count(new coin("moneta1",10))); //funziona
       System.out.println(Borsello.find(new coin("moneta2", 20))); //funziona
    }
}