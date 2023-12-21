class Calculatrice {
    public static void main(String[] args) {

        double totalAddition = MethodeCalcule

    }

    public double addition(double a, double b) {
        return a + b;
    }

    public double soustraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }


    public double calcule(double a, double b, MethodeCalcule methode )  {

    }
}



@FunctionalInterface
interface MethodeCalcule {
    double run(double a,double b);

}