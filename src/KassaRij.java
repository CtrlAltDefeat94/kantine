import java.util.LinkedList;
/**
 * Een klasse voor een Kassarij
 * 
 * @author (Ewoud && Mathijs) 
 * @version (05-12-2014)
 */

public class KassaRij 
{    
    private LinkedList<Persoon> persoon;
    
    /**
    * Constructor voor een object in de klasse kassaRij
    */
    public KassaRij() 
    {        
        persoon = new LinkedList<Persoon>();
    }

    /**
    * Persoon sluit achter in de rij aan
    * @param persoon
    */
    public void sluitAchteraan(Persoon persoon) 
    {
        this.persoon.add(persoon);
    }

    /**
    * Indien er een rij bestaat, de eerste Persoon uit
    * de rij verwijderen en retourneren. 
    * Als er niemand in de rij staat geeft deze null terug.
    * @return Eerste persoon in de rij of null
    */
    public Persoon eerstePersoonInRij() 
    {
        Persoon temp = null;
        if (erIsEenRij() == true)
        {
            temp = persoon.get(0);
            persoon.remove(0);
        }
        else
        {
            temp = null;
        }
        return temp;
    }

    /**
    * Methode kijkt of er personen in de rij staan. 
    * @return Of er wel of geen rij bestaat
    */
    public boolean erIsEenRij() 
    {
        return (this.persoon.size() >= 1);
    }
}
