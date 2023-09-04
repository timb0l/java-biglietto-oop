// Consegna: creare una classe Biglietto con due attributi interi: km e età del passeggero.
// Nel costruttore vanno valorizzati entrambi gli attributi, assicurandosi che abbiano valori validi (creare due metodi isValidKm e isValidEta che implementano questa logica). In caso anche solo uno non sia valido, sollevare un’eccezione. Aggiungere tre costanti:
// il costo chilometrico di 21 centesimi di €/km (BigDecimal),
// lo sconto over 65 del 40 % (BigDecimal)
// lo sconto minorenni del 20% (BigDecimal).
// Implementare il metodo public che calcola il prezzo del biglietto comprensivo di eventuale sconto (calcolaPrezzo). Per eseguire il calcolo dello sconto aggiungere un metodo private calcolaSconto, da chiamare dentro al metodo calcolaPrezzo.

import java.math.BigDecimal;
import java.time.LocalDate;

public class biglietto{
    private int km;
    private int userAge;
    private static final BigDecimal price_km = new BigDecimal(0.21);
    private static final BigDecimal disc_over = new BigDecimal(40);
    private static final BigDecimal disc_under = new BigDecimal(20);
    private static final int date = 30;
    private static final int flex_date = 90;
    private LocalDate localDate;
    private boolean flexible;

    public biglietto(int km, int userAge, String flexible) throws Exception{

        setkm(km);
        setuserAge(userAge);
        setlocalDate(localDate.now());
        setflexible(flexible);
    }

    private boolean validkm (int km) throws Exception{
        return km >0;
    }

    private boolean validage(int userAge) {
        return userAge <= 100 &&userAge > 0;
    }



    private void setkm(int km) {
    }
    private void setuserAge(int userAge) {
    }
    private void setlocalDate(LocalDate now) {
    }
    private void setflexible(String flexible) {
    }
}