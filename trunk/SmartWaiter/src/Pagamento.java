
public abstract class Pagamento {

	private float valor;

	private Conta conta;

	private ControladoraPagamento controladoraPagamento;

	private Mesa mesa;

	public Pagamento Pagamento() {
		return null;
	}

	public Pagamento definirFormaPagamento(String forma) {
		return null;
	}

	public abstract void pagar();
}
