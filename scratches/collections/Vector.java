import java.util.Vector;

class Scratch {


    public static void main(String[] args) {
        // vector

        Vector<String> vector = new Vector<>();

        vector.add("Pomme");
        vector.add("Poire");
        vector.add("Tomate");

        System.out.println("Vector : " + vector);

        System.out.println("taille du vecteur : " + vector.size());
        System.out.println("element à l'index 1 : " + vector.get(1));
        System.out.println("est ce que Poire est présent : " + vector.contains("Poire"));

    }
}