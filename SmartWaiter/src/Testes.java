import junit.framework.Assert;
import org.junit.Test;


public class Testes {

	@Test
	public void testeIniciarPagamento() {
		Mesa mesa = Mesa.obterMesa(1, true);
		ControladoraPagamento cp = ControladoraPagamento.obterControladoraPagamento();
		cp.inciarPagamento(mesa);
		boolean fechado = true;
		cp.getPgto()[1].conta.setStatus(fechado);
		
		/*
		 * Pré-condição conta fechada
		 */
		Assert.assertEquals(cp.getPgto()[1].conta.isStatus(), fechado);
		/*
		 * Pós-condições
		 * - Instância de Pagamento
		 * - Instância de Pagamento associada a Mesa
		 * - Instância de Pagamento recebe valorTotal da Conta
		 * - Inicia os atributos da instância de Pagamento
		 */
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
		String formaPag;
		
		formaPag="Dinheiro";
		cp.escolherFormaPagamento(formaPag);
		
		/*
		 * Pré-condição existe uma instância de Pagamento
		 */
		Assert.assertNotNull(cp.getPgto());
		/*
		 * Pós-condição
		 * - Criação do objeto especializado de Pagamento (Dinheiro)
		 */
		Assert.assertTrue(Pagamento.class.isInstance(cp.getPgto()[1]));

		formaPag="Cart‹o";
		cp.escolherFormaPagamento(formaPag);

		/*
		 * Pré-condição existe uma instância de Pagamento
		 */
		Assert.assertNotNull(cp.getPgto());
		/*
		 * Pós-condição
		 * - Criação do objeto especializado de Pagamento (Cartão)
		 */
		Assert.assertTrue(Pagamento.class.isInstance(cp.getPgto()[1]));
		System.out.println();
	}

	@Test
	public void testeFinalizarPagamento(){
		Mesa mesa = Mesa.obterMesa(1, true);
		ControladoraPagamento cp = ControladoraPagamento.obterControladoraPagamento();
		cp.inciarPagamento(mesa);
		String formaPag = "Dinheiro";
		cp.escolherFormaPagamento(formaPag);
		cp.finalizarPagamento();
		
		/*
		 * Pré-condição existe um objeto PGTO : Pagamento instanciado
		 */
		Assert.assertNotNull(cp.getPgto());
		Assert.assertTrue(Pagamento.class.isInstance(cp.getPgto()[1]));
		/*
		 * Pós-condição
		 * - O valor do objeto PGTO tornou Conta valorTotal
		 */
		Assert.assertEquals(cp.getPgto()[1].valor, cp.getPgto()[1].conta.getValorTotal());
		System.out.println();
	}
}
