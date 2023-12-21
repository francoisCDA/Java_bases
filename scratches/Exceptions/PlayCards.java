class Scratch {
    public static void main(String[] args) {


        Cards cards = new Cards();

        cards.trade(50); // erreur non gérée -> va créer un problème

        try {
            cards.draw(5);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }


    }
}