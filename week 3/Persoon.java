/**
 * Een klasse voor artikellen die bestelt kunnen worden in de kantine.
 * 
 * @author (Ewoud && Mathijs) 
 * @version (11-12-2014)
 */
public class Persoon 
{
    private String burgerServiceNummer;
    private String voornaam;
    private String achternaam;
    private String geboorteDatum;
    private char geslacht;
    private int geboorteDag;
    private int geboorteMaand;
    private int geboorteJaar;
    public Dienblad dienblad;
    
    /**
     * Parameterloze constructor voor een object van de klasse Persoon
     */
    public Persoon()
    {
      this.geboorteDag = 0;
      this.geboorteMaand = 0;
      this.geboorteJaar = 0;
      this.geslacht = 'X';
    }
          
    /**
     * Constructor voor een object van de klasse Persoon.
     * @param persoonBurgerServiceNummer Dit is het burgerservicenummer van desbetreffende persoon.
     * @param persoonVoornaam Dit is de voornaam van desbetreffende persoon
     * @param persoonAchternaam Dit is de achternaam van desbetreffende persoon
     * @param persoonGeboorteDag Dit is de Geboortedag van desbetreffende persoon
     * @param persoonGeboorteMaand Dit is de Geboortemaand van desbetreffende persoon
     * @param persoonGeboorteJaar Dit is het Geboortejaar van desbetreffende persoon
     * @param persoonGeslacht Dit is het geslacht van desbetreffende persoon
     */
    public Persoon(String persoonBurgerServiceNummer, String persoonVoornaam, String persoonAchternaam, int persoonGeboorteDag, int persoonGeboorteMaand, int persoonGeboorteJaar, char persoonGeslacht)
    {
        // geef de instance variables een beginwaarde
        this.burgerServiceNummer = persoonBurgerServiceNummer;
        this.voornaam = persoonVoornaam;
        this.achternaam = persoonAchternaam;
        this.setGeboorteDatum(persoonGeboorteDag, persoonGeboorteMaand, persoonGeboorteJaar);
        this.setGeslacht(persoonGeslacht);
    } 
        
    /**
     * Methode voor het aanpassen van het burgerservicenummer.
     * @param newBurgerServiceNummer Dit is het burgerservicenummer van desbetreffende persoon.
     * 
     */
    public void setBurgerServiceNummer(String newBurgerServiceNummer)
    {
        this.burgerServiceNummer = newBurgerServiceNummer;
    }
    
    /**
     * Methode voor het aanpassen van de voornaam.
     * @param newVoornaam    Dit is de voornaam van desbetreffende persoon.
     */ 
    public void setVoornaam(String newVoornaam)
    {
        this.voornaam = newVoornaam;
    }
    
    /**
     * Methode voor het aanpassen van de achternaam.
     * @param newAchternaam    Dit is de achternaam van desbetreffende persoon.
     */
    public void setAchternaam(String newAchternaam)
    {
        this.achternaam = newAchternaam;
    }
    
    /**
    * Methode voor het aanpassen van de geboortedatum van de persoon
    */  
    public void setResetGeboorteDatum()
    {
        geboorteDag = 0;
        geboorteMaand = 0;
        geboorteJaar = 0;
    }
     
    /**
     * Methode voor het aanpassen van de geboortedatum.
     * @param persoonGeboorteDag Dit is de geboortedag van desbetreffende persoon.
     * @param persoonGeboorteMaand Dit is de geboortemaand van desbetreffende persoon.
     * @param persoonGeboorteJaar Dit is de geboortejaar van desbetreffende persoon.
     */ 
    public void setGeboorteDatum(int persoonGeboorteDag, int persoonGeboorteMaand, int persoonGeboorteJaar)
    {
        if (persoonGeboorteJaar > 1899 && persoonGeboorteJaar < 2101)
        {            
            switch (persoonGeboorteMaand)
            {                
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                if (persoonGeboorteDag > 0 && persoonGeboorteDag < 32) 
                {
                    this.geboorteDag = persoonGeboorteDag;
                    this.geboorteMaand = persoonGeboorteMaand;
                    this.geboorteJaar = persoonGeboorteJaar;
                }
                else 
                {
                    System.out.println("Deze geboortedag is niet mogelijk. Bij deze maand is alleen een dag tussen 1 & 31 mogelijk.");
                    setResetGeboorteDatum();
                }
                break;
                case 4:
                case 6:
                case 9:
                case 11:
                if (persoonGeboorteDag > 0 && persoonGeboorteDag < 31)
                {
                    this.geboorteDag = persoonGeboorteDag;
                    this.geboorteMaand = persoonGeboorteMaand;
                    this.geboorteJaar = persoonGeboorteJaar;
                }
                else 
                {
                    System.out.println("Dit is helaas niet mogelijk. Bij deze maand is alleen een dag tussen 1 & 30 mogelijk.");
                    setResetGeboorteDatum();
                }
                break;
                case 2:
                if ((persoonGeboorteJaar % 4) == 4 && (persoonGeboorteJaar % 100) != 0 && (persoonGeboorteJaar % 400) == 0)
                {                    
                    if (persoonGeboorteDag > 1 && persoonGeboorteDag < 30)
                    {
                        this.geboorteDag = persoonGeboorteDag;
                        this.geboorteMaand = persoonGeboorteMaand;
                        this.geboorteJaar = persoonGeboorteJaar;
                    }
                    else 
                    {
                        System.out.println("Dit is helaas niet mogelijk. Bij deze maand tijdens een schrikkeljaar is alleen een dag tussen 1 & 29 mogelijk.");
                        setResetGeboorteDatum();
                    }
                }
                else 
                {
                    if (persoonGeboorteDag > 1 && persoonGeboorteDag < 29)
                    {
                        this.geboorteDag = persoonGeboorteDag;
                        this.geboorteMaand = persoonGeboorteMaand;
                        this.geboorteJaar = persoonGeboorteJaar;
                    }
                    else
                    {
                        System.out.println("Dit is helaas niet mogelijk.  Bij deze maand is een normaal jaar alleen een dag tussen 1 & 28 mogelijk.");
                        setResetGeboorteDatum();
                    }
                }
                break;
                default:
                System.out.println("Maand is niet mogelijk..");
                setResetGeboorteDatum();
                break;
            }   
        }
        else
        {
           System.out.println("Alleen jaren tussen 1900 en 2100 zijn mogelijk.");
           setResetGeboorteDatum();
        }
    }
    
