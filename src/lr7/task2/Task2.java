package src.lr7.task2;

public class Task2 {
    private String strAttr;

    public Task2(String newStr) {
        setAttrs(newStr);
    }

    public int getStringLen() {
        return getStrAttr().length();
    }

    public void setAttrs(String strAttr) {
        this.strAttr = strAttr;
    }

    public String getStrAttr() {
        return this.strAttr;
    }


}
