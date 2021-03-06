
/**
 * Kantine KantineMedewerker  
 * 
 * @authors Mathijs & ewoud
 * @versie 1 (week 4)
 */
public class KantineMedewerker extends Persoon
{
    private boolean kassaToegang;
    
    /**
     * Constructor voor de subklasse Kantinemedewerker
     */
    public KantineMedewerker(boolean kassaToegang, String persoonBurgerServiceNummer, String persoonVoornaam, String persoonAchternaam, int persoonGeboorteDag, int persoonGeboorteMaand, int persoonGeboorteJaar, char persoonGeslacht)
    {
       super(persoonBurgerServiceNummer, persoonVoornaam, persoonAchternaam, persoonGeboorteDag, persoonGeboorteMaand, persoonGeboorteJaar, persoonGeslacht);
       this.kassaToegang = kassaToegang;
    }
    /**
     * Parameterloze constructor voor een object van de subklasse KantineMedewerker
     */
    public KantineMedewerker()
    {
        super();
        kassaToegang = false;
    }
    /**
    * Methode voor het aanpassen van KassaToegang.
    */
    public void setKassaToegang(boolean kassaToegang)
    {
        this.kassaToegang = kassaToegang;
    }
    
    /**
     * Methode voor het krijgen van de waarde van Kassatoegang
     * @return kassaToegang
     */
    public boolean getKassatoegang()
    {
        return kassaToegang;
    }
   
    /**
     * Print gegevens KantineMedewerker
     */
    public void drukAf()
    {
        System.out.println("Kassatoegang:"+ getKassatoegang());
    }
}

