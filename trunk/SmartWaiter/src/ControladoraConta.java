
public class ControladoraConta {
 
	private Conta idItem;
	private Cliente cliente;
	private Conta conta;
	private Caixa caixa;
	
	public static ControladoraConta instanciaControladoraConta = null;
	
	private ControladoraConta(){
		
	}
	
	public static ControladoraConta obterControladoraConta(){
		if(instanciaControladoraConta == null)
			instanciaControladoraConta = new ControladoraConta();
		return instanciaControladoraConta;
	}
	 
	public void iniciarFechamentoConta(int numeroMesa) {
	 
	}
	 
	public void adicionarPedido(int idPedido, Conta c) {
	 
	}
	 
	public void fecharConta(Conta c) {
	 
	}
	 
}
 
