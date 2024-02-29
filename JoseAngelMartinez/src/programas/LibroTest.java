package programas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LibroTest {

	@Test
	void testGetTitulo() {
		Libro libro1 = new Libro ("Escrito en el agua",100);
		String  titulo = libro1.getTitulo();
		assertEquals("Escrito en el agua",titulo);
	}

	@Test
	void testSetTitulo() {
		Libro libro1 = new Libro ("",100);
		libro1.setTitulo("Romeo y Julieta");	
		assertEquals("Romeo y Julieta",libro1.getTitulo());
	}

	@Test
	void testAgregarPaginas() {
		Libro libro1 = new Libro ("Escrito en el agua",100);
		libro1.agregarPaginas(400);
		assertEquals(500,libro1.getNumeroDePaginas());
	}

	@Test
	void testQuitarPaginas() {
		Libro libro1 = new Libro ("Escrito en el agua",100);
		libro1.quitarPaginas(20);
		assertEquals(80,libro1.getNumeroDePaginas());
	}

}
