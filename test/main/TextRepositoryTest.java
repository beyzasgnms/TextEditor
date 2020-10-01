package main;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author isgun
 */
public class TextRepositoryTest {
    
    public TextRepositoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getWords method, of class TextRepository.
     */
    @Test
    public void testGetWords() {
        String text = "Merhaba, benim adım İsmail Gündüz.";
        TextRepository instance = new TextRepository();
        String[] expResult = {"Merhaba", "benim", "adım", "İsmail", "Gündüz"};
        String[] result = instance.getWords(text);
        assertArrayEquals(expResult, result);
    }
}
