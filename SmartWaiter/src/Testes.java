import junit.framework.Assert;
import org.junit.Test;


public class Testes {

	@Test
	public void testeIniciarPagamento() {
		Mesa mesa = Mesa.obterMesa(1, true);
		ControladoraPagamento cp = ControladoraPagamento.obterControladoraPagamento();
		cp.inciarPagamento(mesa);
		
		Assert.assertNotNull(cp.getPgto());
		Assert.assertTrue(Pagamento.class.isInstance(cp.getPgto()[1]));
		Assert.assertEquals(cp.getPgto()[1].mesa.getNumeroMesa(), 1);
		Assert.assertEquals(cp.getPgto()[1].valor, cp.getPgto()[1].conta.getValorTotal());
		Assert.assertNotNull(cp.getPgto()[1].conta);
		Assert.assertNotNull(cp.getPgto()[1].valor);
		Assert.assertNotNull(cp.getPgto()[1].mesa);
		System.out.println();
	}
	
	@Test
	public void testeEscolherFormaPagamento(){
		Mesa mesa = Mesa.obterMesa(1, true);
		ControladoraPagamento cp = ControladoraPagamento.obterControladoraPagamento();
		cp.inciarPagamento(mesa);
		cp.escolherFormaPagamento("Dinheiro");
		
		Assert.assertNotNull(cp.getPgto());
		Assert.assertTrue(Pagamento.class.isInstance(cp.getPgto()[1]));
		
		cp.escolherFormaPagamento("Cart�o");
		
		Assert.assertNotNull(cp.getPgto());
		Assert.assertTrue(Pagamento.class.isInstance(cp.getPgto()[1]));
		System.out.println();
	}

	@Test
	public void testeFinalizarPagamento(){
		Mesa mesa = Mesa.obterMesa(1, true);
		ControladoraPagamento cp = ControladoraPagamento.obterControladoraPagamento();
		cp.inciarPagamento(mesa);
		cp.escolherFormaPagamento("Dinheiro");
		cp.finalizarPagamento();
		
		Assert.assertNotNull(cp.getPgto());
		Assert.assertTrue(Pagamento.class.isInstance(cp.getPgto()[1]));
		Assert.assertEquals(cp.getPgto()[1].valor, cp.getPgto()[1].conta.getValorTotal());
		System.out.println();
	}
}
