
public class Pedido {
 
	private int idPedido;
	private String status;
	private int[ ] idItemPedido;
	private Mesa mesa;
	private Item item;
	private Conta conta;
	private ItemPedido itemPedido;
	private ControladoraPedido controladoraPedido;
	
	private Pedido(Mesa mesa){
		this.mesa = mesa;
		System.out.println("Mesa associada ao pedido");
	}

	public static Pedido novoPedido(Mesa mesa) {
		return new Pedido(mesa);
	}
	 
	public void selecionarPedido(int idPedido) {
	 
	}
	 
	public void inserirItem(int idItem, int quantidade) {
	 
	}
	 
	public void finalizarPedido(Pedido p) {
	 
	}
	 
	public void alterarStatus(Pedido p) {
	 
	}
	 
	public int selecionar(int idPedido) {
		return 0;
	}
	 
	public int itemDoPedido(int dPedido) {
		return 0;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int[] getIdItemPedido() {
		return idItemPedido;
	}

	public void setIdItemPedido(int[] idItemPedido) {
		this.idItemPedido = idItemPedido;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public ItemPedido getItemPedido() {
		return itemPedido;
	}

	public void setItemPedido(ItemPedido itemPedido) {
		this.itemPedido = itemPedido;
	}

	public ControladoraPedido getControladoraPedido() {
		return controladoraPedido;
	}

	public void setControladoraPedido(ControladoraPedido controladoraPedido) {
		this.controladoraPedido = controladoraPedido;
	}
	
}
 
