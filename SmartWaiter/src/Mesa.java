
public class Mesa {
 
	private int numeroMesa;
	private int capacidade;
	private boolean status;
	private Cliente cliente;
	private Conta conta;
	private Pedido pedido;
	private Restaurante restaurante;
	private Pagamento pagamento;
	
	public Mesa(int numeroMesa, boolean status){
		this.numeroMesa = numeroMesa;
		this.status = status;
		this.conta = Conta.adicionarConta(numeroMesa);
	}

	public static Mesa obterMesa(int numeroMesa, boolean status) {
		return new Mesa(numeroMesa, status);
	}
	
	public int getNumeroMesa() {
		return numeroMesa;
	}

	public void setNumeroMesa(int numeroMesa) {
		this.numeroMesa = numeroMesa;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Restaurante getRestaurante() {
		return restaurante;
	}

	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

}
 
