
public class Dinheiro extends Pagamento {
 
	static Dinheiro dinheiro;
	
	public void pagar() {
	 
	}

	public static Pagamento obterInstancia(){
		return dinheiro;
	}
	
	private Dinheiro() {
		Dinheiro.dinheiro = new Dinheiro();
	}
	
	
	 
}
 
