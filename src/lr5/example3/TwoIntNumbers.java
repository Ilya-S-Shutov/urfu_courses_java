package src.lr5.example3;

public class TwoIntNumbers {
    private int num1, num2;

    public TwoIntNumbers(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public TwoIntNumbers(int num) {
        this.num1 = num;
        this.num2 = num;
    }

    public TwoIntNumbers() {
        this.num1 = 0;
        this.num2 = 0;
    }

    public void printNumber() {
        System.out.printf("Значения целочисленных полей этого экземпляра класса: %d и %d\n", this.num1, this.num2);
    }
}
