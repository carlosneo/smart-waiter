
public class Cartao extends Pagamento {
	
	public Cartao(Mesa m, Conta c) {
		super(m,c);
	}

	public void pagar() {
		this.valor = conta.getValorTotal();
	}

	@Override
	public String toString() {
		return "Cartao [valor=" + valor + ", conta=" + conta + ", mesa=" + mesa + "]";
	}
}
 
