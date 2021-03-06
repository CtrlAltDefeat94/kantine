import java.util.*;
public class KantineSimulatie 
{
    // kantine
    private Kantine kantine;
    // kantineaanbod
    private KantineAanbod kantineaanbod;
    // random generator
    private Random random;
    // aantal artikelen
    private static final int AANTAL_ARTIKELEN=4;
    // artikelen
    private static final String[] artikelnamen=new String[] {"Koffie","Broodje pindakaas", "Broodje kaas","Appelsap"};
    // prijzen
    private static int[] artikelprijzen= new int[]{150, 210, 165, 165};
    // minimum en maximum aantal artikelen per soort
    private static final int MIN_ARTIKELEN_PER_SOORT=10000;
    private static final int MAX_ARTIKELEN_PER_SOORT=20000;
    // minimum en maximum aantal personen per dag
    private static final int MIN_PERSONEN_PER_DAG=50;
    private static final int MAX_PERSONEN_PER_DAG=100;
    // minimum en maximum artikelen per persoon
    private static final int MIN_ARTIKELEN_PER_PERSOON=1;
    private static final int MAX_ARTIKELEN_PER_PERSOON=4;
    
    /**
     * Constructor
     */
    public KantineSimulatie()
    {
        kantine=new Kantine();
        random=new Random();
        int[] hoeveelheden=getRandomArray(AANTAL_ARTIKELEN,MIN_ARTIKELEN_PER_SOORT, MAX_ARTIKELEN_PER_SOORT);
        kantine.setKantineAanbod(artikelnamen, artikelprijzen, hoeveelheden);
    }
    
    /**
     * Methode om een array van random getallen liggend tussen min en max
     * van de gegeven lengte te genereren
     * @param lengte
     * @param min
     * @param max
     * @return De array met random getallen
     */
    private int[] getRandomArray(int lengte, int min, int max)
    {
        int[] temp=new int[lengte];
        for(int i=0;i<lengte;i++) 
        {
            temp[i]=getRandomValue(min, max);
        }
        return temp;
    }
    /**
     * Methode om een random getal tussen min(incl) en
     * max(incl) te genereren.
     * @param min
     * @param max
     * @return Een random getal
     */
    private int getRandomValue(int min, int max) 
    {
        return random.nextInt(max-min+1)+min;
    }
    
    /**
     * Methode om op basis van een array van indexen voor de array
     * artikelnamen de bijhorende array van artikelnamen te maken
     * @param indexen
     * @return De array met artikelnamen
     */
    private String[] geefArtikelNamen(int[] indexen) 
    {
        String[] artikelen=new String[indexen.length];
        for(int i=0;i<indexen.length;i++) 
        {
            artikelen[i]=artikelnamen[indexen[i]];
        }
        return artikelen;
    }
    
    /**
     * Deze methode simuleert een aantal dagen in het
     * verloop van de kantine
     * @param dagen
     */
    public void simuleer(int dagen) 
    {
        for(int i=0;i<dagen;i++) {
            int aantalPersonen= getRandomValue(MIN_PERSONEN_PER_DAG, MAX_PERSONEN_PER_DAG);
            for(int j=0;j<aantalPersonen;j++) {
                Persoon persoon = new Persoon();
                persoon.pakDienblad(new Dienblad());
                int[] tePakken=getRandomArray(AANTAL_ARTIKELEN, 0, AANTAL_ARTIKELEN-1);
                String[] artikelen=geefArtikelNamen(tePakken);
                kantine.loopPakSluitAan(persoon, artikelen);
                updateArtikelVoorraad(artikelen);
            }
            kantine.verwerkRijVoorKassa();
            int dag = i + 1;
            System.out.println("Dag: " + dag + "");
            System.out.println("Aantal klanten: " + aantalPersonen);
            int centen = kantine.getKassa().hoeveelheidGeldInKassa() % 100;
            int euros = kantine.getKassa().hoeveelheidGeldInKassa() / 100;
            System.out.println("Totaal geld: " + euros + "." + centen);
            System.out.println("Aantal artikelen verkocht: "+ kantine.getKassa().getAantalArtikelen());
            System.out.println("");
            kantine.getKassa().resetKassa();
        }
    }
    
    /**
     * Methode voor het updaten van de voorraad
     */
    private void updateArtikelVoorraad(String[] artikelen)
    {
        for(String artikel : artikelen)
        {
            // Check of voorraad onder minimum voorraad ligt
            if(kantine.getKantineAanbod().getArrayList(artikel).size() < MIN_ARTIKELEN_PER_SOORT)
            {
                // Verhoog de voorraad aan in KantineAanbod 
                kantine.getKantineAanbod().updateArtikelVoorraad(artikel, MIN_ARTIKELEN_PER_SOORT);
            }
        }
    }
}