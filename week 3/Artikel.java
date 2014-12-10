/**
 * Een klasse voor artikellen die bestelt kunnen worden in de kantine.
 * 
 * @author (Ewoud && Mathijs) 
 * @version (05-12-2014)
 */
public class Artikel 
{
    private String naam;
	private double prijs;
	
	/**
	* Constructor voor een object van de klasse Artikel
	*/
	public Artikel(String artikelNaam, double artikelPrijs)
    {
        this.naam = artikelNaam;
        this.prijs = artikelPrijs;
    }
	
    /**
    * Constructor voor een object van de klasse Artikel 
    */
    public Artikel()
    {
       this.naam = naam;
       this.prijs = prijs;
    }
	
	/**
	* Methode voor het krijgen van de naam van dat artikel
	*/	
	public String getNaam() 
	{
		return naam;
	}
	
	/**
	* Methode voor het krijgen van de prijs van dat artikel
	*/	
	public double getPrijs()
	{
		return prijs;
	}
	
	/**
	* Methode voor het aanpassen van de naam van dat artikel
	*/	
	public void setNaam(String newNaam)
	{
		this.naam = newNaam;
	}
	
	/**
	* Methode voor het aanpassen van de prijs van dat artikel.
	*/	
	public void setPrijs(double newPrijs)
	{
		this.prijs = newPrijs;
	}
	
	/**
    * Methode voor het afdrukken van het artikelnaam en de prijs
    */  
    public void drukAf()
    {
        System.out.println("Artikel naam: " + naam);
        System.out.println("Prijs: " + prijs);
    }
	
}