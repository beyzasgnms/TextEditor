package main;

import java.util.Stack;
import javax.swing.JTextPane;

public class UndoCommand implements UndoableCommand {
    
    protected JTextPane textarea;
    protected Stack stack;
    
    public UndoCommand(JTextPane textarea, Stack s) {
        this.textarea = textarea;
        this.stack = s;
    }
    
    @Override
    public void execute() {
        undo();
    }
    
    @Override
    public JTextPane undo() {
        JTextPane newTextArea = textarea;
        String oldText = "";
        try {
        oldText = (String) stack.pop();
        newTextArea.setText(oldText);
        } catch (Exception e) {}
        return newTextArea;
    }
}
