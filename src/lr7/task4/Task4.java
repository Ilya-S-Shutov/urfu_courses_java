package src.lr7.task4;

public class Task4 {

    public char charAttr;

    public Task4(char charAttr) {
        this.charAttr = charAttr;
    }

    public Task4 (Task4 obj) {
        this(obj.charAttr);
    }

    @Override
    public String toString() {
        return '<' + getClass().getSimpleName() + '>' + ":\n\tcharAttr=" + this.charAttr;
    }
}
