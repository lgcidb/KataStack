package cl.ubb.agil;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PilaTest {
	
	@Test
	public void laPilaEstaVacia(){
		/*Arrange*/
		Pila stack = new Pila();
		/*Act*/
		boolean correcto = stack.estaVacia();
		/*Assert*/
		assertTrue(correcto);
	}

}
