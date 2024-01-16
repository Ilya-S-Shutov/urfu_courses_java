package src.lr7.task5;

public class Task5sub1 extends Task5 {

    private int intAttr;

    public Task5sub1(String str, int newInt){
        super(str);
        this.intAttr = newInt;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("\t%d\n", this.getIntAttr());
    }

    public int getIntAttr() {
        return intAttr;
    }

    public void setIntAttr(int intAttr) {
        this.intAttr = intAttr;
    }

}
