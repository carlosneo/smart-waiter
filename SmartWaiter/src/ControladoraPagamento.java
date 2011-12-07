
public class ControladoraPagamento {
 
	private static Pagamento pgto;
	public static ControladoraPagamento instanciaControladoraPagamento = null;
	
	/*
	 * Construtor privado para implementa��o do Singleton
	 */
	private ControladoraPagamento(){}
	
	/*
	 * Implementa��o do m�todo Singleton
	 */
	public static ControladoraPagamento obterControladoraPagamento(){
		if(instanciaControladoraPagamento == null)
			instanciaControladoraPagamento = new ControladoraPagamento();
		
		return instanciaControladoraPagamento;
	}
	/*
	 * Foi criada uma inst�ncia pgto de Pagamento - ok
	 * A inst�ncia de pgto � associada a Mesa m - ok
	 * A inst�ncia pgto recebe valorTotal da Conta - ok
	 * Iniciar atributos de pgto  
	 */
	public void inciarPagamento(Mesa m) {
		pgto = Pagamento.criarPagamento(m);
		pgto.valor = Conta.adicionarConta(m.getNumeroMesa()).getValorTotal();
	}
	
	/*
	 * O objeto pgto � retornado com o seu respectivo objeto especializado
	 * (Dinheiro ou Cart�o)
	 */
	public void escolherFormaPagamento() {
		//pgto = Pagamento.definirFormaPagamento("Cart�o", mesa);
	}
	
	/*
	 * pgto.valor igual a valor da conta
	 */
	public void finalizarPagamento(Pagamento pgto) {
		pgto = this.pgto;
		pgto.pagar();
	}
	 
}
 
