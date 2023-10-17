package src.lr1;

public class Example21_19 {

    public static double hyp(double a, double b) {
        return (double) Math.sqrt(a * a + b * b);
    }

    public static void main(String[] args) {

        double cathet1 = 10, cathet2 = 4;

        System.out.println("Cathet a = " + cathet1);
        System.out.println("Cathet b = " + cathet2);
        System.out.println("hypotenuse c = " + hyp(cathet1, cathet2));
    }
}