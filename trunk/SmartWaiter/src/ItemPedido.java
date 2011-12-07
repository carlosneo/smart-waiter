
public class ItemPedido {
 
	private int quantidade;
	private Item item;
	private Pedido pedido;
	private DescricaoItem descricaoItem;
	 
	private ItemPedido(Item item, int quantidade){
		System.out.println();
		this.item = item;
		this.quantidade = quantidade;
	}
	
	public int selecionaItem(Item item, int quantidade) {
		return 0;
	}
	
	public static ItemPedido obterItemPedido(Item item, int quantidade){
		return new ItemPedido(item, quantidade);
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public DescricaoItem getDescricaoItem() {
		return descricaoItem;
	}

	public void setDescricaoItem(DescricaoItem descricaoItem) {
		this.descricaoItem = descricaoItem;
	}
	 
}
 
