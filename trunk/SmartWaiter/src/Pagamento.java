
public class Pagamento {
	
	float valor;
	Conta conta;
	Mesa mesa;
	
	public void pagar() {}
	
	public static Pagamento definirFormaPagamento(String forma, Mesa m) {
		if(forma.equals("Dinheiro"))
			return new Dinheiro();
		else if(forma.equals("Cart‹o"))
			return new Cartao();
		
		return null;
	}
	
	public static Pagamento criarPagamento(Mesa m) {
		return new Pagamento(m);
	}

	public Pagamento(Mesa m) {
		this.mesa = m;
	}

	@Override
	public String toString() {
		return "Pagamento [valor=" + valor + ", mesa=" + mesa + "]";
	}
}
 
