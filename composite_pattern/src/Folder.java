import java.util.ArrayList;
import java.util.List;

class Folder implements FileComponent {
    private String name;
    private List<FileComponent> fileComponents = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileComponent fileComponent) {
        fileComponents.add(fileComponent);
    }

    public void remove(FileComponent fileComponent) {
        fileComponents.remove(fileComponent);
    }

    @Override
    public void showDetails() {
        System.out.println("Folder: " + name);
        for (FileComponent component : fileComponents) {
            component.showDetails();
        }
    }
}