package main;

import javax.swing.JTextPane;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author isgun
 */
public class IkiYanaHizalaTest {
    
    public IkiYanaHizalaTest() {
    }

    /**
     * Test of hizala method, of class IkiYanaHizala.
     */
    @Test
    public void testHizala() {
        JTextPane textarea = new JTextPane();
        IkiYanaHizala instance = new IkiYanaHizala();
        JTextPane expResult = textarea;
        JTextPane result = instance.hizala(textarea);
        assertEquals(expResult, result);
    }
}
