
public class Pedido {
 
	private int idPedido;
	private String status;
	private ItemPedido ip[] = new ItemPedido[100];
	private Mesa mesa;

	static int i;
	
	private Pedido(Mesa mesa, String status, ItemPedido ip[], int idPedido){
		this.mesa = mesa;
		this.status = status;
		this.ip = ip;
		this.setIdPedido(idPedido);
		System.out.println("Mesa " + this.mesa.getNumeroMesa() + " associada ao pedido");
	}
	
	public void inserirItem(Item item, int quantidade) {
		 i++;
		 ip[i] = ItemPedido.obterItemPedido(item, quantidade);
	}
	
	public void itemDoPedido(int dPedido) {
	
	}
		
	public static Pedido novoPedido(Mesa mesa, String status, ItemPedido[] ip, int idPedido) {
		return new Pedido(mesa, status, ip, idPedido);
	}
	 
	public void selecionarPedido(int idPedido) {
	 
	}
	 
	public void finalizarPedido(Pedido p) {
	 
	}
	 
	public void alterarStatus(Pedido p) {
	 
	}
	 
	public int selecionar(int idPedido) {
		return 0;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ItemPedido[] getIp() {
		return ip;
	}

	public void setIp(ItemPedido[] ip) {
		this.ip = ip;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public int getIdPedido() {
		return idPedido;
	}

}
 
