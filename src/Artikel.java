/**
 * Een klasse voor artikellen die bestelt kunnen worden in de kantine.
 * 
 * @author (Ewoud && Mathijs) 
 * @version (19-11-2013)
 */
public class Artikel 
	{
	private String naam;
	private int prijs;
	
	/**
	* Constructor voor een object van de klasse Artikel
	*/
	public Artikel(String artikelNaam, int artikelPrijs)
    {
        naam = artikelNaam;
        prijs = artikelPrijs;
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
	public int getPrijs()
	{
		return prijs;
	}
	/**
	* Methode voor het aanpassen van de naam van dat artikel
	*/	
	public void setNaam(String newNaam)
	{
		naam = newNaam;
	}
	/**
	* Methode voor het aanpassen van de prijs van dat artikel.
	*/	
	public void setPrijs(int newPrijs)
	{
		prijs = newPrijs;
	}
}