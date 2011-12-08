
public class ControladoraPagamento extends ControladoraDeUC{
 
	private Pagamento pgto[] = new Pagamento[100];
	static int i;
	private Mesa mesa;
	private Conta conta;
	public static ControladoraPagamento instanciaControladoraPagamento = null;
	
	/*
	 * Construtor privado para implementa��o do Singleton
	 */
	private ControladoraPagamento(){};
	
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
		i++;
		this.mesa = m;
		this.conta = Conta.adicionarConta(m.getNumeroMesa());
		pgto[i] = Pagamento.criarPagamento(m,this.conta);
		pgto[i].valor = pgto[i].conta.getValorTotal();
		System.out.println(pgto[i].toString());
	}
	
	/*
	 * O objeto pgto � retornado com o seu respectivo objeto especializado
	 * (Dinheiro ou Cart�o) - ok
	 */
	public void escolherFormaPagamento(String forma) {
		pgto[i] = Pagamento.definirFormaPagamento(forma,mesa,conta);
		System.out.println(pgto[i].toString());
	}
	
	/*
	 * pgto.valor igual a valor da conta - ok
	 */
	public void finalizarPagamento() {
		pgto[i].pagar();
		System.out.println(pgto[i].toString());
	}

	/*
	 * Getters and Setters
	 */
	
	public Pagamento[] getPgto() {
		return pgto;
	}

	public void setPgto(Pagamento[] pgto) {
		this.pgto = pgto;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}
}
 
