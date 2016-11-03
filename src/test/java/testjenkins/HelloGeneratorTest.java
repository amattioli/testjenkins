package testjenkins;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloGeneratorTest {

	@Test
	public void testGenerate() {
		HelloGenerator generator = new HelloGenerator("World");
		assertEquals("Hello World!", generator.generate());
	}
	
}
