package SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.FlyweightDesignPattern.With.WordEditor;

import java.util.HashMap;
import java.util.Map;

public class DocumentFactory {
    public static Map<Character, DocumentCharacter> characterCache = new HashMap<>();

    public static DocumentCharacter getChar(char c, String font, int size) {
        if (characterCache.containsKey(c)) {
            return characterCache.get(c);
        } else {
            DocumentCharacter dc = new DocumentCharacter(c, font, size);
            characterCache.put(c, dc);
            return dc;
        }
    }
}
