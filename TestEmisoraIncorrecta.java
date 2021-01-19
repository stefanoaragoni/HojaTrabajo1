/**
*@author Stefano Aragoni y Roberto Vallecillos
*@Nombre TestEmisoraIncorrecta.java 
*@Lenguaje Java
*@since 19/01/21
*/

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmisoraIncorrecta {

	@Test
	public void test() {
		Radio radio = new Radio();

		boolean output = radio.encenderApagar();
		double output1 = radio.avanzar();
		
		assertEquals(540.0,output1,0);
	}

}
