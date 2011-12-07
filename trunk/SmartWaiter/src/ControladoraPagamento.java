
public class ControladoraPagamento {
 
	private static Pagamento pgto;
	private Mesa mesa;
	private Conta conta;
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
	 * Iniciar atributos de pgto - ok
	 */
	public void inciarPagamento(Mesa m) {
		this.mesa = m;
		this.conta = Conta.adicionarConta(m.getNumeroMesa());
		pgto = Pagamento.criarPagamento(m,this.conta);
		pgto.valor = pgto.conta.getValorTotal();
		System.out.println(pgto.toString());
	}
	
	/*
	 * O objeto pgto é retornado com o seu respectivo objeto especializado
	 * (Dinheiro ou Cartão)
	 */
	public void escolherFormaPagamento(String forma) {
		pgto = Pagamento.definirFormaPagamento(forma,mesa,conta);
		System.out.println(pgto.toString());
	}
	
	/*
	 * pgto.valor igual a valor da conta
	 */
	public void finalizarPagamento(Pagamento pgto) {
		this.pgto.pagar();
		System.out.println(this.pgto.toString());
	}
	 
}
 
