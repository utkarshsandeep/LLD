package SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.CompositeDesignPattern.Directory;

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory("Root");
        FileSystem file1 = new File("leaf1");
        Directory file2 = new Directory("subDir1");
        File file3 = new File("leaf2");
        File file4 = new File("leaf3");
        file2.add(file3);
        file2.add(file4);
        directory.add(file1);
        directory.add(file2);
        directory.ls();
    }
}
