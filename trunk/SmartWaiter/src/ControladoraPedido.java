
public class ControladoraPedido {
 
	private Pedido pedido[] = new Pedido[100];
	public static ControladoraPedido instanciaControladoraPedido = null;
	static int i;
	
	private ControladoraPedido(){
		
	}
	
	//Implementação do singleton na controladora dos pedidos
	public static ControladoraPedido obterControladoraPedido(){
		if(instanciaControladoraPedido == null)
			instanciaControladoraPedido = new ControladoraPedido();
		return instanciaControladoraPedido;
	}
	 
	public Pedido iniciarPedido(Mesa mesa, String status, ItemPedido ip[], int idPedido) {
		i++;
		pedido[i] = Pedido.novoPedido(mesa, status, ip, idPedido);
		return pedido[i];
	}
	 
	public void inserirNovoItem(Item item, int quantidade, Pedido p) {
		p.inserirItem(item, quantidade);
	}
	 
	public void finalizarPedido(Pedido p) {
	 
	}
	 
}
 
