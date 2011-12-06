
public abstract class Pagamento {
 
	private float valor;
	 
	private Conta conta;
	 
	private Mesa mesa;
	 
	private ControladoraPagamento controladoraPagamento;
	 
	public static Pagamento definirFormaPagamento(String forma) {
		if(forma.equals("Dinheiro"))
			return Dinheiro.obterInstancia();
		else if(forma.equals("Cart‹o"))
			return Cartao.obterInstancia();
		
		return null;
	}
	 
	public abstract void pagar();
	public Pagamento criarPagamento() {
		return null;
	}
	 
}
 
