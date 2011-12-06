
public class Cartao extends Pagamento {
 
	static Cartao cartao;
	
	public void pagar() {
	 
	}
	
	public static Pagamento obterInstancia(){
		return cartao;
	}
	
	private Cartao() {
		Cartao.cartao = new Cartao();
	}
	 
}
 
