import org.junit.Assert;
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
}
