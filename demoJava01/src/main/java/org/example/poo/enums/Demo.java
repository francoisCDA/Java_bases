package org.example.poo.enums;

public class Demo {

    public static void main() {

        Priority p = Priority.HIGH;

        switch (p) {
            case HIGH :
                System.out.println("High Priority");
                break;
            case MEDIUM:
                System.out.println("Medium Priority");
                break;
            case LOW:
                System.out.println("Low Priority");
                break;
        }

        Priority p1 = Priority.valueOf("HIGH");

        Priority[] values = Priority.values();
        for (Priority v:values) {
            System.out.println("enum : " + v);
        }


    }

}
