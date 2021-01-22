/**
*@author Stefano Aragoni y Roberto Vallecillos
*@Nombre TestAMFM.java 
*@Lenguaje Java
*@since 19/01/21
*/

//prueba JUnit 1
import static org.junit.Assert.*;

import org.junit.Test;

public class TestAMFM {

	@Test
	public void test() {
		Radio radio = new Radio();
		boolean output = radio.amFm();
		assertEquals(true,output);

	}

}
