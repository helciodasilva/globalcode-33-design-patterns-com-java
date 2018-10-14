
public class DespachantePedido {
	
	GeradorDeRemessaVisitor remessaVisitor = new GeradorDeRemessaVisitor();

	public void despachar(Pedido pedido) {
		pedido.accept(remessaVisitor);
	}

}