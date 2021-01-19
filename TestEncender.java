/**
*@author Stefano Aragoni y Roberto Vallecillos
*@Nombre TestEncender.java 
*@Lenguaje Java
*@since 19/01/21
*/

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEncender {

	@Test
	public void test() {
		
		Radio radio = new Radio();
		boolean output = radio.encenderApagar();
		assertEquals(true,output);

		
	}

}
