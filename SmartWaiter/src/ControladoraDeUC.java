
public abstract class ControladoraDeUC {

	static int CONTA = 1;
	static int PEDIDO = 2;
	static int PAGAMENTO = 3;

	public Pedido pedido[] = new Pedido[100];
	public Pagamento pgto[] = new Pagamento[100];
	public Mesa mesa;
	public Conta conta;
	static int pi;
	static int ci;
	static int pei;
	
	public static ControladoraDeUC obterControladora(int tipoControladora){
		if(tipoControladora==CONTA)
			return ControladoraConta.obterControladoraConta();
		else if(tipoControladora==PEDIDO)
			return ControladoraPedido.obterControladoraPedido();
		else if(tipoControladora==PAGAMENTO)
			return ControladoraPagamento.obterControladoraPagamento();
		else
			return null;
	}

	/*
	 * Metodos da Controladora de Pagamento
	 */
	public void inciarPagamento(Mesa m) {};
	public void escolherFormaPagamento(String forma) {};
	public void finalizarPagamento() {};
	/*
	 * Metodos da Controladora de Pedido
	 */
	public Pedido iniciarPedido(Mesa mesa, int idPedido) {return null;};
	public void inserirNovoItem(Item item, int quantidade, Pedido p) {};
	public void finalizarPedido(Pedido p, String setor) {}

	public Pedido[] getPedido() {
		return pedido;
	}

	public void setPedido(Pedido[] pedido) {
		this.pedido = pedido;
	}

	public Pagamento[] getPgto() {
		return pgto;
	}

	public void setPgto(Pagamento[] pgto) {
		this.pgto = pgto;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	};
}
