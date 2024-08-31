package pl.enux.maventestproject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Maciej Nux Jaros
 */
public class JupiterNbTest {

	public JupiterNbTest() {
	}

	/**
	 * Test of preparePath method, of class JupiterNb.
	 */
	@Test
	public void testPreparePath_shouldBeEmpty() {
		String str = "";
		Integer id = 123;
		String expResult = "nn-123";
		String result = JupiterNb.preparePath(str, id);
		assertEquals(expResult, result);
	}

	/**
	 * Test of preparePath method, of class JupiterNb.
	 */
	@Test
	public void testPreparePath_shouldGenerate() {
		Integer id = 123;
		String expected = "a-b-123";
		assertEquals(expected, JupiterNb.preparePath("a____b", id));
		assertEquals(expected, JupiterNb.preparePath("a----b", id));
		assertEquals(expected, JupiterNb.preparePath("a<>';&?#&%:_b", id));
		assertEquals(expected, JupiterNb.preparePath("a$@^_b", id));
	}
}
