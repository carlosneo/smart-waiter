import junit.framework.Assert;
import org.junit.Test;

public class ClasseTeste {

	static final int CONTA = 1;
	static final int PEDIDO = 2;
	static final int PAGAMENTO = 3;
	
	@Test
	public void testeSingletonControladoras(){
		ControladoraDeUC c1 = ControladoraDeUC.obterControladora(CONTA);
		ControladoraDeUC c2 = ControladoraDeUC.obterControladora(CONTA);
		
		Assert.assertSame(c1, c2);
		
		ControladoraDeUC c3 = ControladoraDeUC.obterControladora(PAGAMENTO);
		ControladoraDeUC c4 = ControladoraDeUC.obterControladora(PAGAMENTO);
		
		Assert.assertSame(c3, c4);
		
		ControladoraDeUC c5 = ControladoraDeUC.obterControladora(PEDIDO);
		ControladoraDeUC c6 = ControladoraDeUC.obterControladora(PEDIDO);
		
		Assert.assertSame(c5, c6);
	}
	
	@Test
	public void testeIniciarPedido(){
		Mesa mesa = Mesa.obterMesa(1, true);
		ControladoraDeUC ctrlPedido = ControladoraDeUC.obterControladora(PEDIDO);
		Pedido p = ctrlPedido.iniciarPedido(mesa, 0);
		
		/*
		 * Pre-condicao
		 * - Existe uma mesa aberta
		 */
		Assert.assertEquals(p.getMesa().isStatus(), true);
		
		/*
		 * Testes na operacao iniciarPedido()
		 */
		Assert.assertNotNull(p);
		Assert.assertTrue(Pedido.class.isInstance(p));
		Assert.assertTrue(Mesa.class.isInstance(p.getMesa()));
		Assert.assertNotNull(p.getStatus());
		Assert.assertNotNull(p.getMesa());
		Assert.assertNotNull(p.getIdPedido());
		Assert.assertNotNull(p.getIp());
	}
	
	@Test
	public void testeInserirNovoItem(){
		Mesa mesa = Mesa.obterMesa(2, true);
		ControladoraDeUC ctrlPedido = ControladoraDeUC.obterControladora(PEDIDO);
		Pedido p = ctrlPedido.iniciarPedido(mesa, 0);
		Item item = Item.adicionarItem(1);
		int quantidade = 2;
		
		ctrlPedido.inserirNovoItem(item, quantidade, p);
		
		/*
		 * Testes na operacao de inserirNovoItem()
		 */
		Assert.assertNotNull(p.getIp());
		Assert.assertTrue(ItemPedido.class.isInstance(p.getIp()[1]));
		Assert.assertEquals(quantidade, p.getIp()[1].getQuantidade());
		Assert.assertEquals(p.getIp()[1].getItem(), item);
		Assert.assertEquals(p.getIp()[1].getItem().getDescricaoItem(), item.getDescricaoItem());
	}
	
	@Test
	public void testeFinalizarPedido(){
		Mesa mesa = Mesa.obterMesa(2, true);
		ControladoraDeUC ctrlPedido = ControladoraDeUC.obterControladora(PEDIDO);
		Pedido p = ctrlPedido.iniciarPedido(mesa, 0);
		String setor = "cozinha";
		
		ctrlPedido.finalizarPedido(p, setor);
		
		/*
		 * Testes na operacao de finalizarPedido()
		 */
		Assert.assertEquals("pendente", p.getStatus());
		Assert.assertSame(p.getSetor(), Restaurante.obterRestaurante().obterSetor(p, setor));
	}
	
	@Test
	public void testeIniciarFechamentoConta(){
		ControladoraDeUC ctrlConta = ControladoraDeUC.obterControladora(CONTA);
		Mesa mesa = Mesa.obterMesa(1, true);
		Pedido p = new Pedido(mesa, 1);
		ctrlConta.iniciarFechamentoConta(mesa);
		
		/*
		 * Pre-condicao
		 * - A mesa deve possuir pedidos associados
		 */
		Assert.assertNotNull(mesa);
		Assert.assertNotNull(p);
		Assert.assertTrue(Mesa.class.isInstance(p.getMesa()));
		/*
		 * Pos-condica
		 * - Foi criada uma instancia c de Conta
		 * - Conta foi associada a Mesa mesa
		 */
		Assert.assertNotNull(ctrlConta.getConta());
		Assert.assertTrue(Mesa.class.isInstance(ctrlConta.getConta().getMesa()));
	}
	
	@Test
	public void testeAdicionarPedido(){
		ControladoraDeUC ctrlConta = ControladoraDeUC.obterControladora(CONTA);
		Mesa mesa = Mesa.obterMesa(1, true);
		Pedido p = new Pedido(mesa, 1);
		ctrlConta.iniciarFechamentoConta(mesa);
		
		
	}
	
	@Test
	public void testeIniciarPagamento() {
		Mesa mesa = Mesa.obterMesa(1, true);
		ControladoraDeUC cp = ControladoraDeUC.obterControladora(PAGAMENTO);

		cp.inciarPagamento(mesa);
		boolean fechado = true;
		cp.getPgto()[1].conta.setStatus(fechado);
		
		/*
		 * Pre-condicao 
		 * - Conta fechada
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
		 * Pre-condicao 
		 * - Existe uma instancia de Pagamento
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
		 * Pre-condicao 
		 * - Existe uma instancia de Pagamento
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
		 * Pre-condicao 
		 * - Existe um objeto PGTO : Pagamento instanciado
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
