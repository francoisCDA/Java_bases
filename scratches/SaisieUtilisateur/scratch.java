import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir un entier : ");
        int num = scanner.nextInt();
        scanner.nextInt(); // nettoyer la console. 
        System.out.println("Nombre saisie : " + num);

        System.out.println("Saisir une chaine : ");
        String str = scanner.nextLine();

        System.out.println("Vous avez saisie : " + str);
        
        
        
    }
}