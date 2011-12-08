
public class ControladoraConta extends ControladoraDeUC{
 
	private Conta idItem;
	private Cliente cliente;
	private Conta conta;
	private Caixa caixa;
	
	public static ControladoraConta instanciaControladoraConta = null;
	
	static ControladoraConta obterControladoraConta() {
		if(instanciaControladoraConta == null)
			instanciaControladoraConta = new ControladoraConta();
		
		return instanciaControladoraConta;
	}
	
	private ControladoraConta(){};
	 
	public void iniciarFechamentoConta(Mesa mesa) {
		this.conta = Conta.adicionarConta(mesa);
	}
	 
	public void adicionarPedido(Pedido pedido, Conta c) {		
			c.inserirPedido(pedido);
	}
	 
	public void fecharConta(Conta c) {
	 
	}

	public Conta getIdItem() {
		return idItem;
	}

	public void setIdItem(Conta idItem) {
		this.idItem = idItem;
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

	public Caixa getCaixa() {
		return caixa;
	}

	public void setCaixa(Caixa caixa) {
		this.caixa = caixa;
	}

	public static ControladoraConta getInstanciaControladoraConta() {
		return instanciaControladoraConta;
	}

	public static void setInstanciaControladoraConta(
			ControladoraConta instanciaControladoraConta) {
		ControladoraConta.instanciaControladoraConta = instanciaControladoraConta;
	}
}
 
