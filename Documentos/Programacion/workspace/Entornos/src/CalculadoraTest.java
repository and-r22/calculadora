import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	
Calculadora c;

	@Before
	public void before()
	{
		System.out.println("Ejecutando Before");
		c = new Calculadora();
	}
	
	@Test
	public void SumaTest() {
		System.out.println("Ejecutando SumaTest");
		int resultado = c.Suma(2,  3);
		int esperado = 5;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void RestaTest() {
		System.out.println("Ejecutando RestaTest");
		int resultado = c.Resta(6,  2);
		int esperado = 4;
		assertEquals(esperado, resultado);
	}

	@Test
	public void MultiTest() {
		System.out.println("Ejecutando MultiTest");
		int resultado = c.Multi(3,  2);
		int esperado = 6;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void DivTest() {
		System.out.println("Ejecutando DivTest");
		int resultado = c.Div(6,  2);
		int esperado = 3;
		assertEquals(esperado, resultado);
	}
	
}
