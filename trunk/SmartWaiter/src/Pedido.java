
public class Pedido {
 
	private Pedido p;
	private String status;
	private ItemPedido ip[] = new ItemPedido[100];
	private Mesa mesa;
	private Item item;
	private Conta conta;
	private ItemPedido itemPedido;
	private ControladoraPedido controladoraPedido;
	static int i = -1;
	
	private Pedido(Mesa mesa){
		this.mesa = mesa;
		System.out.println("Mesa associada ao pedido");
	}

	public void itemDoPedido(int dPedido, int quantidade) {
		i++;
		
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

	public static int getI() {
		return i;
	}

	public static void setI(int i) {
		Pedido.i = i;
	}


}
 
