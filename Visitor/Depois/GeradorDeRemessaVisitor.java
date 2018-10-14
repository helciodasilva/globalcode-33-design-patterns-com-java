
public class GeradorDeRemessaVisitor implements PedidoVisitor {

	public void visit(PedidoExport pedido) {
		pedido.setRemessa(new RemessaFedex());
	}

	public void visit(PedidoPF pedido) {
		pedido.setRemessa(new RemessaSedex());
	}

	public void visit(PedidoSimplesRemessa pedido) {
		pedido.setRemessa(new RemessaTransportadora());
	}

	public void visit(Pedido pedido) {
		pedido.setRemessa(new Remessa());
	}
	
}