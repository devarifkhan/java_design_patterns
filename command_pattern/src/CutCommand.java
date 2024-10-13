class CutCommand implements Command {
    private TextEditor textEditor;

    public CutCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.cut();
    }

    @Override
    public void undo() {
        textEditor.undoCut();
    }
}
