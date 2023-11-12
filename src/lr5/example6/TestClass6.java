package src.lr5.example6;

public class TestClass6 {

    private int min, max;

    public TestClass6(int num1, int num2) {
        this.min = Math.min(num1, num2);
        this.max = Math.max(num1, num2);
    }

    public TestClass6(int num) {
        this.min = num;
        this.max = num;
    }

    public void setNums(int num1, int num2) {
        this.min = Math.min(this.min, Math.min(num1, num2));
        this.max = Math.max(this.max, Math.max(num1, num2));
    }

    public void setNums(int num) {
        this.min = Math.min(this.min, num);
        this.max = Math.max(this.max, num);
    }

    public void printNumber() {
        System.out.printf("Значения полей: min — %d, min — %d\n", this.min, this.max);
    }
}
