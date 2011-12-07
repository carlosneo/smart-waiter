
public class Garcom extends FabricaPedido{
 
	private ControladoraPedido controladoraPedido;
	
	private Garcom(){
		super();
	}
	
	public static Garcom obterGarcom(){
		return new Garcom();
	}
	
	public static Pedido novoPedido(int numeroMesa){
		return null;
	}
	 
}
 
