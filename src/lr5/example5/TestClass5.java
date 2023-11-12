package src.lr5.example5;

public class TestClass5 {

    private int num;

    public TestClass5() {
        this.num = 0;
    }

    public TestClass5(int num) {
        this.num = Math.min(num, 100);
    }

    public void setNum() {
        this.num = 0;
    }

    public void setNum(int num) {
        this.num = Math.min(num, 100);
    }

    public void printNumber() {
        System.out.printf("Значения поля: %d\n", this.num);
    }
}
