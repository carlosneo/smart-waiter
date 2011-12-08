
public class DescricaoItem {
 
	private String nome;
	private float preco;
	private String descricao;
	private Item item;
	private Restaurante restaurante;
	private ItemPedido itemPedido;
	 
	public float pegaPreco(int idItem) {
		return this.preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Restaurante getRestaurante() {
		return restaurante;
	}

	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}

	public ItemPedido getItemPedido() {
		return itemPedido;
	}

	public void setItemPedido(ItemPedido itemPedido) {
		this.itemPedido = itemPedido;
	}
}
 
