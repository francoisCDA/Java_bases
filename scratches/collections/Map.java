import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

class Scratch {
    public static void main(String[] args) {

        // SortedMap

        SortedMap<String,Integer> sortedMap = new TreeMap<>();

        sortedMap.put("Java",20);
        sortedMap.put("C++",230);
        sortedMap.put("Python",150);
        sortedMap.put("JavaScript",3);
        // sortedMap.put("Java",20); doublon interdit

        System.out.println("SortedMap : " + sortedMap); // trié par la clé

        // méthodes

        System.out.println(" 1 Clés du sortedMap : " + sortedMap.keySet()); // renvoie les clé dans un Set
        System.out.println(" 2 valeurs du sorted Map : " + sortedMap.values());
        System.out.println(" 3 supprimer une entrée avec sa clé 'Java' : ");
        sortedMap.remove("Java");
        System.out.println("SortedMap après suppression : " + sortedMap);

        // parcour du tableau
        for (String k: sortedMap.keySet()) {
            System.out.println( "Clé " + k + " valeur : " + sortedMap.get(k));
        }

        for (Integer value: sortedMap.values()) {
            System.out.println(value);
        }


        // HashMap

        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Java",20);
        hashMap.put("C++",230);
        hashMap.put("Python",150);
        hashMap.put("JavaScript",3);
        //hashMap.put("JavaScript",30);
        //hashMap.put("JavaScript",3); doublons interdits

        System.out.println("\n HashMap : " + hashMap); // sortie par ordre des clés de hachage

        // méthode
        System.out.println("1. Taille du hashmap : " + hashMap.size());
        System.out.println("2. Valeur associée à la clé 'Java' : "+ hashMap.get("Java") );
        System.out.println("3. La clé 'JavaScript' est t elle présentes" + hashMap.containsKey("JavaScript"));

        System.out.println("Suppression de l'entrée avec la clé Python");
        hashMap.remove("Python");
        System.out.println("\taprès suppression : " + hashMap);


    }
}