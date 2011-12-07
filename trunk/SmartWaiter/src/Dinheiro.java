
public class Dinheiro extends Pagamento {
	
	public void pagar() {
		System.out.println("Realizando pagamento com Dinheiro!");
	}
	
	public Dinheiro(Mesa m) {
		this.mesa = m;
		this.toString();
	}

	@Override
	public String toString() {
		return "Dinheiro [valor=" + valor + ", conta=" + conta + ", mesa="
				+ mesa + "]";
	}
}
 
