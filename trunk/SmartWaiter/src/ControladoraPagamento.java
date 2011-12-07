
public class ControladoraPagamento {
 
	private static Pagamento pgto;
	private Mesa mesa;
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
	 * Iniciar atributos de pgto - ok
	 */
	public void inciarPagamento(Mesa m) {
		this.mesa = m;
		pgto = Pagamento.criarPagamento(m);
		pgto.conta = Conta.adicionarConta(m.getNumeroMesa());
		pgto.valor = Conta.adicionarConta(m.getNumeroMesa()).getValorTotal();
		System.out.println(pgto.toString());
	}
	
	/*
	 * O objeto pgto � retornado com o seu respectivo objeto especializado
	 * (Dinheiro ou Cart�o)
	 */
	public void escolherFormaPagamento() {
		pgto = Pagamento.definirFormaPagamento("Dinheiro", mesa);
	}
	
	/*
	 * pgto.valor igual a valor da conta
	 */
	public void finalizarPagamento(Pagamento pgto) {
		pgto = this.pgto;
		pgto.pagar();
	}
	 
}
 
