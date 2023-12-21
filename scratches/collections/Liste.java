import java.util.ArrayList;

class Liste {
    public static void main(String[] args) {

        // ArrayList<Type> <nom> = new ArrayList<type>() ;

        ArrayList<String> prenoms = new ArrayList<String>();

        // ajouter des éléments .add()

        prenoms.add("toto");
        prenoms.add("titi");
        prenoms.add("tutu");
        prenoms.add("tata");

        // récupérer un élément .get()

        System.out.println(prenoms.get(0));
        System.out.println(prenoms.get(1));
        System.out.println(prenoms.get(2));
        System.out.println(prenoms.get(3));

        // changer un élément .set(idx,valeur)

        prenoms.set(1,"Nassim");

        // supprimer un élément, .remove()
        // connaire la taille, .size()

        System.out.println(prenoms.size());
        prenoms.remove(0);
        System.out.println(prenoms.size());

        // parcourir boucle for

        for (int cpt = 0 ; cpt < prenoms.size() ; cpt++) {
            System.out.println(prenoms.get(cpt));
        }

        // parcourrir bouvle foreach

        for (String prenom:prenoms) {
            System.out.println(prenom);
        }




    }
}