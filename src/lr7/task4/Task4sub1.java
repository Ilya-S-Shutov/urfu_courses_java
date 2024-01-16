package src.lr7.task4;

public class Task4sub1 extends Task4 {

    public String strAttr;

    public Task4sub1(char charAttr, String strAttr) {
        super(charAttr);
        this.strAttr = strAttr;
    }

    public Task4sub1 (Task4sub1 obj) {
        this(obj.charAttr, obj.strAttr);
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tstrAttr=" + this.strAttr;
    }
}
