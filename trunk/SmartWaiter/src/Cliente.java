
public class Cliente  {
 
	private Mesa mesa; 
	private ControladoraPedido controladoraPedido;
	private ControladoraConta controladoraConta;
	
	private Cliente(){
		
	}
	
	public static Cliente obterCliente(){
		return new Cliente();
	}
}
 
