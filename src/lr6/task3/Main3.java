package src.lr6.task3;

public class Main3 {
    public static void main(String[] args) {
        int[] numArray = {1, 2, 3, 4, 5, 6};
        System.out.printf("Минимальное: %d\n", Task3.getMin(numArray));
        System.out.printf("Максимальное: %d\n", Task3.getMax(1, 2, 3, 4, 5, 6));
        System.out.printf("Среднее: %.2f\n", Task3.getMean(1, 2, 3, 4, 5, 6));
    }
}
