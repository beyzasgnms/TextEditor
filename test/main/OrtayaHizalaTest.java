package main;

import javax.swing.JTextPane;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author isgun
 */
public class OrtayaHizalaTest {
    
    public OrtayaHizalaTest() {
    }

    /**
     * Test of hizala method, of class OrtayaHizala.
     */
    @Test
    public void testHizala() {
        JTextPane textarea = new JTextPane();
        OrtayaHizala instance = new OrtayaHizala();
        JTextPane expResult = textarea;
        JTextPane result = instance.hizala(textarea);
        assertEquals(expResult, result);
    }
    
}
