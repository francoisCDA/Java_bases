package org.example.variable;

public class Matrix {

    static int[][] matrix = {{1,2,5},{5,2,6},{7,3,2,5},{12,12,59}};



    public static void getMatrix() {

        System.out.println(matrix[0][2]); // 5

        for (int i = 0 ; i < matrix.length ; i++) {
            for (int j = 0 ; j < matrix[i].length ; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }

    public static void getMatrix2() {
        int[][] tableau = new int[5][12] ; // déclaration d'une matrice

        for (int i = 0 ; i < tableau.length ; i++) {
            for (int j = 0 ; j < tableau[i].length ; j++) {
                tableau[i][j] = i * j ;
            }
        }

        for (int i = 0 ; i < tableau.length ; i++) {
            for (int j = 0 ; j < tableau[i].length ; j++) {
                System.out.printf(" %d ", tableau[i][j] );
            }
            System.out.printf("\n");
        }

    }


}
