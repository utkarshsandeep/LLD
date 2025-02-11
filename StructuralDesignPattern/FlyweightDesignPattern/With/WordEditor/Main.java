package SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.FlyweightDesignPattern.With.WordEditor;

public class Main {
    public static void main(String[] args) {
        Letter documentLetter = DocumentFactory.getChar('a', "Arial", 12);
        documentLetter.position(0,1);
        Letter documentLetter1 = DocumentFactory.getChar('b', "Arial", 12);
        documentLetter1.position(0,2);
        Letter documentLetter2 = DocumentFactory.getChar('a', "Arial", 12);
        documentLetter2.position(0,3);


    }
}
