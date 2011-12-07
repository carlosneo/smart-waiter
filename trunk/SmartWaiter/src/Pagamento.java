
public abstract class Pagamento {
	
	Conta conta;
	ControladoraPagamento controladoraPagamento;
	
	float valor;
	Mesa mesa;
	static Pagamento pgto;
	
	public abstract void pagar();
	
	public static Pagamento definirFormaPagamento(String forma, Mesa m) {
		if(forma.equals("Dinheiro"))
			return pgto = new Dinheiro(m);
		else if(forma.equals("Cart‹o"))
			return pgto = new Cartao(m);
		
		return pgto = null;
	}
	
	public static Pagamento criarPagamento(Mesa m) {
		return pgto;
	}
}
 
