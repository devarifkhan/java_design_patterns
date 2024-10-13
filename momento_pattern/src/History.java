import java.util.ArrayList;
import java.util.List;

class History {
    private List<TextEditorMemento> savedStates = new ArrayList<>();

    public void push(TextEditorMemento memento) {
        savedStates.add(memento);
    }

    public TextEditorMemento pop() {
        if (savedStates.size() > 0) {
            return savedStates.remove(savedStates.size() - 1);
        }
        return null;
    }
}