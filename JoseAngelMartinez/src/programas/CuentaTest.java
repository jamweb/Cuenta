package programas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuentaTest {

	@Test
	void testGetSaldo() {
		Cuenta cuenta1 = new Cuenta ("ES2109988684983498248912",100);
		float saldo = cuenta1.getSaldo();
		assertEquals(100,saldo);
	}

	@Test
	void testSetSaldo() {
		Cuenta cuenta1 = new Cuenta ("ES2109988684983498248912",0);
		cuenta1.setSaldo(100);	
		assertEquals(90,cuenta1.getSaldo());
	}

	@Test
	void testIngresarDinero() {
		Cuenta cuenta1 = new Cuenta ("ES2109988684983498248912",100);
		cuenta1.ingresarDinero(400);
		assertEquals(500,cuenta1.getSaldo());
	}

	@Test
	void testExtraerDinero() {
		Cuenta cuenta1 = new Cuenta ("ES2109988684983498248912",100);
		cuenta1.extraerDinero(20);
		assertEquals(80,cuenta1.getSaldo());
	}

}
