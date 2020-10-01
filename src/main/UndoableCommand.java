package main;

import javax.swing.JTextPane;

public interface UndoableCommand extends Command {
    public JTextPane undo();
}
