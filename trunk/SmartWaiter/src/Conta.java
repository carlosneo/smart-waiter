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
	 
	private int [ ] itemDoPedido;
	 
	private Mesa m;
	 
	private Mesa mesa;
	 
	private Pagamento pagamento;
	 
	private Pedido pedido;
	
	private ControladoraConta controladoraConta;
	 
	public Conta Conta(int numeroMesa) {
		return null;
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
	 
}
 
