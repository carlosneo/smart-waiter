
public class Cartao extends Pagamento {
	
	public void pagar() {
		System.out.println("Realizando pagamento com Cart‹o!");
	}
	
	public Cartao(Mesa m) {
		this.mesa = m;
		this.toString();
	}

	@Override
	public String toString() {
		return "Cartao [valor=" + valor + ", conta=" + conta + ", mesa=" + mesa
				+ "]";
	}
}
 
