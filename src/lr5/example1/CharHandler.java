package src.lr5.example1;

public class CharHandler {
    private static char symbol = '0';

    public static void setSymbol(char newSymbol) {
        symbol = newSymbol;
    }

    public static int getSymbol() {
        return (int) symbol;
    }

    public static void printChar() {
        System.out.printf("Печать с помощью внешнего класса. Символ: %s. Его код: %d", symbol, (int) symbol);
    }
}
