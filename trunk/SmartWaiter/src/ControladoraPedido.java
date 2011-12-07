
public class ControladoraPedido {
 
	private static Pedido pedido[];
	private Cliente cliente;
	private Garcom garcom;

	static int i=0;
	
	public static ControladoraPedido instanciaControladoraPedido = null;
	
	private ControladoraPedido(){
		
	}
	
	public static ControladoraPedido obterControladoraPedido(){
		if(instanciaControladoraPedido == null)
			instanciaControladoraPedido = new ControladoraPedido();
		return instanciaControladoraPedido;
	}
	 
	public Pedido iniciarPedido(int numeroMesa) {
		pedido[i] = Pedido.obterPedido();
		
		i++;
		return null;
	}
	 
	public void inserirNovoItem(int idItem, int quantidade, Pedido p) {
	 
	}
	 
	public void finalizarPedido(Pedido p) {
	 
	}
	 
}
 
