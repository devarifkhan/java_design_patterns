//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        CommandManager commandManager = new CommandManager();

        Command copy = new CopyCommand(textEditor);
        Command cut = new CutCommand(textEditor);
        Command paste = new PasteCommand(textEditor);

        commandManager.executeCommand(copy);
        commandManager.executeCommand(cut);
        commandManager.executeCommand(paste);

        System.out.println("\nআবেদন করুন Undo:\n");
        commandManager.undoCommand();
        commandManager.undoCommand();
        commandManager.undoCommand();
    }
}