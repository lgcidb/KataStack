package cl.ubb.agil;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PilaTest {
	
	private Pila stack;
	@Before
	public void setup(){
		
	}
	
	@Test
	public void laPilaEstaVacia(){
		/*Arrange*/
		stack = new Pila();
		/*Act*/
		boolean correcto = stack.estaVacia();
		/*Assert*/
		assertTrue(correcto);
	}
	
	@Test
	public void alAgregarElNumeroUnoLaPilaNoEstaVacia(){
		/*Arrange*/
		stack = new Pila();
		/*Act*/
		stack.agregar(1);
		boolean correcto = stack.estaVacia();
		/*Assert*/
		assertFalse(correcto);
	}
	@Test
	public void alAgregarUnoYDosLaPilaNoEstaVacia(){
		/*Arrange*/
		stack = new Pila();
		/*Act*/
		stack.agregar(1);
		stack.agregar(2);
		boolean correcto = stack.estaVacia();
		/*Assert*/
		assertFalse(correcto);
	}
	@Test
	public void alAgregarUnoYDosElTamnioDeLaPilaEsDos(){
		stack = new Pila();
		/*Act*/
		stack.agregar(1);
		stack.agregar(2);
		int tam = stack.tamanio;
		/*Assert*/
		assertThat(tam,is(2));
	}
	@Test
	public void alAgregarunUnoYHacerPopDevuelveUnUno(){
		stack = new Pila();
		/*Act*/
		stack.agregar(1);
		int pop = stack.pop();
		/*Assert*/
		assertThat(pop,is(1));
	}

}
