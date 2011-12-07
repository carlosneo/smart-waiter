
public class Pedido {
 
	private int idPedido;
	private String status;
	private ItemPedido ip[] = new ItemPedido[100];
	private Mesa mesa;
	private Restaurante setor = null;

	static int i;
	
	private Pedido(Mesa mesa, int idPedido){
		this.mesa = mesa;
		this.status = "em andamento";
		this.setIdPedido(idPedido);
		System.out.println("Mesa " + this.mesa.getNumeroMesa() + " associada ao pedido");
	}
	
	public void inserirItem(Item item, int quantidade) {
		 i++;
		 ip[i] = ItemPedido.obterItemPedido(item, quantidade);
	}
	
	public void alterarStatus(Pedido p, String setor) {
		 this.setSetor(Restaurante.obterRestaurante().obterSetor(p, setor));
		 if(setor != null)
			 this.status="pendente";			 
	}
	
	public static Pedido novoPedido(Mesa mesa, int idPedido) {
		return new Pedido(mesa, idPedido);
	}
	
	public void itemDoPedido(int dPedido) {
	
	}
	 
	public void selecionarPedido(int idPedido) {
	 
	}
	 
	public void finalizarPedido(Pedido p) {
	 
	}
	 
	public int selecionar(int idPedido) {
		return 0;
	}
	
	
	//Getters and Setters
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

	public void setSetor(Restaurante setor) {
		this.setor = setor;
	}

	public Restaurante getSetor() {
		return setor;
	}

}
 
