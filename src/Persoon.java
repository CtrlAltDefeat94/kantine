/**
 * Een klasse voor artikellen die bestelt kunnen worden in de kantine.
 * 
 * @author (Ewoud && Mathijs) 
 * @version (23-11-2014)
 */
public class Persoon {
    private String burgerServiceNummer;
    private String voornaam;
    private String achternaam;
    private String geboorteDatum;
    private char geslacht;
    private int geboorteDag;
    private int geboorteMaand;
    private int geboorteJaar;
    
    /**
	* Constructor voor een object van de klasse Persoon
	*/
    public Persoon(String persoonBurgerServiceNummer, String persoonVoornaam, String persoonAchternaam, int persoonGeboorteDag, int persoonGeboorteMaand, int persoonGeboorteJaar, char persoonGeslacht)
    {
        // geef de instance variables een beginwaarde
        burgerServiceNummer = persoonBurgerServiceNummer;
        voornaam = persoonVoornaam;
        achternaam = persoonAchternaam;
        setGeboorteDatum(persoonGeboorteDag, persoonGeboorteMaand, persoonGeboorteJaar);
        setGeslacht(persoonGeslacht);
    }

        
    /**
	* Methode voor het aanpassen van de BurgerServiceNummer van de persoon
	*/	
    public void setBurgerServiceNummer(String newBurgerServiceNummer)
    {
        burgerServiceNummer = newBurgerServiceNummer;
    }

    /**
	* Methode voor het aanpassen van de voornaam van de persoon
	*/	
    public void setVoornaam(String newVoornaam)
    {
        voornaam = newVoornaam;
    }
    
    /**
	* Methode voor het aanpassen van de achternaam van de persoon
	*/	
    public void setAchternaam(String newAchternaam)
    {
        achternaam = newAchternaam;
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
	* Methode voor het aanpassen van de geboortedatum van de persoon
	*/	
    public void setGeboorteDatum(int persoonGeboorteDag, int persoonGeboorteMaand, int persoonGeboorteJaar)
    {
        if(persoonGeboorteJaar > 1899 && persoonGeboorteJaar < 2101)
        {
        
            switch(persoonGeboorteMaand)
            {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                if(persoonGeboorteDag > 0 && persoonGeboorteDag < 32) 
                {
                    geboorteDag = persoonGeboorteDag;
                    geboorteMaand = persoonGeboorteMaand;
                    geboorteJaar = persoonGeboorteJaar;
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
                if(persoonGeboorteDag > 0 && persoonGeboorteDag < 31)
                {
                    geboorteDag = persoonGeboorteDag;
                    geboorteMaand = persoonGeboorteMaand;
                    geboorteJaar = persoonGeboorteJaar;
                }
                else 
                {
                    System.out.println("Dit is helaas niet mogelijk. Bij deze maand is alleen een dag tussen 1 & 30 mogelijk.");
                    setResetGeboorteDatum();
                }
                break;
                case 2:
                if((persoonGeboorteJaar % 4) == 4 && (persoonGeboorteJaar % 100) != 0 && (persoonGeboorteJaar % 400) == 0)
                {
                    if(persoonGeboorteDag > 1 && persoonGeboorteDag < 30)
                    {
                        geboorteDag = persoonGeboorteDag;
                        geboorteMaand = persoonGeboorteMaand;
                        geboorteJaar = persoonGeboorteJaar;
                    }
                    else 
                    {
                        System.out.println("Dit is helaas niet mogelijk. Bij deze maand tijdens een schrikkeljaar is alleen een dag tussen 1 & 29 mogelijk.");
                        setResetGeboorteDatum();
                    }
                }
                else 
                {
                    if(persoonGeboorteDag > 1 && persoonGeboorteDag < 29)
                    {
                        geboorteDag = persoonGeboorteDag;
                        geboorteMaand = persoonGeboorteMaand;
                        geboorteJaar = persoonGeboorteJaar;
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
        }
    }
    
    /**
	* Methode voor het aanpassen van het Geslacht van de persoon
	*/	
    public void setGeslacht(char persoonGeslacht)
    {
        if(persoonGeslacht == 'm' || persoonGeslacht == 'v')
        {
            geslacht = persoonGeslacht;
        }
        else
        {
            System.out.println("Geslacht is niet mogelijk..");
        }
    }
    
        
    /**
	* Methode voor het afdrukken van alle gegevens
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
        if(geslacht == 'm')
        {
            temp = "Man";
        }
        else if(geslacht == 'v')
        {
            temp = "Vrouw";
        }
        else
        {
            temp = "onbekend";
        }
        return temp;
    }
    
    /**
	* Methode voor het krijgen van het GeboorteDatum van de persoon
	*/	
    public String getGeboorteDatum() 
    {
       String temp;
       if (geboorteDag==0 && geboorteMaand==0 && geboorteJaar==0) 
       {
           temp="Onbekend";
        } else 
        {
            temp=geboorteDag+"/"+geboorteMaand+"/"+geboorteJaar;
        }
        return temp;
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
}