package src.lr7.task3;

public class Task3sub2 extends Task3sub1{

    public String strAttr;

    public Task3sub2(int intAttr, char charAttr,  String strAttr) {
        super(intAttr, charAttr);
        this.strAttr = strAttr;
    }

    public void setAttrs(int intAttr, char charAttr, String strAttr) {
        super.setAttrs(intAttr, charAttr);
        this.strAttr = strAttr;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tstrAttr=" + this.strAttr;
    }
}
