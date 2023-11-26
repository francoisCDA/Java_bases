package org.example.exercice.morpion;

public class vCoord {

    Coord coord;
    int score;

    public vCoord(Coord coord, int score) {
        this.coord = coord;
        this.score = score;
    }

    @Override
    public String toString() {
        return "\nvCoord{" +
                "coord=" + coord +
                ", score=" + score +
                '}';
    }
}
