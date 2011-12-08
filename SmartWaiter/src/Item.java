
public class Item {
 
	private int idItem;
	private DescricaoItem descricaoItem;
	private String tipo;
	
	public Item(int idItem){
		this.idItem = idItem;
	}
	
	public static Item adicionarItem(int idItem) {
		return new Item(idItem);
	}

	//Getters and setters
	public int getIdItem() {
		return idItem;
	}

	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}

	public DescricaoItem getDescricaoItem() {
		return descricaoItem;
	}

	public void setDescricaoItem(DescricaoItem descricaoItem) {
		this.descricaoItem = descricaoItem;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}
	
}
 
