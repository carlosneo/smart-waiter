
public class Restaurante {
 
	private String nome;
	private String endereco;
	private Cozinha cozinha;
	private Bar bar;
	private Mesa mesa;
	private DescricaoItem descricaoItem;
	public static Restaurante instanciaRestaurante = null;
	
	public Restaurante(){
	
	}
	
	public static Restaurante obterRestaurante(){
		if(instanciaRestaurante == null)
			instanciaRestaurante = new Restaurante();
		return instanciaRestaurante;
	}
	 
	public Restaurante obterSetor(Pedido p, String setor){
		if(setor == "cozinha")
			return Cozinha.obterCozinha(p);
		else if(setor == "bar")
			return Bar.obterBar(p);
		else
			return null;
	}
	
	public void enviarPedido(Pedido p) {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Cozinha getCozinha() {
		return cozinha;
	}

	public void setCozinha(Cozinha cozinha) {
		this.cozinha = cozinha;
	}

	public Bar getBar() {
		return bar;
	}

	public void setBar(Bar bar) {
		this.bar = bar;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public DescricaoItem getDescricaoItem() {
		return descricaoItem;
	}

	public void setDescricaoItem(DescricaoItem descricaoItem) {
		this.descricaoItem = descricaoItem;
	}

	public static Restaurante getInstanciaRestaurante() {
		return instanciaRestaurante;
	}

	public static void setInstanciaRestaurante(Restaurante instanciaRestaurante) {
		Restaurante.instanciaRestaurante = instanciaRestaurante;
	}	 
	
}
 
