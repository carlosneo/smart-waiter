
public abstract class Pagamento {
 
	private float valor;
	 
	private Conta conta;
	 
	private Mesa mesa;
	 
	private ControladoraPagamento controladoraPagamento;
	 
	public Pagamento Pagamento() {
		return null;
	}
	 
	public Pagamento definirFormaPagamento(String forma) {
		return null;
	}
	 
	public abstract void pagar();
	public Pagamento criarPagamento() {
		return null;
	}
	 
}
 
