
public abstract class Restaurante {
 
	private String nome;
	 
	private String endereco;
	 
	private Cozinha cozinha;
	 
	private Bar bar;
	 
	private Mesa mesa;
	 
	private DescricaoItem descricaoItem;
	 
	public abstract Restaurante obterSetor(String setor, Pedido p);
	public void enviarPedido(Pedido p) {
	 
	}
	 
}
 
