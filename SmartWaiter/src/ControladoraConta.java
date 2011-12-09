
public class ControladoraConta extends ControladoraDeUC{
	
	public static ControladoraConta instanciaControladoraConta = null;
	
	/*
	 * Construtor privado para implementacao do Singleton
	 */
	private ControladoraConta(){};
	
	static ControladoraConta obterControladoraConta() {
		if(instanciaControladoraConta == null)
			instanciaControladoraConta = new ControladoraConta();
		
		return instanciaControladoraConta;
	}
	
	/*
	 * Foi criada uma inst‰ncia Conta conta
	 * conta foi asssociada a uma Mesa mesa
	 */
	@Override
	public void iniciarFechamentoConta(Mesa mesa) {
		this.conta = Conta.adicionarConta(mesa);
	}
	
	/*
	 * O pedido pedido Ž associado a Conta c
	 * O idPedido foi atribuido ao c.idPedidos[i]
	 */
	@Override
	public void adicionarPedido(Pedido pedido, Conta c) {
		this.conta = c;
		conta.inserirPedido(pedido);
	}
	
	/*
	 *  
	 */
	@Override
	public void fecharConta(Conta c) {}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public static ControladoraConta getInstanciaControladoraConta() {
		return instanciaControladoraConta;
	}

	public static void setInstanciaControladoraConta(
			ControladoraConta instanciaControladoraConta) {
		ControladoraConta.instanciaControladoraConta = instanciaControladoraConta;
	}
}
 
