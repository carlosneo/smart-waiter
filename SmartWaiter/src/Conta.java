import java.sql.Time;
import java.util.Date;


public class Conta {
 
	private Date dataAbertura;
	private Date dataFechamento;
	private Time horaAbertura;
	private Time horaFechamento;
	private float valorTotal;
	private boolean status;
	private int[ ] idPedido;
	private int[ ] itemDoPedido;
	private Mesa m;
	private Mesa mesa;
	private Pagamento pagamento;
	private Pedido pedido;
	private ControladoraConta controladoraConta;
	
	public Conta(int numeroMesa) {
		this.valorTotal = (float) 100.0;
	}
	 
	public void selecionarConta(Conta c) {
		
	}
	 
	public void inserirPedido(int idPedido) {
		
	}
	 
	public float calcularValorTotal(Conta c) {
		return this.valorTotal = (float) 123.79;
	}
	 
	public static Conta adicionarConta(int numeroMesa) {
		return new Conta(numeroMesa);
	}

	/*
	 * Getters and Setters
	 */
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

	public Time getHoraAbertura() {
		return horaAbertura;
	}

	public void setHoraAbertura(Time horaAbertura) {
		this.horaAbertura = horaAbertura;
	}

	public Time getHoraFechamento() {
		return horaFechamento;
	}

	public void setHoraFechamento(Time horaFechamento) {
		this.horaFechamento = horaFechamento;
	}

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

	public Mesa getM() {
		return m;
	}

	public void setM(Mesa m) {
		this.m = m;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public ControladoraConta getControladoraConta() {
		return controladoraConta;
	}

	public void setControladoraConta(ControladoraConta controladoraConta) {
		this.controladoraConta = controladoraConta;
	}
}
 
