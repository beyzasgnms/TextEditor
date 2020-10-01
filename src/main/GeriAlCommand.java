package main;

import javax.swing.JTextPane;

public class GeriAlCommand implements UndoableCommand {
    
    protected JTextPane textarea;
    
    public GeriAlCommand(JTextPane textarea) {
        this.textarea = textarea;
    }
    
    @Override
    public void execute() {
        undo();
    }
    
    @Override
    public void undo() {
        int lastIndex = textarea.getText().length() - 1;
        StringBuilder sb = new StringBuilder();
        sb.append(textarea.getText());
        sb.deleteCharAt(lastIndex);
        textarea.setText(sb.toString());
    }
}
