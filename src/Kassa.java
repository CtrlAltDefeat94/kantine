/**
 * Een klasse voor een Kassa
 * 
 * @author (Ewoud && Mathijs) 
 * @version (05-12-2014)
 */
public class Kassa 
{ 
    private KassaRij kassarij;
    private Persoon persoon;
    public int aantalArtikelen;
    public double hoeveelheidGeld;
    
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
        this.persoon = persoon;
        double totaalPrijs = persoon.getTotaalprijs();
        int aantalArtikelen = persoon.getAantalArtikelen();
        this.aantalArtikelen = this.aantalArtikelen + aantalArtikelen;
        hoeveelheidGeld = hoeveelheidGeld + totaalPrijs;
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
    public double hoeveelheidGeldInKassa() 
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
}
