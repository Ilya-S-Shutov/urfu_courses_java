package src.lr7.task5;

public class Task5 {

    private String strAttr;

    public Task5(String str) {
        this.strAttr = str;
    }

    public void printInfo() {
        System.out.printf("<%s>:\n\t%s\n", getClass().getSimpleName(), this.getStrAttr());
    }

    public String getStrAttr() {
        return strAttr;
    }

}
