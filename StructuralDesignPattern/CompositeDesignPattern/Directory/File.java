package SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.CompositeDesignPattern.Directory;

public class File implements FileSystem {
    String fileName;

    File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void ls() {
        System.out.println("File: " + fileName);
    }
}
