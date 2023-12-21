import java.util.InputMismatchException;
import java.util.Scanner;

class Scratch {



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try
        {
            System.out.println("*********** Division ***********");
            System.out.println("Donnez moi un nombre :");
            Integer numerateur = scan.nextInt();
            System.out.println("Donnez moi un diviseur :");
            Integer denumerateur = scan.nextInt();

            double resultat = numerateur / denumerateur ;

            System.out.println("Resultat : " + resultat);
//        }catch ( ArithmeticException | InputMismatchException e) {
//            System.out.println("Une exception attendue !!!");
//
//        }
        }
        catch ( InputMismatchException e) {
            System.out.println("Problème de saisie");

        }
        catch ( ArithmeticException e) {
            System.out.println(e.getMessage());

        }
        catch (Exception e) {
            System.out.println("Une exception improbable !!!");
        }




    }


//    public class App1 {
//        public static int calcul(int a,int b){
//            int c=a/b;
//            return c;
//        }

//        public static void main(String[] args) {
//            Donner a:12
//            Donner b:6
//            Resultat=2
//            Scénario 1
//            Scénario 2
//            Scanner clavier=new Scanner(System.in);
//            System.out.print("Donner a:");int a=clavier.nextInt();
//            System.out.print("Donner b:");int b=clavier.nextInt();
//            int resultat=0;
//            try{
//                resultat=calcul(a, b);
//            }
//            catch (ArithmeticException e) {
//                System.out.println("Divisio par zero");
//            }
//            System.out.println("Resultat="+resultat);
//        }
    }

//    class Compte {
//        private int code;
//        private float solde;
//        public void verser(float mt){
//            solde=solde+mt;
//        }
//        public void retirer(float mt)throws Exception{
//            if(mt>solde) throw new Exception("Solde Insuffisant");
//            solde=solde-mt;
//        }
//        public float getSolde(){
//            return solde;
//        }
    }



}