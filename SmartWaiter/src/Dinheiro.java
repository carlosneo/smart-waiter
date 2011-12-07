
public class Dinheiro extends Pagamento {
	
	public Dinheiro(Mesa m, Conta c) {
		super(m,c);
	}
	
	@Override
	public void pagar() {
		this.valor = conta.getValorTotal();
	}

	@Override
	public String toString() {
		return "Dinheiro [valor=" + valor + ", conta=" + conta + ", mesa=" + mesa + "]";
	}
}
 
