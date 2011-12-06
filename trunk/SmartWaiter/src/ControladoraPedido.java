
public class ControladoraPedido {
 
	private Pedido pedido;
	private Cliente cliente;
	private Garcom garcom;
	
	public static ControladoraPedido instanciaControladoraPedido = null;
	
	private ControladoraPedido(){
		
	}
	
	public static ControladoraPedido obterControladoraPedido(){
		if(instanciaControladoraPedido == null)
			instanciaControladoraPedido = new ControladoraPedido();
		return instanciaControladoraPedido;
	}
	 
	public Pedido iniciarPedido(int numeroMesa) {
		return null;
	}
	 
	public void inserirNovoItem(int idItem, int quantidade, Pedido p) {
	 
	}
	 
	public void finalizarPedido(Pedido p) {
	 
	}
	 
}
 
