// Creare una classe Biglietteria, che contiene il metodo main in cui:
// ● chiedere all’utente di inserire il numero di km e l’età del passeggero
// ● con quei dati provare a creare un nuovo Biglietto (gestire eventuali eccezioni con try-catch)
// ● stampare a video il prezzo del biglietto calcolato

import java.util.Scanner;

public class biglietteria{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

    while (true) {
        try {
            System.out.print("Insert Km");
            int km = sc.nextInt();

            System.out.print("Insert Age");
            int userAge = sc.nextInt();

            sc.nextLine();
        } catch (Exception e) {

        }
    }

    }
}