
public class ControladoraPagamento extends ControladoraDeUC{
 
	public static ControladoraPagamento instanciaControladoraPagamento = null;
	
	/*
	 * Construtor privado para implementação do Singleton
	 */
	private ControladoraPagamento(){};
	
	/*
	 * Implementação do método Singleton
	 */
	public static ControladoraPagamento obterControladoraPagamento(){
		if(instanciaControladoraPagamento == null)
			instanciaControladoraPagamento = new ControladoraPagamento();
		
		return instanciaControladoraPagamento;
	}
	/*
	 * Foi criada uma instancia pgto de Pagamento - ok
	 * A instancia de pgto e associada a Mesa m - ok
	 * A instancia pgto recebe valorTotal da Conta - ok
	 * Iniciar atributos de pgto - ok
	 */
	@Override
	public void inciarPagamento(Mesa m) {
		pi++;
		this.mesa = m;
		this.conta = Conta.adicionarConta(m.getNumeroMesa());
		pgto[pi] = Pagamento.criarPagamento(m,this.conta);
		pgto[pi].valor = pgto[pi].conta.getValorTotal();
		System.out.println(pgto[pi].toString());
	}
	
	/*
	 * O objeto pgto e retornado com o seu respectivo objeto especializado
	 * (Dinheiro ou Cartao) - ok
	 */
	@Override
	public void escolherFormaPagamento(String forma) {
		pgto[pi] = Pagamento.definirFormaPagamento(forma,mesa,conta);
		System.out.println(pgto[pi].toString());
	}
	
	/*
	 * pgto.valor igual a valor da conta - ok
	 */
	@Override
	public void finalizarPagamento() {
		pgto[pi].pagar();
		System.out.println(pgto[pi].toString());
	}
}
 
