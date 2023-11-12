package src.lr5.example4;

public class TestClass4 {
    private int num;
    private char sym;

    public TestClass4(int num, char sym) {
        this.sym = sym;
        this.num = num;
    }

    public TestClass4(double value) {
        int intPart = (int) value;
        int fracPart = (int) ((value - intPart) * 100);
        this.sym = (char) intPart;
        this.num = fracPart;
    }

    public void printNumbers() {
        System.out.printf("Значения полей: символьное — %s, численное — %d\n", this.sym, this.num);
    }
}
