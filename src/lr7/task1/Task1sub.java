package src.lr7.task1;

public class Task1sub extends Task1{


    private String attr2;

    public Task1sub(String stringAttr1, String stringAttr2) {
        super(stringAttr1);
        this.attr2 = stringAttr2;
    }

    public Task1sub(String stringAttr) {
        super(stringAttr);
        this.attr2 = stringAttr;
    }

    @Override
    public String toString() {
        return super.toString() + ", \"" + this.getAttr2() + "\"";
    }


    public String getAttr2() {
        return attr2;
    }

    public void setAttr2(String attr2) {
        this.attr2 = attr2;
    }
}
