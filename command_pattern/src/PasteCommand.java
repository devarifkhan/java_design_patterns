class PasteCommand implements Command {
    private TextEditor textEditor;

    public PasteCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.paste();
    }

    @Override
    public void undo() {
        textEditor.undoPaste();
    }
}
