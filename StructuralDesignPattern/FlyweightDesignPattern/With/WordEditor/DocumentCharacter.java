package SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.FlyweightDesignPattern.With.WordEditor;

public class DocumentCharacter implements Letter {

    private char c;
    private String fontName;
    private int fontSize;

    public DocumentCharacter(char c, String fontName, int fontSize) {
        this.c = c;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    public char getC() {
        return c;
    }

    public String getFontName() {
        return fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    @Override
    public void position(int x, int y) {

    }
}
