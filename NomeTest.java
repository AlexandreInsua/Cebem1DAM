package plataforma;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Alexandre Insua Moreira
 *
 */
public class NomeTest {

	@Test
	public final void testMostrarNome() {
		Nome proba = new Nome();
		String c = "proba";
		assertEquals(proba.mostrarNome(c), "proba");

		c = "proba proba";
		assertEquals(proba.mostrarNome(c), "proba proba");

		c = "proba1";
		assertEquals(proba.mostrarNome(c), "proba1");

		c = "proba!";
		assertEquals(proba.mostrarNome(c), "proba!");
	}

	@Test
	public final void testMostrarLonxitude() {
		Nome proba = new Nome();
		String c = "proba";
		assertEquals(proba.mostrarLonxitude(c), 5);

		c = "";
		assertEquals(proba.mostrarLonxitude(c), 0);

		c = "proba proba";
		assertEquals(proba.mostrarLonxitude(c), 11);

		c = " ";
		assertEquals(proba.mostrarLonxitude(c), 1);
	}

	@Test
	public final void testAMaiusculas() {
		Nome proba = new Nome();
		String c = "proba";
		assertEquals(proba.aMaiusculas(c), "PROBA");

		c = "proba proba";
		assertEquals(proba.aMaiusculas(c), "PROBA PROBA");

		c = " proba ! proba ";
		assertEquals(proba.aMaiusculas(c), " PROBA ! PROBA ");
	}

	@Test
	public final void testInverter() {
		Nome proba = new Nome();
		String c = "proba";
		assertEquals(proba.inverter(c), "aborp");

		c = "proba proba ";
		assertEquals(proba.inverter(c), " aborp aborp");
	}
}
