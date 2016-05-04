package cl.ubb.agil;

import static org.junit.Assert.assertFalse;
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
	
	@Test
	public void alAgregarElNumeroUnoLaPilaNoEstaVacia(){
		/*Arrange*/
		Pila stack = new Pila();
		/*Act*/
		stack.agregar(1);
		boolean correcto = stack.estaVacia();
		/*Assert*/
		assertFalse(correcto);
	}
	@Test
	public void alAgregarUnoYDosLaPilaNoEstaVacia(){
		/*Arrange*/
		Pila stack = new Pila();
		/*Act*/
		stack.agregar(1);
		stack.agregar(2);
		boolean correcto = stack.estaVacia();
		/*Assert*/
		assertFalse(correcto);
	}

}
