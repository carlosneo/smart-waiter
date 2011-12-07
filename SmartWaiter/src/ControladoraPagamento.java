
public class ControladoraPagamento {
 
	private static Pagamento pgto;
	public static ControladoraPagamento instanciaControladoraPagamento = null;
	
	/*
	 * Construtor privado para implementação do Singleton
	 */
	private ControladoraPagamento(){}
	
	/*
	 * Implementação do método Singleton
	 */
	public static ControladoraPagamento obterControladoraPagamento(){
		if(instanciaControladoraPagamento == null)
			instanciaControladoraPagamento = new ControladoraPagamento();
		
		return instanciaControladoraPagamento;
	}
	/*
	 * Foi criada uma instância pgto de Pagamento - ok
	 * A instância de pgto é associada a Mesa m - ok
	 * A instância pgto recebe valorTotal da Conta - ok
	 * Iniciar atributos de pgto  
	 */
	public void inciarPagamento(Mesa m) {
		pgto = Pagamento.criarPagamento(m);
		pgto.valor = Conta.adicionarConta(m.getNumeroMesa()).getValorTotal();
	}
	
	/*
	 * O objeto pgto é retornado com o seu respectivo objeto especializado
	 * (Dinheiro ou Cartão)
	 */
	public void escolherFormaPagamento() {
		//pgto = Pagamento.definirFormaPagamento("Cartão", mesa);
	}
	
	/*
	 * pgto.valor igual a valor da conta
	 */
	public void finalizarPagamento(Pagamento pgto) {
		pgto = this.pgto;
		pgto.pagar();
	}
	 
}
 
