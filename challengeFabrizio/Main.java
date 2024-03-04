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

        EmptyTag tag = new EmptyTag("link");
        tag.setAttribute("rel", "stylesheet");
        tag.setAttribute("pippo", "pollo");
        tag.print();

        System.out.println("\n");

        ContainerTag tag1 = new ContainerTag("div");
        tag1.setAttribute("prova", "prova");
        tag1.addTag(new ContainerTag("Fabrizio"));
        tag1.addTag(new ContainerTag("Francesco"));
        tag1.setAttribute("prova1", "prova1");
        tag1.setAttribute("prova3", "prova3");
        tag1.print();
    }
}
