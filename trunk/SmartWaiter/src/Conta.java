import java.sql.Time;
import java.util.Arrays;
import java.util.Date;


public class Conta {
 
	private Date dataAbertura;
	 
	private Date dataFechamento;
	 
	private Time horaAbertura;
	 
	private Time horaFechamento;
	 
	private float valorTotal;
	 
	private boolean status;
	 
	private int[ ] idPedido;
	 
	private int [ ] itemDoPedido;
	 
	private Mesa m;
	 
	private Mesa mesa;
	 
	private Pagamento pagamento;
	 
	private Pedido pedido;
	
	private ControladoraConta controladoraConta;
	 
	public Conta(int numeroMesa) {
		this.valorTotal = 100.0f; 
		this.status = true;
		for(int i=0;i<10;i++){
			this.idPedido[i] = i;
			this.itemDoPedido[i] = i*2;
		}
		this.m = new Mesa();
		this.mesa = new Mesa();
		this.pagamento = Pagamento.definirFormaPagamento("Dinheiro");
		this.pedido = null;
	}
	 
	public void selecionarConta(Conta c) {
	 
	}
	 
	public void inserirPedido(int idPedido) {
	 
	}
	 
	public float calcularValorTotal(Conta c) {
		return 0;
	}
	 
	public Conta adicionarConta(int numeroMesa) {
		return null;
	}

	@Override
	public String toString() {
		return "Conta [dataAbertura=" + dataAbertura + ", dataFechamento="
				+ dataFechamento + ", horaAbertura=" + horaAbertura
				+ ", horaFechamento=" + horaFechamento + ", valorTotal="
				+ valorTotal + ", status=" + status + ", idPedido="
				+ Arrays.toString(idPedido) + ", itemDoPedido="
				+ Arrays.toString(itemDoPedido) + ", m=" + m + ", mesa=" + mesa
				+ ", pagamento=" + pagamento + ", pedido=" + pedido
				+ ", controladoraConta=" + controladoraConta + "]";
	}
	
	
}
 
