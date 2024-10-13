class CopyCommand implements Command {
    private TextEditor textEditor;

    public CopyCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.copy();
    }

    @Override
    public void undo() {
        textEditor.undoCopy();
    }
}
