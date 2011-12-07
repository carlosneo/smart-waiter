
public class ControladoraPedido {
 
	private Pedido pedido[] = new Pedido[100];

	static int i=-1;
	
	public static ControladoraPedido instanciaControladoraPedido = null;
	
	private ControladoraPedido(){
		
	}
	
	//Implementação do singleton na controladora dos pedidos
	public static ControladoraPedido obterControladoraPedido(){
		if(instanciaControladoraPedido == null)
			instanciaControladoraPedido = new ControladoraPedido();
		return instanciaControladoraPedido;
	}
	 
	public Pedido iniciarPedido(Mesa mesa) {
		i++;
		pedido[i] = Pedido.novoPedido(mesa);
		return pedido[i];
	}
	 
	public void inserirNovoItem(int idItem, int quantidade, Pedido p) {
	 
	}
	 
	public void finalizarPedido(Pedido p) {
	 
	}
	 
}
 
