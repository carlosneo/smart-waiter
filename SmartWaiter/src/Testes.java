import junit.framework.Assert;
import org.junit.Test;


public class Testes {
	
	static final int PAGAMENTO = 3;
	
	@Test
	public void testeIniciarPagamento() {
		Mesa mesa = Mesa.obterMesa(1, true);
		ControladoraDeUC cp = ControladoraDeUC.obterControladora(PAGAMENTO);

		cp.inciarPagamento(mesa);
		boolean fechado = true;
		cp.getPgto()[1].conta.setStatus(fechado);
		
		/*
		 * Pre-condicao conta fechada
		*/
		Assert.assertEquals(cp.getPgto()[1].conta.isStatus(), fechado);
		/*
		 * Pos-condicao
		 * - Instancia de Pagamento
		 * - Instancia de Pagamento associada a Mesa
		 * - Instancia de Pagamento recebe valorTotal da Conta
		 * - Inicia os atributos da instancia de Pagamento
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
		ControladoraDeUC cp = ControladoraDeUC.obterControladora(PAGAMENTO);
		cp.inciarPagamento(mesa);
		String formaPag;
		
		formaPag="Dinheiro";
		cp.escolherFormaPagamento(formaPag);
		
		/*
		 * Pre-condicao existe uma instancia de Pagamento
		 */
		Assert.assertNotNull(cp.getPgto());
		/*
		 * Pos-condicao
		 * - Criacao do objeto especializado de Pagamento (Dinheiro)
		 */
		Assert.assertTrue(Pagamento.class.isInstance(cp.getPgto()[1]));

		formaPag="Cart‹o";
		cp.escolherFormaPagamento(formaPag);

		/*
		 * Pre-condicao existe uma instancia de Pagamento
		 */
		Assert.assertNotNull(cp.getPgto());
		/*
		 * Pos-condicao
		 * - Criacao do objeto especializado de Pagamento (Cartao)
		 */
		Assert.assertTrue(Pagamento.class.isInstance(cp.getPgto()[1]));
		System.out.println();
	}

	@Test
	public void testeFinalizarPagamento(){
		Mesa mesa = Mesa.obterMesa(1, true);
		ControladoraDeUC cp = ControladoraDeUC.obterControladora(PAGAMENTO);
		cp.inciarPagamento(mesa);
		String formaPag = "Dinheiro";
		cp.escolherFormaPagamento(formaPag);
		cp.finalizarPagamento();
		
		/*
		 * Pre-condicao existe um objeto PGTO : Pagamento instanciado
		 */
		Assert.assertNotNull(cp.getPgto());
		Assert.assertTrue(Pagamento.class.isInstance(cp.getPgto()[1]));
		/*
		 * Pos-condicao
		 * - O valor do objeto PGTO tornou Conta valorTotal
		 */
		Assert.assertEquals(cp.getPgto()[1].valor, cp.getPgto()[1].conta.getValorTotal());
		System.out.println();
	}
}
