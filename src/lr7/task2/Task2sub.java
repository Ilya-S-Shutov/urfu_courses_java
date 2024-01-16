package src.lr7.task2;

public class Task2sub extends Task2{

    public int intAttr;

    public Task2sub(String newStr, int newInt) {
        super(newStr);
        setAttrs(newInt);
    }

    @Override
    public void setAttrs(String strAttr) {
        super.setAttrs(strAttr);
    }

    public void setAttrs(int intAttr) {
        this.intAttr = intAttr;
    }

    public void setAttrs(String strAttr, int intAttr) {
        super.setAttrs(strAttr);
        this.intAttr = intAttr;
    }

    public void setAttrs() {
        super.setAttrs("");
        this.intAttr = 0;
    }

}
