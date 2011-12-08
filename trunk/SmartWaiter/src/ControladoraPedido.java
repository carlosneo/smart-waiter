
public class ControladoraPedido extends ControladoraDeUC{
 
	public static ControladoraPedido instanciaControladoraPedido = null;
	
	/*
	 * Construtor privado para implementacao do Singleton
	 */
	private ControladoraPedido(){};
	
	/*
	 * Implementacao do singleton na controladora dos pedidos
	 */
	static ControladoraPedido obterControladoraPedido(){
		if(instanciaControladoraPedido == null)
			instanciaControladoraPedido = new ControladoraPedido();
		
		return instanciaControladoraPedido;
	}
	
	@Override
	public Pedido iniciarPedido(Mesa mesa, int idPedido) {
		pei++;
		pedido[pei] = Pedido.novoPedido(mesa, idPedido);
		return pedido[pei];
	}
	
	@Override
	public void inserirNovoItem(Item item, int quantidade, Pedido p) {
		p.inserirItem(item, quantidade);
	}
	
	@Override
	public void finalizarPedido(Pedido p, String setor) {
		p.alterarStatus(p, setor);
	}
}
 
