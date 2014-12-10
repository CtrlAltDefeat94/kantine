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
        kassarij.sluitAchteraan(persoon);        
       
        persoon.getDienblad().voegToe(artikel1);
        persoon.getDienblad().voegToe(artikel2);
    }
    
    /**
    * In deze methode kiest een persoon met een dienblad
    * de artikelen in artikelnamen
    * @param persoon
    * @param artikelnamen
    */
    public void loopPakSluitAan(Persoon persoon, String[] artikelnamen)
    {
       for(int i = 0; i < artikelnamen.length; i++) 
       {
            Artikel artikel = kantineAanbod.getArtikel(artikelnamen[i]);
            persoon.getDienblad().voegToe(artikel);
       
       }
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
    public void setKantineAanbod(KantineAanbod kantineAanbod)
    {
       this.kantineAanbod = kantineAanbod;
    }  

}
