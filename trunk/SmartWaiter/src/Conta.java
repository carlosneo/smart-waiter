import java.sql.Time;
import java.util.Date;

public class Conta {

	private float valorTotal;
	private boolean status;
	private int[ ] idPedido;
	private int[ ] itemDoPedido;
	private Mesa mesa;
	private Pedido pedido[] = new Pedido[100];
	int i;
	int j;
	
	public Conta() {
		this.status = false;	
	}
	
	public static Conta adicionarConta(Mesa mesa) {
		return new Conta();
	}
	
	public void selecionarConta(Conta c) {
		
	}
	 
	public void inserirPedido(Pedido pedido) {
		this.pedido[i] = pedido;
	}
	 
	public float calcularValorTotal(Conta c) {
		return (Float) null;
	}
	 
	/*
	 * Getters and Setters
	 */

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int[] getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int[] idPedido) {
		this.idPedido = idPedido;
	}

	public int[] getItemDoPedido() {
		return itemDoPedido;
	}

	public void setItemDoPedido(int[] itemDoPedido) {
		this.itemDoPedido = itemDoPedido;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public void setPedido(Pedido pedido[]) {
		this.pedido = pedido;
	}

	public Pedido[] getPedido() {
		return pedido;
	}

}
 
