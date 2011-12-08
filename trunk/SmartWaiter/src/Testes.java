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
		 * Pr�-condi��o conta fechada
		 */
		Assert.assertEquals(cp.getPgto()[1].conta.isStatus(), fechado);
		/*
		 * P�s-condi��es
		 * - Inst�ncia de Pagamento
		 * - Inst�ncia de Pagamento associada a Mesa
		 * - Inst�ncia de Pagamento recebe valorTotal da Conta
		 * - Inicia os atributos da inst�ncia de Pagamento
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
		 * Pr�-condi��o existe uma inst�ncia de Pagamento
		 */
		Assert.assertNotNull(cp.getPgto());
		/*
		 * P�s-condi��o
		 * - Cria��o do objeto especializado de Pagamento (Dinheiro)
		 */
		Assert.assertTrue(Pagamento.class.isInstance(cp.getPgto()[1]));

		formaPag="Cart�o";
		cp.escolherFormaPagamento(formaPag);

		/*
		 * Pr�-condi��o existe uma inst�ncia de Pagamento
		 */
		Assert.assertNotNull(cp.getPgto());
		/*
		 * P�s-condi��o
		 * - Cria��o do objeto especializado de Pagamento (Cart�o)
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
		 * Pr�-condi��o existe um objeto PGTO : Pagamento instanciado
		 */
		Assert.assertNotNull(cp.getPgto());
		Assert.assertTrue(Pagamento.class.isInstance(cp.getPgto()[1]));
		/*
		 * P�s-condi��o
		 * - O valor do objeto PGTO tornou Conta valorTotal
		 */
		Assert.assertEquals(cp.getPgto()[1].valor, cp.getPgto()[1].conta.getValorTotal());
		System.out.println();
	}
}
