package javaoop.challengeFabrizio;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        /**
         * Crea delle classi che rappresentino una il paragrafo, il link, un paio di tag scegliendo alcuni
         * che possano contenere figli e altri che non ne possano contenere e alla fine tutti questi tag
         * devono avere un metodo print o tostring.
         *
         * L'obiettivo è che dato il tag principale lui ti crea la stringa
         * html partendo da lui fino all'ultimo figlio. Avrai bisogno della ricorsione, tecnica usata per strutture
         * alberate.
         */

        Paragrafo paragrafo = new Paragrafo();

        System.out.println(paragrafo.toString());

        Tag tag = new Tag("link");
        tag.setAttribute("rel", "stylesheet");
        tag.setAttribute("pippo", "pollo");
        tag.print();
    }
}
