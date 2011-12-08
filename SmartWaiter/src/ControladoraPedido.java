
public class ControladoraPedido extends ControladoraDeUC{
 
	private Pedido pedido[] = new Pedido[100];
	public static ControladoraPedido instanciaControladoraPedido = null;
	static int i;
	
	private ControladoraPedido(){};
	
	//Implementação do singleton na controladora dos pedidos
	static ControladoraPedido obterControladoraPedido(){
		if(instanciaControladoraPedido == null)
			instanciaControladoraPedido = new ControladoraPedido();
		
		return instanciaControladoraPedido;
	}
	 
	public Pedido iniciarPedido(Mesa mesa, int idPedido) {
		i++;
		pedido[i] = Pedido.novoPedido(mesa, idPedido);
		return pedido[i];
	}
	 
	public void inserirNovoItem(Item item, int quantidade, Pedido p) {
		p.inserirItem(item, quantidade);
	}
	
	public void finalizarPedido(Pedido p, String setor) {
		p.alterarStatus(p, setor);
	}
	 
}
 
