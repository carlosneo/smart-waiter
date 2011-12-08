
public abstract class ControladoraDeUC {

	static int CONTA = 1;
	static int PEDIDO = 2;
	static int PAGAMENTO = 3;

	Pagamento pgto[] = new Pagamento[100];
	Mesa mesa;
	Conta conta;
	static int i;
	
	public static ControladoraDeUC obterControladora(int tipoControladora){
		if(tipoControladora==CONTA)
			return ControladoraConta.obterControladoraConta();
		else if(tipoControladora==PEDIDO)
			return ControladoraPedido.obterControladoraPedido();
		else if(tipoControladora==PAGAMENTO)
			return ControladoraPagamento.obterControladoraPagamento();
		else
			return null;
	}

	/*
	 * Metodos da Controladora de Pagamento
	 */
	public void inciarPagamento(Mesa m) {};
	public void escolherFormaPagamento(String forma) {};
	public void finalizarPagamento() {};
}
