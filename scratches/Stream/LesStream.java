import org.example.Exercices.PFonctionelle.Produits;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LesStream {

    public static void main(String[] args) {
        List<Produits> mesProduits = new ArrayList<>();

        mesProduits.add(new Produits("truc",12,"inclassable"));
        mesProduits.add(new Produits("truc1",10,"inclassable"));
        mesProduits.add(new Produits("truc2",120,"inclassable"));
        mesProduits.add(new Produits("truc3",20,"classable"));
        mesProduits.add(new Produits("truc4",18,"classable"));
        mesProduits.add(new Produits("truc5",100,"classable"));

        System.out.println(mesProduits.stream().filter( p -> p.getPrix() >15));
        System.out.println(mesProduits.stream().map(p -> p.getPrix()).collect(Collectors.toList()));
        mesProduits.forEach(System.out::println);
        mesProduits.stream().forEach(System.out::println);
        mesProduits.stream().forEach( p -> System.out.println(p));
        
    }


}