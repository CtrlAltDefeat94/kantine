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
    private KantineAanbod kantineAanbod;

    /**
     * Constructor voor een object van de klasse Kantine
     */
    public Kantine() 
    {
        kassarij=new KassaRij();
        kassa=new Kassa(kassarij);
    }
    
    /**
    * In deze methode kiest een persoon met een dienblad
    * de artikelen in artikelnamen
    * @param persoon
    * @param artikelnamen
    */
    public void loopPakSluitAan(Persoon persoon, String[] artikelnamen)
    {
        Artikel artikel;
        Dienblad dienblad = persoon.getDienblad();
        for(String artikelNaam : artikelnamen)
        {
            artikel = kantineAanbod.getArtikel(artikelNaam);
            persoon.getDienblad().voegToe(artikel);
        }
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
    * De getter voor de instantie variabele kassa, zodat de methoden hiervan indirect
    * kunnen worden aangeroepen door superklasses
    * @return kassa
    */
    public Kassa getKassa()
    {
         return kassa;
    }

    /**
    * Getter voor kantine aanbod
    * @return kantine aanbod object
    */
    public KantineAanbod getKantineAanbod()
    {
      return kantineAanbod;
    }
    
    /**
    * Setter voor kantine aanbod
    * @param kantine aanbod object
    */
    public void setKantineAanbod(String[] artikelnaam, int[] prijsInCenten, int[] hoeveelheid)
    {
        this.kantineAanbod = new KantineAanbod(artikelnaam, prijsInCenten, hoeveelheid);
    }

}
