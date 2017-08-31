package pilha;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class test_pilha {
	
	private Pilha p;
	
	@Before
	public void inicializaPilha() {
		p = new Pilha(10);
	}

	@Test
	public void pilha_vazia() {
		assertTrue(p.esta_vazia());
		assertEquals(0, p.tamanho());
	}
	
	@Test
	public void empilhaumelemento() {
		p.empilha("primeiro");
		assertFalse(p.esta_vazia());
		assertEquals(1, p.tamanho());
		assertEquals("primeiro", p.topo());
	}
	
	@Test
	public void empilha_desempilha() {
		p.empilha("primeiro");
		p.empilha("segundo");
		assertFalse(p.esta_vazia());
		assertEquals(2, p.tamanho());
		Object desempilhado = p.desempilha();
		assertEquals("primeiro", p.topo());
		assertEquals("segundo", desempilhado);
	}
	
	@Test(expected=PilhaVaziaException.class)
	public void removeDaPilhaVazia() {
		p.desempilha();
	}
	
	@Test
	public void adicionaNaPilhaCheia() {
		for(int i=0; i<10; i++) {
			p.empilha("emento"+i);
		}
		
		try {
			p.empilha("boom");
			fail();
		} catch (PilhaCheiaException e) {
		}
	}

}
