package src.lr7.task3;

public class Task3 {

    public int intAttr;

    public Task3(int intAttr) {
        this.intAttr = intAttr;
    }

    public void setAttrs(int intAttr) {
        this.intAttr = intAttr;
    }

    @Override
    public String toString() {
        return '<' + getClass().getSimpleName() + '>' + ":\n\tintAttr=" + this.intAttr;
    }
}
