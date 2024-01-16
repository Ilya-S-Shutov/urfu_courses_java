package src.lr7.task5;

public class Task5sub2 extends Task5 {

    private char charAttr;

    public Task5sub2(String str, char newChar){
        super(str);
        this.charAttr = newChar;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("\t%s\n", this.getCharAttr());
    }

    public char getCharAttr() {
        return charAttr;
    }

    public void setCharAttr(char charAttr) {
        this.charAttr = charAttr;
    }

}
