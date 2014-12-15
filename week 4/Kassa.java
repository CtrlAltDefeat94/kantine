import java.util.Iterator;
/**
 * Een klasse voor een Kassa
 * 
 * @author (Ewoud && Mathijs) 
 * @version (05-12-2014)
 */
public class Kassa 
{ 
    private KassaRij kassarij;
    public int aantalArtikelen;
    public int hoeveelheidGeld;
    
    /**
    *  Constructor voor het maken van een object van de klasse
    */
    public Kassa(KassaRij kassarij) 
    {
        this.kassarij = kassarij;
    }

    /**
     * vraag het aantal artikelen en de totaalprijs op.
     * De implementatie wordt later vervangen 
     * door een echte betaling door de persoon. 
     * @param persoon die moet afrekenen
     */
    public void rekenAf(Persoon persoon) 
    {
        Iterator<Artikel> artikelen = persoon.getDienblad().getArtikelIterator();
        int totaalPrijs = 0;
        int aantalArtikelen = 0;
        while(artikelen.hasNext()) {
            Artikel artikel = artikelen.next();
            totaalPrijs += artikel.getPrijs();
            aantalArtikelen++;
        }
        hoeveelheidGeld += totaalPrijs;
        this.aantalArtikelen += aantalArtikelen;
    }

    /**
     * Geeft het aantal artikelen dat de kassa 
     * heeft gepasseerd, 
     * vanaf het moment dat de methode resetWaarden 
     * is aangeroepen.
     * @return aantal artikelen
     */
    public int aantalArtikelen() 
    {
        return aantalArtikelen;
    }

    /**
     * Geeft het totaalbedrag van alle artikelen die
     * de kassa zijn gepasseerd, vanaf het moment dat de methode
     * resetKassa 
     * is aangeroepen.
     * @return hoeveelheid geld in de kassa
     */
    public int hoeveelheidGeldInKassa() 
    {
        return hoeveelheidGeld;
    }

    /**
     * reset de waarden van het aantal gepasseerde artikelen en 
     * de totale hoeveelheid geld in de kassa.
     */
    public void resetKassa() 
    {
        aantalArtikelen = 0;
        hoeveelheidGeld = 0;
    }
    
    /**
     * Methode voor het ophalen van het aantal artikelen die de kassas is gepasseerd,
     * sinds de laatste keer dat de kassa is gereset.
     * @return  Geeft het aantal artikelen die de kassa is gepasseerd weer.
     */
    public double getTotaalPrijs(Persoon persoon)
    {
        double prijs = 0.0;
        if(persoon.getDienblad() == null) 
        {
            System.out.println("U heeft nog geen dienblad gepakt.");
        }
        else 
        {
            Iterator<Artikel> it = persoon.getDienblad().getArtikelIterator();
            while(it.hasNext()) 
            {
                prijs += it.next().getPrijs();
            }
        }
        return prijs;
    }

   /**
   * Methode om aantal artikelen op dienblad van de persoon op te tellen
   * @return Het aantal artikelen
   */
       public int getAantalArtikelen()
    {
        return aantalArtikelen;
    }

}
