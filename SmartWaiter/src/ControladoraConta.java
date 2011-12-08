
public class ControladoraConta extends ControladoraDeUC{
 
	private Conta idItem;
	private Cliente cliente;
	private Conta conta;
	private Caixa caixa;
	
	public static ControladoraConta instanciaControladoraConta = null;
	
	static ControladoraConta obterControladoraConta() {
		if(instanciaControladoraConta == null)
			instanciaControladoraConta = new ControladoraConta();
		
		return instanciaControladoraConta;
	}
	
	private ControladoraConta(){};
	 
	public void iniciarFechamentoConta(int numeroMesa) {
	 
	}
	 
	public void adicionarPedido(int idPedido, Conta c) {
	 
	}
	 
	public void fecharConta(Conta c) {
	 
	}

}
 
