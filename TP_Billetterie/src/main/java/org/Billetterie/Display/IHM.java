package org.Billetterie.Display;

import org.Billetterie.Classes.Lieu;
import org.Billetterie.Display.Exceptions.SaisieNull;
import org.Billetterie.Display.Menus.Home;
import org.Billetterie.Display.Menus.MenuSalles;
import org.Billetterie.JDBC.services.ServicesBilleterie;
import org.Billetterie.JSQL.DDBBilletterie;
import org.Billetterie.JSQL.FakeData;
import org.Billetterie.JSQL.MaBilletterie;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;

public class IHM {

    private static Scanner scan = new Scanner(System.in);

    private static DDBBilletterie maBilletterie = MaBilletterie.getBilletterie();

    public static ServicesBilleterie serviceBilleterie = new ServicesBilleterie() ;

    public static void initBilleterie() {

        FakeData.initBilleterie(maBilletterie);
        System.out.println(maBilletterie);
        System.out.println("\n\t *** Billetterie initialisée ***");
    }

    public static void start() {

        H1("bienvenue");

        String[] init = new String[]{"initialiser la BDD", "continer"};

        int choix = menuBilleterie(init);

        if (choix == 1 ) FakeData.initSQL();

        Home.mainMenu();
    }

    private static void menuClient() {
        System.out.println("à implémenter");
        start();
    }

    private static void menuEvent() {
        System.out.println("à implémenter");
        start();
    }

    public static int menuBilleterie(String[] menu)  {
       return menuBilleterie(menu,"Choisir une option");
    }

    public static int menuBilleterie(String[] menu,String titre)  {
        System.out.printf("\n > %s :\n",titre);
        for (int i = 0 ; i < menu.length ; i++ ) {
            System.out.printf("\n\t %d : %s",i+1,menu[i]);
        }

        try {
            int ret = inputNumber("\n\n\t");

            if (ret < 1 || ret > menu.length) {
                consoleFail("Choix innexistant");
                return 0;
            }
            return ret;
        } catch ( SaisieNull e ) {
            consoleError("saisie invalide");
            return 0;
        }

    }

    public static void H1(String titre) {
        System.out.printf("\n\n *** %s ***\n\n",titre.toUpperCase());
    }

    public static String inputText(String label) {
        System.out.printf("\t %s > ",label);
        String ret = scan.nextLine();
        System.out.print("\n");
        return ret;
    }

    public static int inputNumber(String label) throws SaisieNull {

        String saisie = inputText(label);
        int retour ;

        try {
            retour = parseInt(saisie) ;
        } catch (Exception e) {
            throw new SaisieNull("NaN");
        }

        return retour;
    }

    public static void consoleError(String error) {
        System.out.printf("\n\n !!! %s !!!\n",error.toUpperCase());
    }

    public static void consoleConfirm(String log) {
        System.out.printf("\n\t >> %s\n",log);
    }

    public static void consoleFail(String log) {
        System.out.printf("\n\t !! %s\n",log);
    }

    public static void consoleLi(String li) {
        System.out.printf("\t - %s\n",li);
    }

    public static boolean isCourrielFormat(String mail) {

        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern courrielPattern = Pattern.compile(regex);
        Matcher matcher = courrielPattern.matcher(mail);

        return matcher.matches();
    }

    public static boolean isNoNumberChain(String nom) {

        String regex = "^[^0-9]*$";

        Pattern monPattern = Pattern.compile(regex);
        Matcher matcher = monPattern.matcher(nom);

        return matcher.matches();
    }

    public static String capitalize(String noms) {

        StringBuilder retour = new StringBuilder();
        String[] tableNoms = noms.split(" ");

        for (String n:tableNoms) {
            if (!n.isEmpty()) {
                char initiale = Character.toUpperCase(n.charAt(0));
                String nomCapitalised = initiale + n.substring(1);
                retour.append(nomCapitalised + " ");
            }
        }

        return retour.toString().trim();
    }

}
