
public class FabricaPedido {

	String nome;
	static int CLIENTE = 1;
	static int GARCOM = 2;
	
	static Pedido pedido[];
	int numeroMesa;
	
	int i;
	
	public static FabricaPedido fabricaDePedido(int ator){
		if(ator == CLIENTE)
			return Cliente.obterCliente();
		else if(ator == GARCOM)
			return Garcom.obterGarcom();
		else
			return null;
	}
		
	public Pedido obterNovoPedido(){
		pedido[i] = Pedido.obterPedido();
		i++;
		return pedido[i];
	}
}
