import java.util.Date;


public class Mesa {
 
	private int numeroMesa;
	private int capacidade;
	private boolean status;
	private Date dataAbertura;
	private Date dataFechamento;
	private Cliente cliente;
	private Pedido pedido[] = new Pedido[100];
	int i;
	
	public Mesa(int numeroMesa, boolean status){
		this.numeroMesa = numeroMesa;
		this.status = status;
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

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public Date getDataFechamento() {
		return dataFechamento;
	}

	public void setDataFechamento(Date dataFechamento) {
		this.dataFechamento = dataFechamento;
	}

	public void setPedido(Pedido pedido[]) {
		this.pedido = pedido;
	}

	public Pedido[] getPedido() {
		return pedido;
	}
}
 
