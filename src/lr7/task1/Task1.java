package src.lr7.task1;

public class Task1 {

    private  String attr1;

    public String getAttr1() {
        return attr1;
    }


    public Task1(String stringAttr) {
        this.attr1 = stringAttr;
    }

    @Override
    public String toString() {
        return "<" + getClass().getSimpleName() + ">: \"" + this.getAttr1() + "\"";
    }

}
