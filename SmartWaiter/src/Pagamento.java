
public class Pagamento {
	
	float valor;
	Conta conta;
	Mesa mesa;
	
	public void pagar() {};
	
	public static Pagamento definirFormaPagamento(String forma, Mesa m, Conta c) {
		if(forma.equals("Dinheiro"))
			return new Dinheiro(m,c);
		else if(forma.equals("Cart‹o"))
			return new Cartao(m,c);
		
		return null;
	}
	
	public static Pagamento criarPagamento(Mesa m, Conta c) {
		return new Pagamento(m, c);
	}

	public Pagamento(Mesa m, Conta c) {
		this.mesa = m;
		this.conta = c;
	}
	
	@Override
	public String toString() {
		return "Pagamento [valor=" + valor + ", conta=" + conta + ", mesa=" + mesa + "]";
	}
	
}
 
