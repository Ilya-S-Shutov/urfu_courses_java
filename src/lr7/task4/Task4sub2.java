package src.lr7.task4;

public class Task4sub2 extends Task4sub1 {

    public int intAttr;

    public Task4sub2(char charAttr, String strAttr, int intAttr) {
        super(charAttr, strAttr);
        this.intAttr = intAttr;
    }

    public Task4sub2 (Task4sub2 obj){
        this(obj.charAttr, obj.strAttr, obj.intAttr);
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tintAttr=" + this.intAttr;
    }
}
