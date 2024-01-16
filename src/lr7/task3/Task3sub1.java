package src.lr7.task3;

public class Task3sub1 extends Task3 {

    public char charAttr;

    public Task3sub1(int intAttr, char charAttr) {
        super(intAttr);
        this.charAttr = charAttr;
    }

    public void setAttrs(int intAttr, char charAttr) {
        super.setAttrs(intAttr);
        this.charAttr = charAttr;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tcharAttr=" + this.charAttr;
    }
}
