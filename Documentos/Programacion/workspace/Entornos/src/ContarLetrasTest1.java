import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import JUnit.ContarLetras;

public class ContarLetrasTest1 {
	
	ContarLetras l;

	@Before
	public void before()
	{
		System.out.println("Ejecutando Before");
		l = new ContarLetras();
	}

	@Test
	public void test() {
		System.out.println("Ejecutando Test1");
		int resultado = l.contar_letras("hola",'a');
		int esperado = 1;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void test2() {
		System.out.println("Ejecutando Test2");
		int resultado = l.contar_letras("osobuco",'o');
		int esperado = 3;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void test3() {
		System.out.println("Ejecutando Test3");
		int resultado = l.contar_letras("caca de vaca",' ');
		int esperado = 2;
		assertEquals(esperado, resultado);
	}
	
}
