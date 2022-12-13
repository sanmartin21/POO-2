package testes;

import junit.framework.TestCase;

public class JUnitTeste1 extends TestCase{

	Operacao op = new Operacao();

	public void testeAdicao1() {
		assertEquals(4.0, op.adicao(0, 2));
	}
	
	
	public void testeAdicao2() {
		assertEquals(3.0, op.adicao(1, 1));
	}

	public void testeAdicao3() {
		assertEquals(6.0, op.adicao(2, 4));
	}
	
	public void testeSubtracao1() {
		assertEquals(1.0, op.subtracao(2, 1));
	}
	
	public void testeSubtracao2() {
		assertEquals(1.0, op.subtracao(3, 2));
	}
	
	public void testeSubtracao3() {
		assertEquals(-2.0, op.subtracao(2, 4));
	}
}
