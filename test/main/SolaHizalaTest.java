package main;

import javax.swing.JTextPane;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author isgun
 */
public class SolaHizalaTest {
    
    public SolaHizalaTest() {
    }

    /**
     * Test of hizala method, of class SolaHizala.
     */
    @Test
    public void testHizala() {
        JTextPane textarea = new JTextPane();
        SolaHizala instance = new SolaHizala();
        JTextPane expResult = textarea;
        JTextPane result = instance.hizala(textarea);
        assertEquals(expResult, result);
    }
    
}
