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
    * @return wel of geen rij
    */
    public boolean erIsEenRij() 
    {
        return (this.persoon.size() >= 1);
    }
}
