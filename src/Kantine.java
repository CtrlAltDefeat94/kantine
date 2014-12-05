/**
 * Een klasse voor een Kantine
 * 
 * @author (Ewoud && Mathijs) 
 * @version (05-12-2014)
 */
public class Kantine 
{    
    private Kassa kassa;
    private KassaRij kassarij;
    private Persoon persoon;
    private Artikel artikel;
    private Dienblad dienblad;

    /**
     * Constructor voor een object van de klasse Kantine
     */
    public Kantine() 
    {
        kassarij=new KassaRij();
        kassa=new Kassa(kassarij);
    }

    /**
     * In deze methode wordt een Persoon en Dienblad
     * gemaakt en aan elkaar
     * gekoppeld. Maak twee Artikelen aan en plaats 
     * deze op het dienblad.   
     * Tenslotte sluit de Persoon zich aan bij de rij 
     * voor de kassa.
     */
    public void loopPakSluitAan() 
    {
        persoon = new Persoon();
        dienblad = new Dienblad();
        persoon.pakDienblad();
        Artikel artikel1 = new Artikel("Soep", 2.50);
        Artikel artikel2 = new Artikel("Cola", 1.70);
        persoon.pakArtikel(artikel1);
        persoon.pakArtikel(artikel2);
        kassarij.sluitAchteraan(persoon);
    }

    /**
     * Deze methode handelt de rij voor de kassa af.
     */
    public void verwerkRijVoorKassa() 
    {
        while (kassarij.erIsEenRij() == true)
        {
            this.persoon = kassarij.eerstePersoonInRij();
            kassa.rekenAf(this.persoon);
        }
    }

    /**
     * Deze methode telt het geld uit de kassa
     * @return hoeveelheid geld in kassa
     */
    public double hoeveelheidGeldInKassa() 
    {
        return kassa.hoeveelheidGeld;
    }

    /**
     * Deze methode geeft het aantal gepasseerde artikelen.
     * @return het aantal gepasseerde artikelen
     */
    public int aantalArtikelen()
    {
        return kassa.aantalArtikelen;
    }

    /**
     * Deze methode reset de bijgehouden telling van 
     * het aantal artikelen
     * en "leegt" de inhoud van de kassa.
     */
    public void resetKassa() 
    {
        kassa.resetKassa();
    }
}
