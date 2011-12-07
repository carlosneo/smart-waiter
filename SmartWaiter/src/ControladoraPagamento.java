
public class ControladoraPagamento {
 
	private static Pagamento pgto;
	private Mesa mesa;
	
	public static ControladoraPagamento instanciaControladoraPagamento = null;
	
	private ControladoraPagamento(){	
	}
	
	public static ControladoraPagamento obterControladoraPagamento(){
		if(instanciaControladoraPagamento == null)
			instanciaControladoraPagamento = new ControladoraPagamento();
		
		return instanciaControladoraPagamento;
	}
	 
	public void inciarPagamento(Mesa m) {
		this.mesa = m;
		pgto = Pagamento.criarPagamento(m);
	}
	 
	public void escolherFormaPagamento() {
		pgto = Pagamento.definirFormaPagamento("Cart‹o", mesa);
	}
	 
	public void finalizarPagamento(Pagamento pgto) {
		pgto = this.pgto;
		pgto.pagar();
	}
	 
}
 
