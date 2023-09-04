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
    private BigDecimal pricekm;

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
     public float totalprice(){
        return totaldisc();
     }
     private float totaldisc(){
        float price = getkm() * getpricekm().floatValue();
        if (userAge >= 65){
            price -= price/100 * getdisc_over().floatValue();
        }
        if (userAge <= 18){
            price -= price/100 * getdisc_under().floatValue();
        }
        if (flexible){
            price += price * 0.10;
        }
        return  price;
     }

    public LocalDate getExpirationDate() {
        if (flexible) {
            return this.localDate.plusDays(flex_date);
        }
        return this.localDate.plusDays(date);
    }

    public LocalDate getLocalDate() {
        return localDate;
    }
    public boolean isFlexible(){
        return flexible;
    }
    public BigDecimal getpricekm() {
        return pricekm;
    }
    public BigDecimal getdisc_over(){
        return disc_over;
    }
    public static BigDecimal getdisc_under() {
        return disc_under;
    }

    private int getkm() {
        return km;
    }

    private void setkm(int km) throws Exception {
        if(!validkm(km)){
            throw new Exception("invalid km");
        }
        this.km = km;
    }
    public int getuserAge() {
        return userAge;
    }

    private void setuserAge(int userAge) throws Exception {
        if(!validage(userAge)){
            throw new Exception("invalid age");
        }this.userAge = userAge;
    }
    private void setlocalDate(LocalDate now) {
    }
    private void setflexible(String flexible) {
    }




    @Override
    public String toString() {
        return "km; " + getkm()
                + "age: " + getuserAge()
                + "flex expiration date: " + isFlexible()
                + "expiration date: " + getExpirationDate()
                + "price: " + totalprice();
    }
}