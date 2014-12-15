
/**
 * Klasse Docent 
 * 
 * @authors Mathijs & Ewoud
 * @versie 1 (week 4)
 */
public class Docent extends Persoon
{
    private String afdeling;
    private String afkorting;
        
    /**
    * Constructor voor de subklasse Docent 
    */
    public Docent(String afkorting, String afdeling, String persoonBurgerServiceNummer, String persoonVoornaam, String persoonAchternaam, int persoonGeboorteDag, int persoonGeboorteMaand, int persoonGeboorteJaar, char persoonGeslacht)
    {
        super(persoonBurgerServiceNummer, persoonVoornaam, persoonAchternaam, persoonGeboorteDag, persoonGeboorteMaand, persoonGeboorteJaar, persoonGeslacht);
        this.afkorting = afkorting;
        this.afdeling = afdeling;
    }
    /**
     * Parameterloze constructor voor een object van de subklasse Docent
     */
    public Docent()
    {
        super();
        afkorting = "DIRN";
        afdeling = "Communicatie, Media & IT";
    }
    
    /**
    * Methode voor het aanpassen van Afkroting
    * @param afkorting
    */
    public void setAfkorting(String afkorting)
    {
        this.afkorting = afkorting;
    }
    
    /**
    * Mehtode voor het aanpassen van Afdeling
    * @param afdeling
    */
    public void setAfdeling(String afdeling)
    {
        this.afdeling = afdeling;
    }
    
    /**
    * Methode voor het krijgen van de waarde Afdeling
    * @return afdeling
    */
    public String getAfdeling()
    {
        return afdeling;
    }
    
    /**
    * Methode voor het krijgen van de waarde Afkorting
    * @return afkorting
    */
    public String getAfkorting()
    {
        return afkorting;
    }
         
    /**
    * print gegevens Docent, Dit zijn Afdeling en Afkorting.
    */
    public void drukAf()
    {
        System.out.println("Afdeling: "+ getAfdeling());
        System.out.println("Afkorting: "+ getAfkorting());
    }
    
}

