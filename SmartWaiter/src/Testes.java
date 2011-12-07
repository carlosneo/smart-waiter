import static org.junit.Assert.*;

import org.junit.Test;


public class Testes {

	@Test
	public void testControladoraPagamento() {
		Mesa m = new Mesa();
		ControladoraPagamento cp = ControladoraPagamento.obterControladoraPagamento();
		cp.inciarPagamento(m);
		cp.escolherFormaPagamento();
		//cp.finalizarPagamento(pgto);
		System.out.println();
	}

}
