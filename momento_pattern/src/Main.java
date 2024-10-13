//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();


        editor.setContent("Version 1");
        history.push(editor.save());

        editor.setContent("Version 2");
        history.push(editor.save());

        editor.setContent("Version 3");
        System.out.println("Current Content: " + editor.getContent()); // Output: Version 3


        editor.restore(history.pop());
        System.out.println("After Undo: " + editor.getContent()); // Output: Version 2


        editor.restore(history.pop());
        System.out.println("After Undo: " + editor.getContent()); // Output: Version 1
    }
}