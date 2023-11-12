package src.lr5.example2;

public class CharRange {
    private static char char1 = 'A';
    private static char char2 = '1';

    public static void printSymRow() {
        char first, second;

        if ((int) char1 < (int) char2) {
            first = char1;
            second = char2;
        } else {
            first = char2;
            second = char1;
        }
        System.out.println("Ряд символов:");
        for (int num = first; num <= (int) second; num++) {
            System.out.print((char) num);
        }
    }
}
