import java.util.ArrayList;

public class Cards {

    private ArrayList<String> cards = new ArrayList<>();

    public ArrayList<String> draw (int nbCards) throws MyException {
        if (nbCards > 4) {
            throw new MyException("tricheur !!!");
        }
        return new ArrayList<>();
    }
    
    public void trade(int nbCards) {
        if (nbCards > 2) {
            throw new SecondException("moins de 2 cartes !!! ");
        }
        return ("voilà vos cartes");
    }

}


