import java.util.Stack;
/**
 * Een klasse Dienblad
 * 
 * @author (Ewoud && Mathijs) 
 * @version (05-12-2014)
 */
public class Dienblad 
{
    private Stack<Artikel> artikelen;

    /**
    * Constructor voor een object van de klasse Dienblad
    */
    public Dienblad() 
    {
        artikelen = new Stack<Artikel>();
    }

    /**
    * Methode om artikel aan dienblad toe te voegen
    * @param artikel
    */
    public void voegToe(Artikel artikel) 
    {
        artikelen.add(artikel);
    }

    /**
    * Methode om aantal artikelen op dienblad te tellen
    * @return Het aantal artikelen 
    */
    public int getAantalArtikelen() 
    {
        return artikelen.size();
    }

    /**
    * Methode om de totaalprijs van de artikelen 
    * op dienblad uit te rekenen
    * @return De totaalprijs
    */
    public double getTotaalPrijs() 
    {
        double totaal = 0;
        int index = 0;
        while (index < artikelen.size())
        {
            totaal = totaal + artikelen.get(index).getPrijs();
            index++;
        }
        return totaal;
    }
}
