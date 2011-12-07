
public abstract class Pagamento {
	
	private float valor;
	private Conta conta;
	private Mesa mesa;
	private ControladoraPagamento controladoraPagamento;
	
	public abstract void pagar();
	
	/**
	 * MŽtodo responsavel
	 * @param forma = string da forma de pagamento
	 * @return 
	 */
	public static Pagamento definirFormaPagamento(String forma) {
		if(forma.equals("Dinheiro"))
			return new Dinheiro();
		else if(forma.equals("Cart‹o"))
			return new Cartao();
		
		return null;
	}
	
	/**
	 * 
	 * @return
	 */
	public Pagamento criarPagamento() {
		return null;
	}
}
 
