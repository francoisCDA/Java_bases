package org.example;

import org.example.exercice.*;
import org.example.exercice.exoPoo.TpClassChaise.Chaise;
import org.example.exercice.exoPoo.TpClassChaise.tpHeritage.Person;
import org.example.exercice.exoPoo.TpClassChaise.tpHeritage.Student;
import org.example.exercice.exoPoo.TpClassChaise.tpHeritage.Teacher;
import org.example.exercice.exoPoo.TpClassChaise.tpHeritageHouse.Apartment;
import org.example.operator.Operator;
import org.example.poo.Product;
import org.example.readFromConsole.ReadFromConsole;
import org.example.string.ChaineCharactere;
import org.example.structure.Structure2;
import org.example.variable.Variable;


public class Main {

    public static void affichageChaise(int nbPieds, String materieau, String couleur) {
        System.out.println("\n------------------------ Affichage d'un nouvel objet ------------------------\n");
        System.out.printf("Je suis une Chaise, avec %d pieds en %s et de couleur %s\n",nbPieds,materieau,couleur);
        System.out.println("\n-----------------------------------------------------------------------------\n");
    }


    public static void main(String[] args) {

        String phrase = "Une chaine de caractère label rouge";
        String mot = "structuration";
        String mot2 = "poissblimi";

        //Variable.getVariable();

        //Operator.getOperator();

        //Operator.getExpression();

        //ReadFromConsole.getReadWrite();

        //Exercice.exo2_2();

        //Exercice.exo2_3();

        //Exercice.exo2_4();

        //Exercice.exo3_1();

        //Exercice.exo3_2();

        //Exercice.exo3_3();

       // Structure2.getBouclFor();

        //Structure2.getBreakContinue();
        //ExoConditionsStructurelles.exo5_1();
        //ExoConditionsStructurelles.exo5_2();
        //ExoConditionsStructurelles.exo5_3();
        //ExoConditionsStructurelles.exo5_4();
        //ExoConditionsStructurelles.exo5_5();
        //ExoConditionsStructurelles.exo5_6();
        //ExoConditionsStructurelles.exo5_7();
        //ExoConditionsStructurelles.exo5_7_2();
        //ExoConditionsStructurelles.exo5_8();
        //ExoConditionsStructurelles.exo5_9();
        //ExoConditionsStructurelles.exo5_10();
        //ExoConditionsStructurelles.exo5_11();

        //ChaineCharactere.getStringFunction();
        //ChaineCharactere.getComparaisonString();
        //ChaineCharactere.getFormatString();



//        ExoString.getExo1(phrase);
  //      ExoString.getExo2(mot,'i');
    //    ExoString.getExo3(mot,mot2);
    //    ExoString.getExo3("crime","merci");
     //   ExoString.getExo3("crime","merki");

      //  ExoString.getExo4("radar");
      //  ExoString.getExo4("salut");

      //  ExoString.getExo5();
      //  ExoString.getExo5_bis();

       // Matrix.getMatrix();
       // Matrix.getMatrix2();

       // org.example.exercice.Matrix.getExo2();

       // Matrix.getExo3();

       // Jeux.getPendu(mot);

       // ExoFunction.getExo1();
       // ExoFunction.getExo2();
       // ExoFunction.getExo3();
       // ExoFunction.getExo4();
        //ExoFunction.getExo7();

       // Product p = new Product();

       // p.setId(55668);
       // p.setName("Truc");

       // System.out.println(p);

       // Product p2 = new Product(12544,"Machin");

       // System.out.println(p2);
       // System.out.println(p2.getName());

        Chaise chaise1 = new Chaise(4,"Bois","Bleu");
        Chaise chaise2 = new Chaise(4,"Métal","Blanche");
        Chaise chaise3 = new Chaise(1, "Pléxiglass","Transparente");

        affichageChaise(chaise1.getNbPieds(),chaise1.getMateriaux(),chaise1.getCouleur());
        affichageChaise(chaise2.getNbPieds(),chaise2.getMateriaux(),chaise2.getCouleur());
        affichageChaise(chaise3.getNbPieds(),chaise3.getMateriaux(),chaise3.getCouleur());

        Person perso = new Person();
        perso.sayHello();

        Student stud = new Student(15);
        stud.GoToClasses();
        stud.sayHello();
        stud.DisplayAge();

        Teacher teach = new Teacher(40);
        teach.sayHello();
        teach.Explain();


        org.example.exercice.exoPoo.TpClassChaise.tpHeritageHouse.Person toto = new org.example.exercice.exoPoo.TpClassChaise.tpHeritageHouse.Person("Thomas");

        toto.setMaison(new Apartment());

        toto.PeindreSaPorte("bleu");

        toto.Presentation();

    }

}