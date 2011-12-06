
public class ControladoraPagamento {
 
	private Pagamento pgto;
	private Pagamento pagamento;
	private Caixa caixa;
	
	public static ControladoraPagamento instanciaControladoraPagamento = null;
	
	private ControladoraPagamento(){
		
	}
	
	public static ControladoraPagamento obterControladoraPagamento(){
		if(instanciaControladoraPagamento == null)
			instanciaControladoraPagamento = new ControladoraPagamento();
		return instanciaControladoraPagamento;
	}
	 
	public void inciarPagamento(int numeroMesa) {
	 
	}
	 
	public void escolherFormaPagamento() {
	 
	}
	 
	public void finalizarPagamento(Pagamento PGTO) {
	 
	}
	 
}
 
