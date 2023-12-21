import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Date {
    public static void main(String[] args) {

        LocalDate dateDuJour = LocalDate.now();

        System.out.println("Date du jour : " + dateDuJour); 
        
        // date chosie :
        
        LocalDate dateChosie = LocalDate.of(2024,6,21);
        System.out.println("Date fixée : " + dateChosie);
        
        // récupération d'élément de la date
        
        int anneeEnCour = dateDuJour.getYear();
        int moisEnCour = dateDuJour.getMonthValue();
        int jour = dateDuJour.getDayOfMonth();

        System.out.println("Nous somme le "+ jour + " " + moisEnCour + " " + anneeEnCour);
        
        
        //Ajouter ou soustraire des jours 
        
        LocalDate dateDansTroisJours = dateDuJour.plusDays(3);

        System.out.println("date dans 3 jours " + dateDansTroisJours);
        System.out.println(dateDuJour.isBefore(dateDansTroisJours));
        System.out.println(dateDuJour.isAfter(dateDansTroisJours));
        System.out.println(dateDuJour.isEqual(dateDansTroisJours));
        
        
        LocalDate dateMoinsTroisJours = dateDuJour.minusDays(3);
        System.out.println(dateDuJour.isBefore(dateMoinsTroisJours));
        System.out.println(dateDuJour.isAfter(dateMoinsTroisJours));
        System.out.println(dateDuJour.isEqual(dateMoinsTroisJours));

        // formatage de date
        
        String uneDate = "2023-01-25";
        
        LocalDate dateSaisie = LocalDate.parse(uneDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        System.out.println(dateSaisie);
        

    }
}