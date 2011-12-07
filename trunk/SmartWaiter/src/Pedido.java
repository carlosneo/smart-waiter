
public class Pedido {
 
	private int idPedido;
	private Pedido p;
	private String status;
	private ItemPedido ip[] = new ItemPedido[100];
	private Mesa mesa;
	private Item item;
	private Conta conta;
	private ControladoraPedido controladoraPedido;
	static int i;
	
	private Pedido(Mesa mesa, int idPedido){
		this.mesa = mesa;
		this.idPedido = idPedido;
		System.out.println("Mesa " + this.mesa.getNumeroMesa() + " associada ao pedido");
	}
	
	public ItemPedido inserirItem(Item item, int quantidade) {
		 i++;
		 this.item = item;
		 ip[i] = ItemPedido.obterItemPedido(item, quantidade);
		 return ip[i];
	}
	
	public void itemDoPedido(int dPedido) {
	
	}
		
	public static Pedido novoPedido(Mesa mesa, int idPedido) {
		return new Pedido(mesa, idPedido);
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

	public Pedido getP() {
		return p;
	}

	public void setP(Pedido p) {
		this.p = p;
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

	public ControladoraPedido getControladoraPedido() {
		return controladoraPedido;
	}

	public void setControladoraPedido(ControladoraPedido controladoraPedido) {
		this.controladoraPedido = controladoraPedido;
	}

	public static int getI() {
		return i;
	}

	public static void setI(int i) {
		Pedido.i = i;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public int getIdPedido() {
		return idPedido;
	}


}
 
