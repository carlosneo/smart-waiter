
public class Cozinha extends Restaurante {
	
	private Pedido[] p;
	static private int i;
	static Restaurante instanciaCozinha = null;

	public Cozinha(Pedido p){
		
	}
	 
	public static Restaurante obterCozinha(Pedido p){
		if(instanciaCozinha == null)
			instanciaCozinha = new Cozinha(p);
		return instanciaCozinha;
	}
	
	@Override
	public void enviarPedido(Pedido p) {
		i++;
		this.p[i] = p;
	}
	 
}
 
