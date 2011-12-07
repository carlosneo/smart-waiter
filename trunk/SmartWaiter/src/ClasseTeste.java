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
		Pedido p = ctrlPedido.iniciarPedido(mesa);
		
		//Testes na operação iniciarPedido
		Assert.assertNotNull(p);
		Assert.assertTrue(Pedido.class.isInstance(p));
	}
	
	
}
