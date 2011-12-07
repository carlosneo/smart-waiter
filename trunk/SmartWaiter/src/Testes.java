import static org.junit.Assert.*;

import org.junit.Test;


public class Testes {

	@Test
	public void testControladoraPagamento() {
		Mesa mesa = Mesa.obterMesa(1, true);
		ControladoraPagamento cp = ControladoraPagamento.obterControladoraPagamento();
		cp.inciarPagamento(mesa);
		
	}

}
