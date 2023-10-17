package src.lr1;

public class Example21_18 {

    static double a = 10.0, b = 4.0, c;

    public static double hyp() {
        return c = Math.sqrt(a * a + b * b);
    }

    public static double pow() {
        return c = Math.exp(b * Math.log(a));
    }

    public static void main(String[] args) {

        System.out.println("katet a=" + a);
        System.out.println("katet b=" + b);
        System.out.println("hypotenuse c=" + hyp());
        System.out.printf("a^b = %.3f", pow());
    }
}