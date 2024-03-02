package javaoop;

import java.util.List;
import java.util.Random;

public class JavaFirsCheckpoint {
    /**
     *
     *  JAVA 12 CHECKPOINT N.1
     */
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * Scrivi una classe Java in un file separato che rappresenta un conto bancario,
     * con attributi come saldo e numero di conto.
     * Implementa un costruttore per inizializzare il saldo e il numero di conto e i metodi per depositare e prelevare denaro dal conto.
     * Il conto bancario non può andare in scoperto, la banca non ha concesso credito su questo conto.
     */
    public static void exercise1() {

        Conto conto = new Conto("hsjaka19228", 10_000.0);

        conto.preleva(11_000.0);
        System.out.println(conto.getSaldo());
        //conto.deposita(700.0);
        //System.out.println(conto.getSaldo());


    }

    /**
     * Generatore di nomi di band:
     * Crea un metodo che generi casualmente i nomi delle band.
     * Il metodo deve essere in grado di generare nomi basati su alcune categorie come "aggettivo + sostantivo" o "nome città + nome colore".
     * Puoi utilizzare gli elenchi di parole predefiniti o creare i tuoi elenchi personalizzati.
     */
    public static void exercise2() {
        final List<String> AGGETTIVI = List.of("Amazing", "Bold", "Creative", "Daring", "Elegant", "Fantastic", "Great", "Incredible", "Jazzy", "Killer", "Luminous", "Majestic", "Nimble", "Outstanding", "Powerful", "Quirky", "Radiant", "Sleek", "Terrific", "Unique", "Vibrant", "Witty", "Xenial", "Youthful", "Zany");
        final List<String> SOSTANTIVI = List.of("Art", "Beauty", "Craft", "Design", "Energy", "Fashion", "Guru", "Health", "Intelligence", "Joy", "Kindness", "Luxury", "Mastery", "Nature", "Opulence", "Passion", "Quality", "Radiance", "Simplicity", "Technology", "Uniqueness", "Vision", "Wisdom", "X-Factor", "Youth", "Zen");


        //System.out.println(nomeBand(AGGETTIVI, SOSTANTIVI));

        for (int i = 0; i < 5; i++) {
            System.out.println(nomeBand(AGGETTIVI, SOSTANTIVI));
        }
    }

    public static String nomeBand(List<String> a, List<String> b){

        Random random = new Random();
        String aggettivi = a.get(random.nextInt(a.size()));
        String sostantivi = b.get(random.nextInt(b.size()));
        String nome = aggettivi + " " + sostantivi;


        return nome;

    }

    /**
     * Scrivi un metodo che prenda una stringa come input e restituisca la stessa stringa,
     * ma con le parole in ordine inverso. Per esempio,
     * se la stringa di input è "ciao come stai",
     * il metodo restituirà "stai come ciao".
     * Stampa il risultato in console.
     */
    public static void exercise3() {

        System.out.println(inversa("! World Hello"));

    }

    public static String inversa(String stringa){

        String [] inversa1 = stringa.split(" ");
        String inversa2 = " ";

        for (int i = inversa1.length - 1; i >= 0 ; i--) {
            inversa2 += inversa1[i] + " ";
        }

        return inversa2;

    }


}
