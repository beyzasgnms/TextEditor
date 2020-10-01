package main;

import javax.swing.JTextPane;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author isgun
 */
public class SagaHizalaTest {
    
    public SagaHizalaTest() {
    }

    /**
     * Test of hizala method, of class SagaHizala.
     */
    @Test
    public void testHizala() {
        JTextPane textarea = new JTextPane();
        SagaHizala instance = new SagaHizala();
        JTextPane expResult = textarea;
        JTextPane result = instance.hizala(textarea);
        assertEquals(expResult, result);
    }
    
}
