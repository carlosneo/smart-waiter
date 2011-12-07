
public class Bar extends Restaurante {
	
	private Pedido p[] = new Pedido[100];
	static Restaurante instanciaBar = null;
	static int i=0;
	
	public Bar(Pedido p){
		
	}
	
	public static Restaurante obterBar(Pedido p){
		if(instanciaBar == null)
			instanciaBar = new Bar(p);
		return instanciaBar;
	}
	 
	@Override
	public void enviarPedido(Pedido p) {
		i++;
		this.p[i] = p;
	}

}
 
