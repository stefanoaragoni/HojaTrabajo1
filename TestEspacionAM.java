/**
*@author Stefano Aragoni y Roberto Vallecillos
*@Nombre TestEspacionAM.java 
*@Lenguaje Java
*@since 19/01/21
*/

//prueba JUnit 4
import static org.junit.Assert.*;

import org.junit.Test;

public class TestEspacionAM {

	@Test

	public void test() {
		Radio radio = new Radio();

		boolean output = radio.encenderApagar();
		boolean output2 = radio.amFm();
		double output1 = radio.avanzar();
		
		assertEquals(540.0,output1,0);
	}

}
