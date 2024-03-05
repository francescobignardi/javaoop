package javaoop.Geometria;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Figura> lista = new ArrayList<>();
        lista.add(new Triangolo(33.5, 20.5, 40.5));
        lista.add(new Rettangolo(20.5, 40.6));
        lista.add(new Cerchio(13.7));

        print(lista);
    }

    public static void print(List<Figura> lista){
        for(Figura i : lista){
            System.out.println("Nome: " + i.getNome() + ", perimetro: ");
            i.Perimetro();
        }
        for(Figura i : lista){
            System.out.println("Nome: " + i.getNome() + ", area: ");
            i.Area();
        }
    }
}
