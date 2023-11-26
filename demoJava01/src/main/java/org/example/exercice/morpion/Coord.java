package org.example.exercice.morpion;

public class Coord {
    int i,j;

    Coord(int i, int j) {
        this.i = i ;
        this.j = j ;
    }

    @Override
    public String toString() {
        return "Coord{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }
}