    /**
    * Methode voor het aanpassen van het Geslacht van de persoon
    * 
    */  
    public void setGeslacht(char persoonGeslacht)
    {
        if (persoonGeslacht == 'm' || persoonGeslacht == 'v')
        {
           this.geslacht = persoonGeslacht;
        }
        else
        { 
           this.geslacht = 'o';
           System.out.println("Geslacht is niet mogelijk. Geslacht is nu 'onbekend'.");
        }
    }
    
    /**
    * Methode voor het afdrukken van alle gegevens
    * 
    */  
    public void drukAf()
    {
        System.out.println("Voornaam: " + voornaam);
        System.out.println("Achternaam: " + achternaam);
        System.out.println("Geboortedatum: " + getGeboorteDatum());
        System.out.println("Geslacht: " + getGeslacht());
        System.out.println("BSN: " + burgerServiceNummer);
    }
    
    /**
    * Methode voor het krijgen van het Geslacht van de persoon
    */  
    public String getGeslacht()
    {
        String temp;
        if(geslacht == 'm' || geslacht == 'M')
        {
           temp = "Man";
        }
        else if(geslacht == 'v' || geslacht == 'V')
        {
           temp = "Vrouw";
        }
        else
        {
           temp = "Onbekend";
        }
        return temp;
    }
    
    /**
    * Methode voor het krijgen van het GeboorteDatum van de persoon
    */  
    public String getGeboorteDatum() 
    {
       String geboorteDatum;
       if (geboorteDag==0 && geboorteMaand==0 && geboorteJaar==0) 
       {
           geboorteDatum="Onbekend";
       } 
       else 
       {
           geboorteDatum=geboorteDag+"/"+geboorteMaand+"/"+geboorteJaar;
       }
       return geboorteDatum;
    }
    
    /**
    * Methode voor het krijgen van het burgerserivenummer van de persoon
    */  
    public String getBurgerSeriveNummer()  
    {
        return burgerServiceNummer;
    }
    
    /**
    * Methode voor het krijgen van de voornaam van de persoon
    */  
    public String getVoornaam() 
    {
        return voornaam;
    }
        
    /**
    * Methode voor het krijgen van de achternaam van de persoon
    */  
    public String getAchternaam() 
    {
        return achternaam;
    }
    
    /**
    *  Constructor voor het maken van een object van de persoon
    */
    public void pakDienblad(Dienblad dienblad)
    {
        this.dienblad=dienblad;
    }
    
    /**
    *  Methode voor het krijgen van de totaalprijs
    */
    public double getTotaalprijs()
    {
        double totaalPrijs;
        if(dienblad != null)
        {
            totaalPrijs = dienblad.getTotaalPrijs();
        }
        else
        {
            totaalPrijs = 0.0;
        }
        return totaalPrijs;
    }
    
    /**
    * Methode voor het krijgen van het aantal artikelen
    */
    public int getAantalArtikelen()
    {
        int aantalArtikelen;
        if(dienblad != null)
        {
            aantalArtikelen = dienblad.getAantalArtikelen();
        }
        else
        {
            aantalArtikelen = 0;
        }
        return aantalArtikelen;
    }
    
    /**
    * Getter voor dienblad
    * @return dienblad
    */
    public Dienblad getDienblad()
    {
         return dienblad;
    }
}