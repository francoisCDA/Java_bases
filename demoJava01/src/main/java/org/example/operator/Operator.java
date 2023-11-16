package org.example.operator;

public class Operator {

    public static void getOperator() {
        System.out.println( "********* Operateur ***********");

        int i = 10;
        int i2 = -10;

        int i3 = ++i ;  //11
        int i4 = i++ ;  //11
        int i5 = i ;    //12

        int i6 = --i;   //11
        int i7 = i--;   //11
        int i8 = i;     //10

    }

    //region Expression
    public static void getExpression() {

        byte b = 1;
        short s = 1;
        int i = 1;
        long l = 1L;
        float f = 1.0f;
        double d = 1.0;
        char c = 1 ;

        int express0 = b + b ;
        int express1 = b + s ;
        int express2 = b + i + s ;
        long express3 = l + i ;
        float express4 = l + f ;
        double express5 = d + f ;

        int t = 2_000_887_697 ; //max
        int t2 = 2_000_010_000;

        int total = t + t2;

        System.out.println("t + t2 " + total);

    }
    //endregion


    public static void getOperatorAndComparaison() {

        int int1 = 128;
        int int2 = 128;

        System.out.println(" int1 == int2 " + (int1 == int2)); //true

        Integer int3 = 128; // Ineger -> wrapper / enveloppeur
        Integer int4 = 128;

        System.out.println(" int3 == int4 " + (int3 == int4)); //false
        System.out.println(" int3 == int4 " + (int3.intValue() == int4.intValue() )) ; //false
        System.out.println(" int3 equal int4 " + (int3.equals(int4))); //true

        Integer int5 = 127; // Integer -> wrapper / enveloppeur
        Integer int6 = 127;

        System.out.println(" int5 == int6 " + (int5 == int6)); //true car 127 n'est pas stocké, 2 pointeurs vers même emplacement mémoire

        Integer int7 = new Integer(127); // new Integer -> objet
        Integer int8 = new Integer(127);

        System.out.println(" int7 == int8 " + (int7 == int8)); // false car new force une nouvelle allocation mémoire


    }
}
