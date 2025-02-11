package SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.CompositeDesignPattern.Directory;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {

    private String name;
    private List<FileSystem> fileSystemList;

    public Directory(String name) {
        this.name = name;
        this.fileSystemList = new ArrayList<>();
    }

    public void add(FileSystem fileSystem) {
        fileSystemList.add(fileSystem);
    }

    @Override
    public void ls() {
        System.out.println(name);
        for(FileSystem fileSystem : fileSystemList) {
            fileSystem.ls();
        }
    }
}
