import java.util.LinkedList;
import java.util.SortedSet;
import java.util.TreeSet;

class Scratch {
    public static void main(String[] args) {

        // SortedSet (Treeset)

        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("Java");
        sortedSet.add("Python");
        //sortedSet.add("Python"); doublons interdit
        sortedSet.add("C++");

        System.out.println("SortedDet :  " + sortedSet); // les éléments sont triés

        //Methodes
        System.out.println("1. Premier élément : " + sortedSet.first());
        System.out.println("2. Dernier élément : " + sortedSet.last());

        SortedSet<String> headSet = sortedSet.headSet("Python");
        System.out.println("3 Sous ensemble avant python : "  );

        SortedSet<String> tailSet = sortedSet.tailSet("Python");
        SortedSet<String> subSet = sortedSet.subSet("Python","Java");



        //linketList

        LinkedList<Double> linkedList = new LinkedList<>();
        linkedList.add(3.14);
        linkedList.add(2.12);
        linkedList.add(4.145);
        linkedList.add(3.14); // accepte les doublons

        System.out.println("LinkedList : " + linkedList); // trié

        System.out.println("1er élément : " + linkedList.getFirst()); //
        System.out.println("dernier élément : " + linkedList.getLast()); //

        // supression 1er élément
        linkedList.removeFirst();




    }
}
















