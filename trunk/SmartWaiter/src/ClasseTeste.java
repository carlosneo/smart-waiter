import org.junit.Assert;
import org.junit.Test;

public class ClasseTeste {

	@Test
	public void testeSingletonControladoras(){
		ControladoraConta c1 = ControladoraConta.obterControladoraConta();
		ControladoraConta c2 = ControladoraConta.obterControladoraConta();
		
		Assert.assertSame(c1, c2);
		
		ControladoraPagamento c3 = ControladoraPagamento.obterControladoraPagamento();
		ControladoraPagamento c4 = ControladoraPagamento.obterControladoraPagamento();
		
		Assert.assertSame(c3, c4);
		
		ControladoraPedido c5 = ControladoraPedido.obterControladoraPedido();
		ControladoraPedido c6 = ControladoraPedido.obterControladoraPedido();
		
		Assert.assertSame(c5, c6);
	}
	
	@Test
	public void testeIniciarPedido(){
		Mesa mesa = Mesa.obterMesa(1, true);
		ControladoraPedido ctrlPedido = ControladoraPedido.obterControladoraPedido();
		Pedido p = ctrlPedido.iniciarPedido(mesa, "pendente", null ,0);
		
		//Testes na operação iniciarPedido()
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
		ControladoraPedido ctrlPedido = ControladoraPedido.obterControladoraPedido();
		Pedido p = ctrlPedido.iniciarPedido(mesa, "pendente", null, 0);
		Item item = Item.adicionarItem(1);
		int quantidade = 2;
		
		ctrlPedido.inserirNovoItem(item, quantidade, p);
		
		//Testes na operação de inserirNovoItem()
		Assert.assertNotNull(p.getIp());
		Assert.assertTrue(ItemPedido.class.isInstance(p.getIp()[1]));
		Assert.assertEquals(quantidade, p.getIp()[1].getQuantidade());
		Assert.assertEquals(p.getIp()[1].getItem(), item);
		Assert.assertEquals(p.getIp()[1].getItem().getDescricaoItem(), item.getDescricaoItem());
	}
	
	@Test
	public void testeFinalizarPedido(){
		
	}
}
